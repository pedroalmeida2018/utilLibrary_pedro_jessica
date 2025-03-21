/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;
import java.util.Stack;
/**
 *
 * @author Pedro Almeida
 */

// Classe para LIFO (Last In, First Out)
class LifoBuffer<T> {
    private Stack<T> pilha;

    public LifoBuffer() {
        this.pilha = new Stack<>();
    }

    public void adicionarElemento(T elemento) {
        pilha.push(elemento);
    }

    public T removerElemento() {
        return pilha.isEmpty() ? null : pilha.pop(); // Remove e retorna o último elemento (LIFO)
    }

    public void listarElementos() {
        System.out.println("Elementos na Pilha: " + pilha);
    }
}
