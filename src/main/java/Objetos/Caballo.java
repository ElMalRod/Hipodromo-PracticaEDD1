/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author emili
 */
public class Caballo {
    private int numeroCaballo;
    private boolean ganador;

    public Caballo(int numeroCaballo, boolean ganador) {
        this.numeroCaballo = this.numeroCaballo;
        this.ganador = ganador;
    }
     public Caballo(int numeroCaballo) {
        this.numeroCaballo = this.numeroCaballo;
    }
    

    public int getNumeroCaballo() {
        return numeroCaballo;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setNumeroCaballo(int numeroCaballo) {
        this.numeroCaballo = numeroCaballo;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}
