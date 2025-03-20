
package com.mycompany.conversorunidades;
import java.util.LinkedList;

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
    }
}
    

