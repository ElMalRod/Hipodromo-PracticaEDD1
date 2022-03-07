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
public class Apuesta {
    private Postor cliente;
    private double montoApuesta;
    private int[] caballos= new int[10];
    private int puntos;
    private boolean valida;
    

    public Apuesta(Postor cliente, double montoApuesta, int[] caballos) {
        this.cliente = cliente;
        this.montoApuesta = montoApuesta;
        this.caballos = caballos;
        this.puntos=0;
        this.valida=true;
    }

    public Apuesta(Postor cliente, double montoApuesta, int puntos, boolean valida) {
        this.cliente = cliente;
        this.montoApuesta = montoApuesta;
        this.puntos = puntos;
        this.valida = valida;
    }
    

    public Postor getCliente() {
        return cliente;
    }

    public void setCliente(Postor cliente) {
        this.cliente = cliente;
    }

    public double getMontoApuesta() {
        return montoApuesta;
    }

    public int getPuntos() {
        return puntos;
    }

    public boolean isValida() {
        return valida;
    }
    
    public void setMontoApuesta(double montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public int[] getCaballos() {
        return caballos;
    }

    public void setCaballos(int[] caballos) {
        this.caballos = caballos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }
    
    

    @Override
    public String toString() {
        return  "Nombre: " + cliente .getNombre()
                + ", Monto de Apuesta: Q." + montoApuesta + ", Ordenamiento De Caballos: \n" + getListCaballos(this)
                + "\n Apuesta del Postor "+ cliente.getNombre() +" "+ isValida();
    }
    
    public String getListCaballos(Apuesta name){
        String list="";
        for (int i = 0; i < 10; i++) {
            list+=(i+1)+". "+name.caballos[i]+"\n";
        }
        return list;
    }

    
}
