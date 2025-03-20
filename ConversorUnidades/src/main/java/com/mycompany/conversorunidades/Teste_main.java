package com.mycompany.conversorunidades;

import java.util.Scanner;

public class Teste_main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FifoBuffer<String> fifo = new FifoBuffer<>();
        LifoBuffer<String> lifo = new LifoBuffer<>();

        while (true) {
            System.out.println("\nBem-vindo/a!");
            System.out.println("-----------------------------------------");
            System.out.println("|    Escolhe uma das opções seguintes:  |");
            System.out.println("-----------------------------------------");
            System.out.println("|    1    |     Converter unidades      |");
            System.out.println("|    2    |     FIFO                    |");
            System.out.println("|    3    |     LIFO                    |");
            System.out.println("|    0    |     Sair                    |");
            System.out.println("-----------------------------------------");
            System.out.println("\nOpção: ");
            

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Conversor de Unidades!");
                    System.out.println("Escolha uma categoria para conversão:");
                    System.out.println("1 - Temperatura -> (Celsius, Fahreneit, Kelvin)");
                    System.out.println("2 - Distância -> (Metros, Quilometros, Milhas, Jardas)");
                    System.out.println("3 - Peso -> (Gramas, Quilogramas, Libras, Onças)");
                    System.out.println("4 - Tempo -> (Segundos, Minutos, Horas, Dias)");
                    System.out.println("5 - Velocidade -> (Metros/segundo, Quilometros/hora, Milhas/hora, Nós)");
                    System.out.println("6 - Área -> (Metros quadrados, Quilometros quadrados, Hectares, Acres)");

                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o valor a ser convertido: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite a unidade de origem: ");
                    String unidadeOrigem = scanner.nextLine();

                    System.out.print("Digite a unidade de destino: ");
                    String unidadeDestino = scanner.nextLine();

                    double resultado = 0;

                    try {
                        switch (escolha) {
                            case 1:
                                resultado = ConversorUnidades.converterTemperatura(valor, unidadeOrigem, unidadeDestino);
                                break;
                            case 2:
                                resultado = ConversorUnidades.converterDistancia(valor, unidadeOrigem, unidadeDestino);
                                break;
                            case 3:
                                resultado = ConversorUnidades.converterPeso(valor, unidadeOrigem, unidadeDestino);
                                break;
                            case 4:
                                resultado = ConversorUnidades.converterTempo(valor, unidadeOrigem, unidadeDestino);
                                break;
                            case 5:
                                resultado = ConversorUnidades.converterVelocidade(valor, unidadeOrigem, unidadeDestino);
                                break;
                            case 6:
                                resultado = ConversorUnidades.converterArea(valor, unidadeOrigem, unidadeDestino);
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                continue;
                        }
                        System.out.println("Resultado: " + valor + " " + unidadeOrigem + " = " + resultado + " " + unidadeDestino);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 2: // FIFO
                    System.out.println("Escolha uma ação para FIFO:");
                    System.out.println("1 -> Adicionar elemento");
                    System.out.println("2 -> Remover elemento");
                    System.out.println("3 -> Listar elementos");
                    System.out.println("0 -> Voltar");

                    int acaoFifo = scanner.nextInt();
                    scanner.nextLine();

                    if (acaoFifo == 1) {
                        System.out.print("Digite um elemento para adicionar à fila: ");
                        String elemento = scanner.nextLine();
                        fifo.adicionarElemento(elemento);
                    } else if (acaoFifo == 2) {
                        String removido = fifo.removerElemento();
                        System.out.println("Elemento removido: " + (removido != null ? removido : "Fila vazia"));
                    } else if (acaoFifo == 3) {
                        fifo.listarElementos(); 
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3: // LIFO
                    System.out.println("Escolha uma ação para LIFO:");
                    System.out.println("1 - Adicionar elemento");
                    System.out.println("2 - Remover elemento");
                    System.out.println("3 - Listar elementos");

                    int acaoLifo = scanner.nextInt();
                    scanner.nextLine();

                    if (acaoLifo == 1) {
                        System.out.print("Digite um elemento para adicionar à pilha: ");
                        String elemento = scanner.nextLine();
                        lifo.adicionarElemento(elemento);
                    } else if (acaoLifo == 2) {
                        String removido = lifo.removerElemento();
                        System.out.println("Elemento removido: " + (removido != null ? removido : "Pilha vazia"));
                    } else if (acaoLifo == 3) {
                        lifo.listarElementos();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**package com.mycompany.conversorunidades;

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
 *//**
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
*/   