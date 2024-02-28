/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso01.tipo.cambio.api.controller;

import com.caso01.tipo.cambio.api.dto.TipoCambioDTO;
import com.caso01.tipo.cambio.api.service.TipoCambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tipo-cambio")
public class TipoCambioController {

    private final TipoCambioService tipoCambioService;

    @Autowired
    public TipoCambioController(TipoCambioService tipoCambioService) {
        this.tipoCambioService = tipoCambioService;
    }

    @PostMapping("/realizar")
    public String realizarTipoCambio(@RequestBody TipoCambioDTO tipoCambioDTO) {
        // Lógica para realizar el tipo de cambio
        tipoCambioService.realizarTipoCambio(tipoCambioDTO);
        return "Tipo de cambio realizado";
    }

    @GetMapping("/buscar")
    public String buscarTipoCambio(@RequestParam String monedaOrigen, @RequestParam String monedaDestino) {
        // Lógica para buscar el tipo de cambio
        tipoCambioService.buscarTipoCambio(monedaOrigen, monedaDestino);
        return "Tipo de cambio encontrado";
    }

    // Otros métodos para el registro y actualización
}

