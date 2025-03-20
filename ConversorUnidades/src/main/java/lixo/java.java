/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lixo;

/**
 *
 * @author jfcp_
 */
public class java {
     
    /*public static class ConversorTemperatura {
        
        public static double celciusFahrenheit(double celcius) {
    // Formula da conversão: (Valor celcius * 1.8) + 32
        return celcius * 1.8 + 32; 
     }   
        public static double celciusKelvin(double celcius) {
    // Formula da conversão: Valor celcius + 273.15
        return celcius + 273.15;
        }

        public static double fahrenheitCelcius(double fahrenheit) {
    // Formula da conversão: (Valor fahrenheit - 32) / 1.8
        return (fahrenheit-32) / 1.8;
        }

        public static double fahrenheitKelvin(double fahrenheit) {
    // Formula da conversão: (Valor fahrenheit - 32) / 1.8 + 273.15
        return (fahrenheit - 32) / 1.8 + 273.15;
        }

        public static double kelvinCelcius(double kelvin) {
    // Formula da conversão: Valor kelvin - 273.15
    return kelvin - 273.15;
        }
        public static double kelvinFahrenheit(double kelvin) {
    // Formula da conversão: (Valor kelvin - 273.15) * 1.8 + 32
        return (kelvin - 273.15) * 1.8 + 32;
        }
        }
    public static class Distancia {
        
        public static double metrosQuilometros(double metros) {
    // Formula de conversão: Valor metros / 1000
        return metros / 1000;
        }
        public static double quilometrosMetros(double quilometros) {
    // Formula de conversão: Valor quilometros * 1000 
        return quilometros * 1000;
        }
        public static double metrosMilhas(double metros) {
    // Formula de conversão: Valor metros / 1609.34 
        return metros / 1609.34;  
    }
     public static double milhasMetros(double milhas) {
    // Formula de conversão: Valor milhas * 1609.34 
        return milhas * 1609.34;  
    }  
     public static double milhasQuilometros(double milhas) {
    // Formula de conversão: Valor milhas * 1.60934 
        return milhas * 1.60934;  
    }  
     public static double metrosJardas(double metros) {
    // Formula de conversão: Valor metros * 1.09361 
        return metros * 1.09361; 
    }  
     public static double jardasMetros(double jardas) {
    // Formula de conversão: Valor jardas / 1.09361  
        return jardas / 1.09361;  
    } 
    public static double jardasMilhas(double jardas) {
    // Formula de conversão: Valor jardas / 1760  
        return jardas / 10760;  
    }  
    public static double milhasJardas(double milhas) {
    // Formula de conversão: Valor milhas * 1760
        return milhas * 1760;  
    }  
      public static double jardasQuilometros(double jardas) {
    // Formula de conversão: Valor jardas / 1093.61  
        return jardas / 1093.61;
      }
        public static double quilometrosJardas(double quilometros) {
    // Formula de conversão: Valor quilometros * 1093.61
        return quilometros * 1093.61;
        }
        public static double quilometrosMilhas(double quilometros) {
    // Formula de conversão: Valor quilometros / 1.60934
        return quilometros / 1.60934;
        }   
    }
    
    public static class Peso {
        
        public static double gramasQuilogramas(double gramas) {
    // Formula de conversão: Valor gramas / 1000
        return gramas / 1000;        
        }
        public static double gramasLibras(double gramas) {
    // Formula de conversão: Valor gramas * 0.00220462
        return gramas * 0.00220462;        
        }
       public static double gramasOncas(double gramas) {
    // Formula de conversão: Valor gramas / 28.34952
        return gramas / 28.34952;        
        } 
     public static double quilogramasGramas(double quilogramas) {
    // Formula de conversão: Valor quilogramas * 1000
        return quilogramas * 1000;        
        }   
     public static double quilogramasLibras(double quilogramas) {
    // Formula de conversão: Valor quilogramas * 2.20462
        return quilogramas * 2.20462;        
        } 
     public static double quilogramasOncas(double quilogramas) {
    // Formula de conversão: Valor quilogramas * 35.274
        return quilogramas * 35.274;        
        }
    public static double librasGramas(double libras) {
    // Formula de conversão: Valor libras * 453.592
        return libras * 453.592;        
        } 
    public static double librasQuilogramas(double libras) {
    // Formula de conversão: Valor libras / 2.20462
        return libras / 2.20462;        
        }
  public static double librasOncas(double libras) {
    // Formula de conversão: Valor libras * 16
        return libras * 16;        
        }   
    public static double oncasGramas(double oncas) {
    // Formula de conversão: Valor oncas * 28.34949254 
        return oncas * 28.34949254;        
        } 
    public static double oncasQuilogramas(double oncas) {
    // Formula de conversão: Valor oncas / 35.274
        return oncas / 35.274;        
        }
    public static double oncasLibras(double oncas) {
    // Formula de conversão: Valor oncas / 16
        return oncas / 16;        
        }
    }
    
   public static class Tempo {

    
        public static double segundosMinutos(double segundos) {
    // Formula de conversão: Valor segundos / 60
            return segundos / 60;
        }

        public static double segundosHoras(double segundos) {
    //Formula de conversão: Valor segundos / 3600;  1h = 3600 segundos     
            return segundos / 3600; 
        }
 
        public static double segundosDias(double segundos) {
    // Formula de conversão: Valor segundos / 86400; 1 dia =86400 segundos
            return segundos / 86400; 
        }
   
        public static double minutosSegundos(double minutos) {
    // Formula de conversão: Valor minutos * 60
            return minutos * 60;
        }

        public static double minutosHoras(double minutos) {
    // Formula de conversão: Valor minutos / 60
            return minutos / 60;
        }
        
public static double minutosDias(double minutos) {
    // Formula de conversão: Valor minutos / 1440; 1 dia =  1440 minutos
            return minutos / 1440; 
        }
  
        public static double horasSegundos(double horas) {
    // Formula de conversão: Valor horas * 3600
            return horas * 3600;
        }   
        public static double horasMinutos(double horas) {
    //Formula de conversão: Valor horas * 60
            return horas * 60;
        }      
        
        public static double horasDias(double horas) {
    // Formula de conversão: Valor horas / 24
            return horas / 24;
        }

        public static double diasSegundos(double dias) {
    // Formula de conversão: Valor dias * 86400
            return dias * 86400;
        }
 
        public static double diasMinutos(double dias) {
    // Formula de conversão: Valor dias * 1440
            return dias * 1440;
        }
  
        public static double diasHoras(double dias) {
    // Formula de conversão: Valor dias * 24
            return dias * 24;
        }     
    } */
}
