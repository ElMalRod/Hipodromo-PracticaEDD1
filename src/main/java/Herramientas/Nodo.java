/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Objetos.Apuesta;

/**
 *
 * @author emili
 */
public class Nodo {
     private Nodo sig;
    private Nodo ante;
    private Apuesta valor;

    public Nodo(Nodo sig, Nodo ante, Apuesta valor) {
        this.sig = sig;
        this.ante = ante;
        this.valor=valor;
    }

    public Nodo getSiguiente() {
        return sig;
    }

    public void setSiguiente(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnterior() {
        return ante;
    }

    public void setAnterior(Nodo ante) {
        this.ante = ante;
    }

    public Apuesta getValor() {
        return valor;
    }

    public void setValor(Apuesta valor) {
        this.valor = valor;
    }
    

    @Override
    public String toString() {
        return "anterior: "+ ante +" valor: "+valor+" siguiente: "+ sig;
    }
    
}
