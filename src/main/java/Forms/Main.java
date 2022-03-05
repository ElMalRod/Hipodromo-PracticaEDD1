/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Herramientas.Controlador;

/**
 *
 * @author emili
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Controlador lista= new Controlador();
    public static Controlador errores= new Controlador();
    public static boolean apuestas=true;
    
    public static void main(String[] args) {
        // TODO code application logic here
         Inicio v= new Inicio();
          v.setVisible(true);
    }

 
    
}
