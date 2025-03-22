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
                    System.out.println("Escolha uma categoria para converter:");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("|    1    |   Temperatura ->   C | F | K                     |");
                    System.out.println("|    2    |   Distância ->   m |km | mi | yd                 |");
                    System.out.println("|    3    |   Peso ->   g | kg | lb | oz                     |");
                    System.out.println("|    4    |   Tempo ->   s | min | h | d                     |");
                    System.out.println("|    5    |   Velocidade ->   m/s | km/h | mph | kn          |");
                    System.out.println("|    6    |   Área ->   m/quadrado | k/quadrado | ha | ac    |");
                    System.out.println("--------------------------------------------------------------");

                    int escolha = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Insere o valor que pretendes converter: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Digite a unidade de medida a converter: ");
                    String unidadeOrigem = scanner.nextLine();

                    System.out.print("Digite a unidade de medida para a qual quer converter: ");
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
                    System.out.println("\n------------------------------------------------------------------");
                    System.out.println("|  FIFO (First-In, First-Out): é um método, em que o             |\n|  primeiro elemento a entrar na estrutura é o primeiro a sair.  |");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\nPretende armazenar dados? Se sim, escolha uma ação para FIFO:");
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
                     System.out.println("\n------------------------------------------------------------------");
                    System.out.println("|  LIFO (Last-In, First-Out): é um método, em que o             |\n|  último elemento a entrar na estrutura é o primeiro a sair.  |");
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("\nPretende armazenar dados? Se sim, escolha uma ação para LIFO:");
                    System.out.println("1 - Adicionar elemento");
                    System.out.println("2 - Remover elemento");
                    System.out.println("3 - Listar elementos");
                    System.out.println("0 -> Voltar\n");

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