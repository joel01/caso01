/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso01.tipo.cambio.api.service;

import com.caso01.tipo.cambio.api.dto.TipoCambioDTO;
import org.springframework.stereotype.Service;

@Service
public class TipoCambioService {

    // Método para realizar un tipo de cambio
    public void realizarTipoCambio(TipoCambioDTO tipoCambioDTO) {
        
        double montoConvertido = tipoCambioDTO.getMonto() * tipoCambioDTO.getTipoCambio();
        System.out.println("Tipo de cambio realizado. Monto convertido: " + montoConvertido);

       
    }

    // Método para buscar un tipo de cambio
    public double buscarTipoCambio(String monedaOrigen, String monedaDestino) {
       
        return 1.5; 
    }

    // Otros métodos para el registro, actualización, y más según tus requisitos
}