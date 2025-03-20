/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;
import java.util.LinkedList;
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
    }
}