
package com.mycompany.conversorunidades;
import java.util.LinkedList;

// Implementação de LIFO (Last In, First Out)
class Lifo<T> {
    private LinkedList<T> pilha = new LinkedList<>();

    public void adicionarElemento(T elemento) {
        pilha.addFirst(elemento);
    }

    public T removerElemento() {
        if (!pilha.isEmpty()) {
            return pilha.removeFirst();
        } else {
            System.out.println("A pilha está vazia!");
            return null;
        }
    }

    public void listarElementos() {
        System.out.println("LIFO Buffer: " + pilha);
    }
}