package com.mycompany.conversorunidades;
import java.util.Scanner;

   
    public class ConversorUnidades {
        
         // Conversão de Temperatura
    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("c") && unidadeDestino.equalsIgnoreCase("f")) {
            return valor * 1.8 + 32; // Celcius para Fahrenheit
        } else if (unidadeOrigem.equalsIgnoreCase("c") && unidadeDestino.equalsIgnoreCase("k")) {
            return valor + 273.15; // Celcius para Kelvin
        } else if (unidadeOrigem.equalsIgnoreCase("f") && unidadeDestino.equalsIgnoreCase("c")) {
            return (valor - 32) / 1.8; // Fahrenheit para Celcius
        } else if (unidadeOrigem.equalsIgnoreCase("f") && unidadeDestino.equalsIgnoreCase("k")) {
            return (valor - 32) / 1.8 + 273.15; // Fahrenheit para Kelvin
        } else if (unidadeOrigem.equalsIgnoreCase("k") && unidadeDestino.equalsIgnoreCase("c")) {
            return valor - 273.15; // Kelvin para Celcius
        } else if (unidadeOrigem.equalsIgnoreCase("k") && unidadeDestino.equalsIgnoreCase("f")) {
            return (valor - 273.15) * 1.8 + 32; // Kelvin para Fahrenheit
        } else {
            throw new IllegalArgumentException("Unidades inválidas para conversão de temperatura!");
        }
    }

    // Conversão de Distância
    public static double converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("m") && unidadeDestino.equalsIgnoreCase("q")) {
            return valor / 1000; // Metros para quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("m") && unidadeDestino.equalsIgnoreCase("mi")) {
            return valor / 1609.34; // Metros para milhas
        } else if (unidadeOrigem.equalsIgnoreCase("m") && unidadeDestino.equalsIgnoreCase("yd")) {
            return valor * 1.09361; // Metros para jardas
        } else if (unidadeOrigem.equalsIgnoreCase("km") && unidadeDestino.equalsIgnoreCase("m")) {
            return valor * 1000; // Quilometros para metros
        } else if (unidadeOrigem.equalsIgnoreCase("km") && unidadeDestino.equalsIgnoreCase("mi")) {
            return valor / 1.60934; // Quilometros para milhas
        } else if (unidadeOrigem.equalsIgnoreCase("km") && unidadeDestino.equalsIgnoreCase("yd")) {
            return valor * 1093.61; // Quilometros para jardas
        } else if (unidadeOrigem.equalsIgnoreCase("mi") && unidadeDestino.equalsIgnoreCase("m")) {
            return valor * 1609.34; //Milhas para metros
        } else if (unidadeOrigem.equalsIgnoreCase("mi") && unidadeDestino.equalsIgnoreCase("km")) {
            return valor * 1.60934; //Milhas para Quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("mi") && unidadeDestino.equalsIgnoreCase("yd")) {
            return valor * 1760; //Milhas para Jardas
        } else if (unidadeOrigem.equalsIgnoreCase("yd") && unidadeDestino.equalsIgnoreCase("m")) {
            return valor / 1.09361; //Jardas para metros
        } else if (unidadeOrigem.equalsIgnoreCase("yd") && unidadeDestino.equalsIgnoreCase("km")) {
            return valor / 1093.61; //Jardas para quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("yd") && unidadeDestino.equalsIgnoreCase("mi")) {
            return valor / 1760; //Jardas para milhas
        } else {
            throw new IllegalArgumentException("Unidades de distância inválidas!");
        }
    }

    // Conversão de Peso
    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("g") && unidadeDestino.equalsIgnoreCase("kg")) {
            return valor / 1000; // Gramas para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("g") && unidadeDestino.equalsIgnoreCase("lb")) {
            return valor * 0.00220462; // Gramas para libras
            } else if (unidadeOrigem.equalsIgnoreCase("g") && unidadeDestino.equalsIgnoreCase("oz")) {
            return valor / 28.34952; // Gramas para Onças
        } else if (unidadeOrigem.equalsIgnoreCase("kg") && unidadeDestino.equalsIgnoreCase("g")) {
            return valor * 1000; //Quilogramas para gramas
            } else if (unidadeOrigem.equalsIgnoreCase("kg") && unidadeDestino.equalsIgnoreCase("lb")) {
            return valor * 2.20462; //Quilogramas para libras
        } else if (unidadeOrigem.equalsIgnoreCase("kg") && unidadeDestino.equalsIgnoreCase("oz")) {
            return valor * 35.274; // Quilogramas para onzas
        } else if (unidadeOrigem.equalsIgnoreCase("lb") && unidadeDestino.equalsIgnoreCase("g")) {
            return valor * 453.592; // Libras para gramas
        } else if (unidadeOrigem.equalsIgnoreCase("lb") && unidadeDestino.equalsIgnoreCase("kg")) {
            return valor / 2.20462; // Libras para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("lb") && unidadeDestino.equalsIgnoreCase("oz")) {
            return valor * 16; // Libras para onças
        } else if (unidadeOrigem.equalsIgnoreCase("oz") && unidadeDestino.equalsIgnoreCase("g")) {
            return valor * 28.34949254; // Onças para gramas
        } else if (unidadeOrigem.equalsIgnoreCase("oz") && unidadeDestino.equalsIgnoreCase("kg")) {
            return valor / 35.274; // Onças para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("oz") && unidadeDestino.equalsIgnoreCase("lb")) {
            return valor / 16; // Onças para libras
        } else {
            throw new IllegalArgumentException("Unidades de peso inválidas!");
        }
    }

    // Conversão de Tempo
    public static double converterTempo(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("s") && unidadeDestino.equalsIgnoreCase("min")) {
            return valor / 60; // Segundos para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("s") && unidadeDestino.equalsIgnoreCase("h")) {
            return valor / 3600; // Segundos para Horas
        } else if (unidadeOrigem.equalsIgnoreCase("s") && unidadeDestino.equalsIgnoreCase("d")) {
            return valor / 86400; // Segundos para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("min") && unidadeDestino.equalsIgnoreCase("s")) {
            return valor * 60; // Minutos para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("min") && unidadeDestino.equalsIgnoreCase("h")) {
            return valor / 60; // Minutos para Horas
        } else if (unidadeOrigem.equalsIgnoreCase("min") && unidadeDestino.equalsIgnoreCase("d")) {
            return valor / 1440; // Minutos para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("h") && unidadeDestino.equalsIgnoreCase("s")) {
            return valor * 3600; // Horas para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("h") && unidadeDestino.equalsIgnoreCase("min")) {
            return valor * 60; // Horas para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("h") && unidadeDestino.equalsIgnoreCase("d")) {
            return valor / 24; // Horas para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("d") && unidadeDestino.equalsIgnoreCase("s")) {
            return valor * 86400; // Dias para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("d") && unidadeDestino.equalsIgnoreCase("min")) {
            return valor * 1440; // Dias para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("d") && unidadeDestino.equalsIgnoreCase("h")) {
            return valor * 24; // Dias para Horas
        } else {
            throw new IllegalArgumentException("Unidades de tempo inválidas!");
        }
    }
    // Conversão de Velocidade
    public static double converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("km/h")) {
            return valor * 3.6; // Metros por Segundo para Quilômetros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("mi/h")) {
            return valor * 2.23694; // Metros por Segundo para Milhas por hora
        } else if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("kn")) {
            return valor / 0.51444; // Metros por Segundo para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor / 3.6; // Quilômetros por Hora para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("mi/h")) {
            return valor * 0.621371; // Quilômetros por Hora para Milhas por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("kn")) {
            return valor / 1.852; // Quilômetros por Hora para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("mi/h") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor * 0.44704; // Milhas por Hora para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("mi/h") && unidadeDestino.equalsIgnoreCase("km/ho")) {
            return valor / 0.621371; // Milhas por Hora para Quilômetros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("mi/h") && unidadeDestino.equalsIgnoreCase("kn")) {
            return valor * 0.868976; // Milhas por Hora para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("kn") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor * 0.51444; // Nós para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("kn") && unidadeDestino.equalsIgnoreCase("km/h")) {
            return valor * 1.852; // Nós para Quilometros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("kn") && unidadeDestino.equalsIgnoreCase("mi/h")) {
            return valor / 0.868976; // Nós para Milhas por Hora
        } else {
            throw new IllegalArgumentException("Unidades de velocidade inválidas!");
        }
    }

    // Conversão de Área
    public static double converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("m²") && unidadeDestino.equalsIgnoreCase("km²")) {
            return valor / 1000000; // Metros Quadrados para Quilômetros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("m²") && unidadeDestino.equalsIgnoreCase("ha")) {
            return valor / 10000; // Metros Quadrados para Hectares
        } else if (unidadeOrigem.equalsIgnoreCase("m²") && unidadeDestino.equalsIgnoreCase("ac")) {
            return valor / 4046.86; // Metros Quadrados para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("km²") && unidadeDestino.equalsIgnoreCase("m²")) {
            return valor * 1000000; // Quilômetros Quadrados para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("km²") && unidadeDestino.equalsIgnoreCase("ha")) {
            return valor * 100; // Quilômetros Quadrados para Hectares
        } else if (unidadeOrigem.equalsIgnoreCase("km²") && unidadeDestino.equalsIgnoreCase("ac")) {
            return valor * 247.105; // Quilômetros Quadrados para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("ha") && unidadeDestino.equalsIgnoreCase("m²")) {
            return valor * 10000; // Hectares para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("ha") && unidadeDestino.equalsIgnoreCase("km²")) {
            return valor / 100; // Hectares para Quilometros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("ha") && unidadeDestino.equalsIgnoreCase("ac")) {
            return valor * 2.47105; // Hectares para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("ac") && unidadeDestino.equalsIgnoreCase("m²")) {
            return valor * 4046.86; // Acres para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("ac") && unidadeDestino.equalsIgnoreCase("km²")) {
            return valor * 0.00404686; // Acres para Quilometros Quadrados 
        } else if (unidadeOrigem.equalsIgnoreCase("ac") && unidadeDestino.equalsIgnoreCase("ha")) {
            return valor / 2.47105; // Acres para Hectares
        } else {
            throw new IllegalArgumentException("Unidades de área inválidas!");
        }
    }
    
}
