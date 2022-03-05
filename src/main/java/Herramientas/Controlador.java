/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Forms.Main;
import Objetos.Apuesta;
import javax.swing.JOptionPane;

/**
 *
 * @author emili
 */
public class Controlador {

    Nodo inicioNodo;
    Nodo ultimoNodo;
    int tamaño;
    private Apuesta apuesta;
    private int[] caballos;
    private int contador;
    public static int contadorA;
    private boolean encontrado=false;

    public boolean vacio() {
        return inicioNodo == null;
    }

    public void anadir(Apuesta valor) {

        if (vacio() == false) {                                                   
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);   
            ultimoNodo.setSiguiente(nuevo);                                 
            inicioNodo.setAnterior(nuevo);                                   
            ultimoNodo = nuevo;                                                     
        }
        if (vacio()) {                                                              
            Nodo nuevo = new Nodo(ultimoNodo, inicioNodo, valor);   
            inicioNodo = nuevo;                                                    
            ultimoNodo = nuevo;                                                    
        }
        tamaño++;                                                                  
                         
                                                                            //RESULTADO: O(1)

    }
    
    public void Imprimir() {
        boolean bandera = true;                                                    
        int contador = 1;                                                       
        if (vacio() == false) {        
                 
            Nodo aux = inicioNodo.getSiguiente();                              
            Nodo auxi = inicioNodo.getAnterior();                               
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {        
                bandera=false;
                contador++;
                System.out.println("si entre vamossss");
            } else {                                                           
                while (bandera) {                                                  //O(n)
                    if (aux != auxi) {                                         
                       
                        aux = aux.getSiguiente();                              
                        contador++;                                            
                    } else {                                                       
                        bandera = false;                                          
                        contador++;                                             
                    }                                                      
                                                               //Resultado final O(n)
                }
            }

        }
        JOptionPane.showMessageDialog(null,"imprimi "+ contador);
    }
    
    public Controlador analizarApuestas() {
        int contador=0;
        boolean bandera = true;                                                                                           
        if (vacio() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA            
            Nodo aux = inicioNodo.getSiguiente();                               
            Nodo auxi = inicioNodo.getAnterior();                              
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {          
                this.apuesta = inicioNodo.getValor();                              
                        this.contador=0;                                                         
                        this.caballos = this.apuesta.getCaballos();                
                        validacionApuesta();                                                                                 
            } else {                                                               
                while (bandera) {                                                     //O(n)-------> Unico O(n)
                    if (aux != auxi) {                                            
                        this.apuesta = aux.getValor();                             
                        this.contador=0;                                                          
                        this.caballos = aux.getValor().getCaballos();             
                        this.encontrado=false;                                    
                        validacionApuesta();                                      
                        aux = aux.getSiguiente();                                
                        this.apuesta=aux.getValor();                             
                        contador++;                                                
                    } else {                                                      
                        this.apuesta = aux.getValor();                             
                        this.contador=0;                                           
                        this.caballos = aux.getValor().getCaballos();              
                        this.encontrado=false;                                
                        validacionApuesta();                                    
                        aux = aux.getSiguiente();                                 
                        this.apuesta=aux.getValor();                               
                        bandera = false;                                           
                        contador++;                                                
                    }                                                             //---------------   
                                                                       //Resultado final n
                }
            }
        }
        return this.Eliminar();

    }
    
    
    public void validacionApuesta() {
        boolean encontado=true;
        for (int i = (contador + 1); i < 10; i++) {                             
            if (this.caballos[contador] == this.caballos[i]) {                
                this.apuesta.setValida(false);                          
                encontado = true;                                             
                break;                                                         
            }else{                                                     
                 encontado=false;                                             
            }
        }                                                                      
        if (encontado == false) {                                             
            this.contador++;                                                  
             validacionApuesta();                                               //O(1)    
        }                                                                 //--------------
    }                                                        //RESULTADO FINAL     1
    
    
    public boolean ValidarResultados(int[] array ) {
        boolean encontado=true;
        for (int i = (contadorA + 1); i < 10; i++) {                            
            if (array[contadorA] == array[i]) {                                 
                return false;                                                   
            }else{                                                     
                 encontado=false;                                              
            }
        }                                                                       
        if (encontado == false) {                                               
            contadorA++;                                                        
             ValidarResultados(array);                                 
        } 
        return  true;                                                       //--------------
    }                                                           //RESULTADO FINAL  1
    
    
    public Controlador Eliminar(){
        boolean leer=true;
        Controlador lis= new Controlador();
        if (vacio() == false) {          
            System.out.println("ini"+inicioNodo.getAnterior().getValor());
            System.out.println("ini"+ultimoNodo.getValor());
            System.out.println("ini"+ultimoNodo.getSiguiente().getValor());
            Nodo aux = inicioNodo;                              
            Nodo auxi = inicioNodo.getAnterior();
            if(inicioNodo.getValor().isValida()==false){
                 Main.errores.anadir(inicioNodo.getValor());   
                inicioNodo=inicioNodo.getSiguiente();
                ultimoNodo.setSiguiente(inicioNodo);
                aux=inicioNodo.getSiguiente();
            }else{
                lis.anadir(aux.getValor());
                            aux = aux.getSiguiente();
            }
            if (inicioNodo == ultimoNodo.getSiguiente()) {        
                        if(inicioNodo.getValor().isValida()==false){           
                         inicioNodo.setAnterior(null);                  
                         inicioNodo.setSiguiente(null);                 
                         Main.errores.anadir(aux.getValor());   
                        }                                                       
                        leer=false;                                           
            } else {                                                         
                while (leer) {                                                  //O(n)-------> Unico O(n)
                    if (aux != auxi) {                                       
                        if(aux.getValor().isValida()==true){                   
                            lis.anadir(aux.getValor());
                            aux = aux.getSiguiente();
                            System.out.println("sisisis");
                            
                        }else{
                           if(aux.getAnterior() == aux.getSiguiente() ){        
                                Main.errores.anadir(aux.getValor());   
                                aux.setAnterior(null);                  
                                aux.setSiguiente(null);                
                                aux=aux.getSiguiente();                      
                                
                            }else{
             
                                Main.errores.anadir(aux.getValor());   
                                Nodo siguiente = aux.getSiguiente();          
                                Nodo anterior = aux.getAnterior();            
                                aux.getAnterior().setSiguiente(siguiente);     
                                aux.getSiguiente().setAnterior(anterior);      
                                aux=aux.getSiguiente();                       
                                
                            }
                    
                        }                                                    
                    } else {                                                   
                        if(aux.getValor().isValida()==false){              
                            Main.errores.anadir(aux.getValor());    
                            Nodo siguiente = aux.getSiguiente();               
                            Nodo anterior = aux.getAnterior();                 
                            aux.getAnterior().setSiguiente(siguiente);         
                            aux.getSiguiente().setAnterior(anterior);           
                           
                        }else{
                             lis.anadir(aux.getValor());
                            
                        }  
                        leer = false;                                           
                    }                                                     //---------------   
                                                                       //Resultado final n
                }
            }
        }else{
            System.out.println("NO HAY DATOS");
        }
        return lis;
        
    }
}