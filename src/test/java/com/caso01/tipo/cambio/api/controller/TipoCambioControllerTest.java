/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso01.tipo.cambio.api.controller;

import com.caso01.tipo.cambio.api.dto.TipoCambioDTO;
import com.caso01.tipo.cambio.api.service.TipoCambioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


// Importaciones omitidas para brevedad
@AutoConfigureMockMvc
class TipoCambioControllerTest {

    @InjectMocks
    private TipoCambioController tipoCambioController;

    @Mock
    private TipoCambioService tipoCambioService;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);  // Inicializar los mocks

        mockMvc = MockMvcBuilders.standaloneSetup(tipoCambioController).build();
    }

    @Test
    void realizarTipoCambio() throws Exception {
        // Configuración de datos de prueba
        TipoCambioDTO tipoCambioDTO = new TipoCambioDTO();
        tipoCambioDTO.setMonto(100.0);
        tipoCambioDTO.setMonedaOrigen("USD");
        tipoCambioDTO.setMonedaDestino("EUR");
        tipoCambioDTO.setTipoCambio(1.5);

        // Realizar la solicitud a través del controlador y verificar el resultado
        mockMvc.perform(MockMvcRequestBuilders.post("/tipo-cambio/realizar")
                .content("{\"monto\":100.0,\"monedaOrigen\":\"USD\",\"monedaDestino\":\"EUR\",\"tipoCambio\":1.5}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Tipo de cambio realizado"))
                .andDo(print());
    }

    // Otros métodos de prueba para otros endpoints del controlador
}


