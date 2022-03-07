/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

/**
 *
 * @author emili
 */
public class Orden {
     private Controlador lista;

    public Orden(Controlador lista) {
        this.lista = lista;
    }
    
    public void insertionSort() {
        Nodo nodoInsertar= lista.getInicioNodo().getSiguiente();
        while(nodoInsertar!=null){
            Nodo primerNodo=nodoInsertar.getAnterior();
            
            while(primerNodo!=null){
                System.out.println("jaja");
                if(primerNodo.getValor().getPuntos() >= nodoInsertar.getValor().getPuntos()){
                    System.out.println("1");
                    if(primerNodo.getSiguiente().getValor().getPuntos() < nodoInsertar.getValor().getPuntos()){
                        System.out.println("2");
                        this.lista.InsertarEntre(primerNodo, primerNodo.getSiguiente(), nodoInsertar);
                    }
                    System.out.println("hice el break");
                    break;
                }else{
                    if(this.lista.getInicioNodo()==primerNodo){
                        this.lista.insertarInicio(nodoInsertar);
                        System.out.println("inserte primer nodo");
                    }
                }
                
                primerNodo= primerNodo.getAnterior();
                System.out.println("cambie primeroNodo");
            }
            
            nodoInsertar= nodoInsertar.getSiguiente();
//           System.out.println(nodoInsertar.getValor().getPersona().getNombre());
        }
        this.lista.getInicioNodo().setAnterior(this.lista.ultimoNodo);
        this.lista.getInicioNodo().setSiguiente(this.lista.inicioNodo);
        try{
            this.lista.generarArchivo(this.lista);
        }catch(Exception c){
            
        }
        
    }
    
    
}
