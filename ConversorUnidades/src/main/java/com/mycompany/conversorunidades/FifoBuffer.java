
package com.mycompany.conversorunidades;
import java.util.LinkedList;
<<<<<<< HEAD:ConversorUnidades/src/main/java/com/mycompany/conversorunidades/Fifo.java

// Implementação de FIFO (First In, First Out)
class Fifo <T> {
    private LinkedList<T> fila = new LinkedList<>();

    public void adicionarElemento(T elemento) {
        fila.addLast(elemento);
    }

    public T removerElemento() {
        if (!fila.isEmpty()) {
            return fila.removeFirst();
        } else {
            System.out.println("A fila está vazia!");
            return null;
        }
    }

    public void listarElementos() {
        System.out.println("FIFO Buffer: " + fila);
=======
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Pedro Almeida
 */
// Classe para FIFO (First In, First Out)
class FifoBuffer<T> {
    private Queue<T> fila;

    public FifoBuffer() {
        this.fila = new LinkedList<>();
    }

    public void adicionarElemento(T elemento) {
        fila.add(elemento);
    }

    public T removerElemento() {
        return fila.poll(); // Remove e retorna o primeiro elemento (FIFO)
    }

    public void listarElementos() {
        System.out.println("Elementos na Fila: " + fila);
>>>>>>> eea4e25f40a591077a2df8a3a449f4f8050c48d5:ConversorUnidades/src/main/java/com/mycompany/conversorunidades/FifoBuffer.java
    }
}