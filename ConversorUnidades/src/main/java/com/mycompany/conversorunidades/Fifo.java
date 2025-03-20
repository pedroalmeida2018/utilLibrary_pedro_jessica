/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversorunidades;
import java.util.LinkedList;
/**
 *
 * @author Pedro Almeida
 */

public class Fifo{
    private LinkedList buffer = new LinkedList<>();

    public void adicionarElemento(T elemento) {
        buffer.addLast(elemento);
    }

    public void removerElemento() {
        return buffer.pollFirst(); // Remove o primeiro elemento (FIFO)
    }

    public void listarElementos() {
        System.out.println(buffer);
    }
}
    

