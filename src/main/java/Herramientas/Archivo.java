/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Forms.Inicio;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emili
 */
public class Archivo {
    
  public String[] SubirArchivo(Inicio in) {    
       try{
           JFileChooser archivosubir = new JFileChooser();                                                
        int seleccion = archivosubir.showOpenDialog(in);                                                                            
        if (seleccion == JFileChooser.APPROVE_OPTION) {                                                
            File fichero = archivosubir.getSelectedFile();                                            
            String path=fichero.getAbsolutePath();                                                         
            try ( FileReader fr = new FileReader(fichero)) {                                       
                String cadena = "";                                                                            
                int valor = fr.read();                                                                
                while (valor != -1) {                                                                   //O(n)------
                    cadena = cadena + (char)valor;                                                         
                    valor = fr.read();                                                             
                }
                return splitDatos(cadena.replace("\n", ","));                         
            } catch (IOException e1) {                                                                          
                JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");
            }
            return null;                                                                           
        }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR EL ARCHIVO");  
       }
        return null;                                                                               
    }
    
    public String[] splitDatos(String cadena){
        String [] resultado = cadena.split(",");                                                           
        return resultado;                                                                              
    }                                                                                  
                                                                                            //RESULTADO O(n)
    
}