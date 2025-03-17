/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;

/**
 *
 * @author Pedro Almeida
 */
public class Temperatura { 
    // Conversão de Temperatura
    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equals("C") && unidadeDestino.equals("F")) {
            return (valor * 9/5) + 32;
        } else if (unidadeOrigem.equals("C") && unidadeDestino.equals("K")) {
            return valor + 273.15;
        } else if (unidadeOrigem.equals("F") && unidadeDestino.equals("C")) {
            return (valor - 32) * 5/9;
        } else if (unidadeOrigem.equals("F") && unidadeDestino.equals("K")) {
            return (valor - 32) * 5/9 + 273.15;
        } else if (unidadeOrigem.equals("K") && unidadeDestino.equals("C")) {
            return valor - 273.15;
        } else if (unidadeOrigem.equals("K") && unidadeDestino.equals("F")) {
            return (valor - 273.15) * 9/5 + 32;
        }
        return valor; // Se as unidades forem iguais
    }
    
}
