/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.caso01.tipo.cambio.api.dto;

import lombok.Data;

@Data
public class TipoCambioDTO {
    private Double monto;
    private String monedaOrigen;
    private String monedaDestino;
    private Double tipoCambio;
}

