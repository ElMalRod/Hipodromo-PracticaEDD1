/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;


import Objetos.Postor;
import Objetos.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author emili
 */
public class ControlCaballo {
  public Controlador validacionCaballos(String[] cadena, Controlador lista){
        int contador=0;
        int asignado=0;
        String[] array= new String[12];
        try{
            for (int i = 0; i < cadena.length; i++) {
                if ((asignado + 1) % 12 == 0) {
                    if (i == 0) {
                        array[contador] = cadena[i];
                        contador++;
                        asignado++;
                    } else {
                        array[contador] = cadena[i];
                        lista.anadir(new Apuesta(new Postor(array[0]), Double.parseDouble(array[1]), this.asignacionCaballos(array)));
                        contador = 0;
                        asignado = 0;
                    }

                } else {
                    array[contador] = cadena[i];
                    contador++;
                    asignado++;

                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "NO HAY DATOS");
        }
        return lista;
    }
    public int[] asignacionCaballos(String[] array){
        int[] caballo= new int[10];
        int contador=0;
        for (int i = 2; i < array.length; i++) {
            caballo[contador]= Integer.parseInt(array[i]);
            contador++;
        }
        return caballo;
    }
   
    
}