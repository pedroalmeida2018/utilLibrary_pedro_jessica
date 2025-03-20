/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;

import static com.mycompany.conversorunidades.ConversorUnidades.converterArea;
import static com.mycompany.conversorunidades.ConversorUnidades.converterDistancia;
import static com.mycompany.conversorunidades.ConversorUnidades.converterPeso;
import static com.mycompany.conversorunidades.ConversorUnidades.converterTemperatura;
import static com.mycompany.conversorunidades.ConversorUnidades.converterTempo;
import static com.mycompany.conversorunidades.ConversorUnidades.converterVelocidade;
import java.util.Scanner;

/**
 *
 * @author Pedro Almeida
 */
public class Teste_main {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Unidades!");
        System.out.println("Escolha uma categoria para conversão:");
        System.out.println("1 - Temperatura -> (Celsius, Fahreneit, Kelvin)");
        System.out.println("2 - Distância -> (Metros, Quilometros, Milhas, Jardas)");
        System.out.println("3 - Peso -> (Gramas, Quilogramas, Libras, Onças)");
        System.out.println("4 - Tempo -> (Segundos, Minutos, Horas, Dias)");
        System.out.println("5 - Velocidade -> (Metros/segundo, Quilometros/hora, Milhas/hora, Nós)");
        System.out.println("6 - Área -> (Metros quadrados, Quilometros quadrados, Hectares, Acres)");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite a unidade de origem: ");
        String unidadeOrigem = scanner.nextLine();

        System.out.print("Digite a unidade de destino: ");
        String unidadeDestino = scanner.nextLine();

        double resultado = 0;

        try {
            switch (opcao) {
                case 1:
                    resultado = converterTemperatura(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 2:
                    resultado = converterDistancia(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 3:
                    resultado = converterPeso(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 4:
                    resultado = converterTempo(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 5:
                    resultado = converterVelocidade(valor, unidadeOrigem, unidadeDestino);
                    break;
                case 6:
                    resultado = converterArea(valor, unidadeOrigem, unidadeDestino);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }
            System.out.println("Resultado: " + valor + " " + unidadeOrigem + " = " + resultado + " " + unidadeDestino);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
   