package com.mycompany.conversorunidades;

   
    public class ConversorUnidades {
        
         // Conversão de Temperatura
    public static double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("Celcius") && unidadeDestino.equalsIgnoreCase("Fahrenheit")) {
            return valor * 1.8 + 32; // Celcius para Fahrenheit
        } else if (unidadeOrigem.equalsIgnoreCase("Celcius") && unidadeDestino.equalsIgnoreCase("Kelvin")) {
            return valor + 273.15; // Celcius para Kelvin
        } else if (unidadeOrigem.equalsIgnoreCase("Fahrenheit") && unidadeDestino.equalsIgnoreCase("Celcius")) {
            return (valor - 32) / 1.8; // Fahrenheit para Celcius
        } else if (unidadeOrigem.equalsIgnoreCase("Fahrenheit") && unidadeDestino.equalsIgnoreCase("Kelvin")) {
            return (valor - 32) / 1.8 + 273.15; // Fahrenheit para Kelvin
        } else if (unidadeOrigem.equalsIgnoreCase("Kelvin") && unidadeDestino.equalsIgnoreCase("Celcius")) {
            return valor - 273.15; // Kelvin para Celcius
        } else if (unidadeOrigem.equalsIgnoreCase("Kelvin") && unidadeDestino.equalsIgnoreCase("Fahrenheit")) {
            return (valor - 273.15) * 1.8 + 32; // Kelvin para Fahrenheit
        } else {
            throw new IllegalArgumentException("Unidades inválidas para conversão de temperatura!");
        }
    }

    // Conversão de Distância
    public static double converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("Metros(m)") && unidadeDestino.equalsIgnoreCase("Quilometros(km)")) {
            return valor / 1000; // Metros para quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("Metros(m)") && unidadeDestino.equalsIgnoreCase("Milhas(mi)")) {
            return valor / 1609.34; // Metros para milhas
        } else if (unidadeOrigem.equalsIgnoreCase("Metros(m)") && unidadeDestino.equalsIgnoreCase("Jardas(yd)")) {
            return valor * 1.09361; // Metros para jardas
        } else if (unidadeOrigem.equalsIgnoreCase("Quilometros(km)") && unidadeDestino.equalsIgnoreCase("Metros(m)")) {
            return valor * 1000; // Quilometros para metros
        } else if (unidadeOrigem.equalsIgnoreCase("Quilometros(km)") && unidadeDestino.equalsIgnoreCase("Milhas(mi)")) {
            return valor / 1.60934; // Quilometros para milhas
        } else if (unidadeOrigem.equalsIgnoreCase("Quilometros(km)") && unidadeDestino.equalsIgnoreCase("Jardas(yd)")) {
            return valor * 1093.61; // Quilometros para jardas
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas (mi)") && unidadeDestino.equalsIgnoreCase("Metros(m)")) {
            return valor * 1609.34; //Milhas para metros
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas (mi)") && unidadeDestino.equalsIgnoreCase("Quilometros(km)")) {
            return valor * 1.60934; //Milhas para Quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas (mi)") && unidadeDestino.equalsIgnoreCase("Jardas(yd)")) {
            return valor * 1760; //Milhas para Jardas
        } else if (unidadeOrigem.equalsIgnoreCase("Jardas(yd)") && unidadeDestino.equalsIgnoreCase("Metros(m)")) {
            return valor / 1.09361; //Jardas para metros
        } else if (unidadeOrigem.equalsIgnoreCase("Jardas(yd)") && unidadeDestino.equalsIgnoreCase("Quilometros(km)")) {
            return valor / 1093.61; //Jardas para quilometros
        } else if (unidadeOrigem.equalsIgnoreCase("Jardas(yd)") && unidadeDestino.equalsIgnoreCase("Milhas(mi)")) {
            return valor / 1760; //Jardas para milhas
        } else {
            throw new IllegalArgumentException("Unidades de distância inválidas!");
        }
    }

    // Conversão de Peso
    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("Gramas(g)") && unidadeDestino.equalsIgnoreCase("Quilogramas(kg)")) {
            return valor / 1000; // Gramas para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("Gramas(g)") && unidadeDestino.equalsIgnoreCase("Libras(lb)")) {
            return valor * 0.00220462; // Gramas para libras
            } else if (unidadeOrigem.equalsIgnoreCase("Gramas(g)") && unidadeDestino.equalsIgnoreCase("Onças(oz)")) {
            return valor / 28.34952; // Gramas para Onças
        } else if (unidadeOrigem.equalsIgnoreCase("Quilogramas(kg)") && unidadeDestino.equalsIgnoreCase("Gramas(g)")) {
            return valor * 1000; //Quilogramas para gramas
            } else if (unidadeOrigem.equalsIgnoreCase("Quilogramas(kg)") && unidadeDestino.equalsIgnoreCase("Libras(lb)")) {
            return valor * 2.20462; //Quilogramas para libras
        } else if (unidadeOrigem.equalsIgnoreCase("Quilogramas(kg)") && unidadeDestino.equalsIgnoreCase("Onças(oz)")) {
            return valor * 35.274; // Quilogramas para onzas
        } else if (unidadeOrigem.equalsIgnoreCase("Libras(lb)") && unidadeDestino.equalsIgnoreCase("Gramas(g)")) {
            return valor * 453.592; // Libras para gramas
        } else if (unidadeOrigem.equalsIgnoreCase("Libras(lb)") && unidadeDestino.equalsIgnoreCase("Quilogramas(kg)")) {
            return valor / 2.20462; // Libras para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("Libras(lb)") && unidadeDestino.equalsIgnoreCase("onças(oz)")) {
            return valor * 16; // Libras para onças
        } else if (unidadeOrigem.equalsIgnoreCase("Onças(oz)") && unidadeDestino.equalsIgnoreCase("Gramas(g)")) {
            return valor * 28.34949254; // Onças para gramas
        } else if (unidadeOrigem.equalsIgnoreCase("Onças(oz)") && unidadeDestino.equalsIgnoreCase("Quilogramas(kg)")) {
            return valor / 35.274; // Onças para quilogramas
        } else if (unidadeOrigem.equalsIgnoreCase("Onças(oz)") && unidadeDestino.equalsIgnoreCase("Libras(lb)")) {
            return valor / 16; // Onças para libras
        } else {
            throw new IllegalArgumentException("Unidades de peso inválidas!");
        }
    }

    // Conversão de Tempo
    public static double converterTempo(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("Segundos(s)") && unidadeDestino.equalsIgnoreCase("Minutos(min)")) {
            return valor / 60; // Segundos para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("Segundos(s)") && unidadeDestino.equalsIgnoreCase("Horas(h)")) {
            return valor / 3600; // Segundos para Horas
        } else if (unidadeOrigem.equalsIgnoreCase("Segundos(s)") && unidadeDestino.equalsIgnoreCase("Dias(d)")) {
            return valor / 86400; // Segundos para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("Minutos(min)") && unidadeDestino.equalsIgnoreCase("Segundos(s)")) {
            return valor * 60; // Minutos para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("Minutos(min)") && unidadeDestino.equalsIgnoreCase("Horas(h)")) {
            return valor / 60; // Minutos para Horas
        } else if (unidadeOrigem.equalsIgnoreCase("Minutos(min)") && unidadeDestino.equalsIgnoreCase("Dias(d)")) {
            return valor / 1440; // Minutos para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("Horas(h)") && unidadeDestino.equalsIgnoreCase("Segundos(s)")) {
            return valor * 3600; // Horas para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("Horas(h)") && unidadeDestino.equalsIgnoreCase("Minutos(min)")) {
            return valor * 60; // Horas para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("Horas(h)") && unidadeDestino.equalsIgnoreCase("Dias(d)")) {
            return valor / 24; // Horas para Dias
        } else if (unidadeOrigem.equalsIgnoreCase("Dias(d)") && unidadeDestino.equalsIgnoreCase("Segundos(s)")) {
            return valor * 86400; // Dias para Segundos
        } else if (unidadeOrigem.equalsIgnoreCase("Dias(d)") && unidadeDestino.equalsIgnoreCase("Minutos(min)")) {
            return valor * 1440; // Dias para Minutos
        } else if (unidadeOrigem.equalsIgnoreCase("Dias(d)") && unidadeDestino.equalsIgnoreCase("Horas(h)")) {
            return valor * 24; // Dias para Horas
        } else {
            throw new IllegalArgumentException("Unidades de tempo inválidas!");
        }
    }
    // Conversão de Velocidade
    public static double converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("km/h")) {
            return valor * 3.6; // Metros por Segundo para Quilômetros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("Milhas/hora(mhp)")) {
            return valor * 2.23694; // Metros por Segundo para Milhas por hora
        } else if (unidadeOrigem.equalsIgnoreCase("m/s") && unidadeDestino.equalsIgnoreCase("Nós(kn)")) {
            return valor / 0.51444; // Metros por Segundo para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor / 3.6; // Quilômetros por Hora para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("Milhas/hora(mph)")) {
            return valor * 0.621371; // Quilômetros por Hora para Milhas por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("km/h") && unidadeDestino.equalsIgnoreCase("Nós(kn)")) {
            return valor / 1.852; // Quilômetros por Hora para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas/hora(mph)") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor * 0.44704; // Milhas por Hora para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas/hora(mph)") && unidadeDestino.equalsIgnoreCase("km/h")) {
            return valor / 0.621371; // Milhas por Hora para Quilômetros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("Milhas/hora(mph)") && unidadeDestino.equalsIgnoreCase("Nós(kn)")) {
            return valor * 0.868976; // Milhas por Hora para Nós
        } else if (unidadeOrigem.equalsIgnoreCase("Nós(kn)") && unidadeDestino.equalsIgnoreCase("m/s")) {
            return valor * 0.51444; // Nós para Metros por Segundo
        } else if (unidadeOrigem.equalsIgnoreCase("Nós(kn)") && unidadeDestino.equalsIgnoreCase("km/h")) {
            return valor * 1.852; // Nós para Quilometros por Hora
        } else if (unidadeOrigem.equalsIgnoreCase("Nós(kn)") && unidadeDestino.equalsIgnoreCase("Milhas/hora(mph)")) {
            return valor / 0.868976; // Nós para Milhas por Hora
        } else {
            throw new IllegalArgumentException("Unidades de velocidade inválidas!");
        }
    }

    // Conversão de Área
    public static double converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equalsIgnoreCase("m2") && unidadeDestino.equalsIgnoreCase("km2")) {
            return valor / 1000000; // Metros Quadrados para Quilômetros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("m2") && unidadeDestino.equalsIgnoreCase("Hectares(ha)")) {
            return valor / 10000; // Metros Quadrados para Hectares
        } else if (unidadeOrigem.equalsIgnoreCase("m2") && unidadeDestino.equalsIgnoreCase("Acres(ac)")) {
            return valor / 4046.86; // Metros Quadrados para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("km2") && unidadeDestino.equalsIgnoreCase("m2")) {
            return valor * 1000000; // Quilômetros Quadrados para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("km2") && unidadeDestino.equalsIgnoreCase("Hectares(hc)")) {
            return valor * 100; // Quilômetros Quadrados para Hectares
        } else if (unidadeOrigem.equalsIgnoreCase("km2") && unidadeDestino.equalsIgnoreCase("Acres(ac)")) {
            return valor * 247.105; // Quilômetros Quadrados para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("Hectares(ha)") && unidadeDestino.equalsIgnoreCase("m2")) {
            return valor * 10000; // Hectares para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("Hectares(ha)") && unidadeDestino.equalsIgnoreCase("km2")) {
            return valor / 100; // Hectares para Quilometros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("Hectares(ha)") && unidadeDestino.equalsIgnoreCase("Acres(ac)")) {
            return valor * 2.47105; // Hectares para Acres
        } else if (unidadeOrigem.equalsIgnoreCase("Acres(ac)") && unidadeDestino.equalsIgnoreCase("m2")) {
            return valor * 4046.86; // Acres para Metros Quadrados
        } else if (unidadeOrigem.equalsIgnoreCase("Acres(ac)") && unidadeDestino.equalsIgnoreCase("km2")) {
            return valor * 0.00404686; // Acres para Quilometros Quadrados 
        } else if (unidadeOrigem.equalsIgnoreCase("Acres(ac)") && unidadeDestino.equalsIgnoreCase("Hectares(ha)")) {
            return valor / 2.47105; // Acres para Hectares
        } else {
            throw new IllegalArgumentException("Unidades de área inválidas!");
        }
    }
    
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
}

