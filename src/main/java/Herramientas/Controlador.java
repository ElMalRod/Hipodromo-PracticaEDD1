/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import Forms.Main;
import Objetos.Apuesta;
import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
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
     private int[] resultados;
    private int contador;
    public static int contadorA;
    private boolean encontrado=false;

    public boolean vacio() {
        return inicioNodo == null;
    }
       public Nodo getInicioNodo() {
        return inicioNodo;
    }

    public Nodo getUltimoNodo() {
        return ultimoNodo;
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
                         
                                                                            //Resultado: O(1) Constante

    }
    
      public int tamañoArreglo() {
        boolean leer = true;                                                  
        int contador = 1;                                                     
        if (vacio() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA      
            Nodo aux = inicioNodo.getSiguiente();                           
            Nodo auxi = inicioNodo.getAnterior();                           
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {   
                leer=false;
            } else {                                                            
                while (leer) {                                                 
                    if (aux != auxi) {                                          
              
                        aux = aux.getSiguiente();                          
                        contador++;                                           
                    } else {                                                   
                 
                        leer = false;                                       
                        contador++;                                         
                    }                                                  
                                                               //Resultado final O(n)
                }
            }

        }
        return contador;
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
                System.out.println("------------USUARIOS PARTICIPANTES----------");
            } else {                                                           
                while (bandera) {                                                  
                    if (aux != auxi) {                                         
                       
                        aux = aux.getSiguiente();                              
                        contador++;                                            
                    } else {                                                       
                        bandera = false;                                          
                        contador++;                                             
                    }                                                      
                                                               //Resultado final O(n) Lineal
                }
            }

        }
        JOptionPane.showMessageDialog(null,"imprimi "+ contador);
    }
    
     public void imprimirPuntos() {
        boolean leer = true;                                                  
        int contador = 1; 
         System.out.println("si aqui padre");
        if (vacio() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA     
            System.out.println("nunca entreo");
            System.out.println(inicioNodo.getValor().getCliente().getNombre() + inicioNodo.getValor().getPuntos()+ inicioNodo.getValor().isValida());   
            Nodo aux = inicioNodo.getSiguiente();                            
            Nodo auxi = inicioNodo.getAnterior();                              
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {       
                leer=false;
            } else {                                                            
                while (leer) {                                                 
                    if (aux != auxi) {                                         
                    System.out.println(aux.getValor().getCliente().getNombre() + aux.getValor().getPuntos()+ inicioNodo.getValor().isValida());       
                        aux = aux.getSiguiente();                               
                        contador++;                                             
                    } else {                                                  
                      System.out.println(aux.getValor().getCliente().getNombre() + aux.getValor().getPuntos()+ inicioNodo.getValor().isValida());   
                        leer = false;                                          
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
        if (vacio() == false) {          
            Nodo aux = inicioNodo.getSiguiente();                               
            Nodo auxi = inicioNodo.getAnterior();                              
            if (inicioNodo.getAnterior() == ultimoNodo.getSiguiente()) {          
                this.apuesta = inicioNodo.getValor();                              
                        this.contador=0;                                                         
                        this.caballos = this.apuesta.getCaballos();                
                        ValidarApuesta();                                                                                 
            } else {                                                               
                while (bandera) {                                                    
                    if (aux != auxi) {                                            
                        this.apuesta = aux.getValor();                             
                        this.contador=0;                                                          
                        this.caballos = aux.getValor().getCaballos();             
                        this.encontrado=false;                                    
                        ValidarApuesta();                                      
                        aux = aux.getSiguiente();                                
                        this.apuesta=aux.getValor();                             
                        contador++;                                                
                    } else {                                                      
                        this.apuesta = aux.getValor();                             
                        this.contador=0;                                           
                        this.caballos = aux.getValor().getCaballos();              
                        this.encontrado=false;                                
                        ValidarApuesta();                                    
                        aux = aux.getSiguiente();                                 
                        this.apuesta=aux.getValor();                               
                        bandera = false;                                           
                        contador++;                                                
                    }                                                               
                                                                       //Resultado final O(n) Lineal
                }
            }
        }
        return this.Eliminar();

    }
    
    
    public void ValidarApuesta() {
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
        if (this.caballos[contador] > 10) {
            this.apuesta.setValida(false);
            encontado = true;
            
        }
        if (encontado == false) {                                             
            this.contador++;                                                   
             ValidarApuesta();                                              
        }                                                                          
    }   
    //Resultado final    O(1) Constante
    
    
    
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
        return  true;                                                    
    }                                                           //Resultado final    O(1) Constante
    
    
    public Controlador Eliminar(){
        boolean leer=true;
        Controlador lis= new Controlador();
        if (vacio() == false) { // VERIFICO QUE NO ESTE VACIA MI LISTA          
            Nodo aux = inicioNodo;                                         
            Nodo auxi = inicioNodo.getAnterior();                                
            if(aux.getValor().isValida()==false){                             
                Main.errores.anadir(inicioNodo.getValor());             
                aux.getSiguiente().setAnterior(aux.getAnterior());     
                aux.getAnterior().setSiguiente(aux.getSiguiente());     
                aux=aux.getSiguiente();                                              
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
                while (leer) {                                                 
                    if (aux != auxi) {                                        
                        if(aux.getValor().isValida()==true){                  
                            lis.anadir(aux.getValor());                   
                            aux = aux.getSiguiente();                        
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
                    }                                                     
                                                                 //Resultado final n
                }
            }
        }else{
            System.out.println("NO HAY DATOS");
        }
        try{
        this.generarArchivo();
        
        } catch (IOException ex) {
            
            JOptionPane.showMessageDialog(null, "HEMOS TENIDO PROBLEMAS PARA GENERAR EL ARCHIVO");
        }
        return lis;
        
    }
    
     public void CalcularPuntos(int caballos[]){
        this.resultados= caballos;                                             
        if(vacio()==false){                                                   
            Nodo aux = inicioNodo;                                          
            Nodo auxi= inicioNodo.getAnterior();                                 
                sumatioriaPuntos(aux.getValor());                     
                aux=aux.getSiguiente();                                   
            while(aux!=auxi){                                                   
                sumatioriaPuntos(aux.getValor());                   
            }
           if(inicioNodo==ultimoNodo){
               
           } else{
               sumatioriaPuntos(aux.getValor()); 
           }
            
           
        }                                                              
    }                                                              //Resultado:   n
    public void sumatioriaPuntos(Apuesta apuesta){
        for (int i = 0; i < 10; i++) {                                      
            if(apuesta.getCaballos()[i]==this.resultados[i]){                  
                apuesta.setPuntos(apuesta.getPuntos()+(10-i));                   
            }                                                            
        }                                                               //Resultado 1
        
    }
    
    public void generarArchivo() throws IOException {
        FileDialog guardar = null;
        guardar = new FileDialog(guardar, "Guardar como", FileDialog.SAVE);
        guardar.setVisible(true);
        guardar.dispose();

        if (guardar.getFile() != null && guardar.getDirectory() != null) {
            FileWriter writer = new FileWriter(guardar.getDirectory() + guardar.getFile() + ".csv");
            String resultado = "";
            resultado += escribirArchivo(Main.errores.getInicioNodo());
            writer.write(resultado);
            writer.close();
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito en la ruta:"
                    + "\n" + guardar.getDirectory(), "Infornación", JOptionPane.INFORMATION_MESSAGE);
        }
    }
      public void generarArchivo(Controlador lista) throws IOException {
        FileDialog guardar = null;                                                                   
        guardar = new FileDialog(guardar, "Guardar como", FileDialog.SAVE);              
        guardar.setVisible(true);                                                               
        guardar.dispose();                                                                                 
        if (guardar.getFile() != null && guardar.getDirectory() != null) {                                
            FileWriter writer = new FileWriter(guardar.getDirectory() + guardar.getFile() + ".csv");   
           String resultado = "Nombre Apostador,Monto Apostado,Puntos Conseguidos,Primer Lugar"+             
                    ",Segundo Lugar,Tercer Lugar,Cuarto Lugar, Quinto Lugar,Sexto Lugar,Septimo Lugar,Octavo Lugar"+
                    ",Noveno Lugar,Decimo Lugar\n";
            resultado += escribirArchivo(lista.getInicioNodo());                                      
            writer.write(resultado);                                                                        
            writer.close();                                                                        
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito");       
        }                                                                                             
    }   
    
    private String escribirArchivo(Nodo nodo) {
        Nodo tmp = nodo;
        String resultado = tmp.getValor().getCliente().getNombre() + "," + tmp.getValor().getMontoApuesta()
                + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
        tmp = tmp.getSiguiente();

        while (tmp!=nodo.getAnterior()) {
            resultado += tmp.getValor().getCliente().getNombre() + "," + tmp.getValor().getMontoApuesta()
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
            tmp = tmp.getSiguiente();
        }
         resultado += tmp.getValor().getCliente().getNombre() + "," + tmp.getValor().getMontoApuesta()
                    + tmp.getValor().getPuntos() + "," + tmp.getValor().getCaballos()[0] + "," + tmp.getValor().getCaballos()[1]
                    + "," + tmp.getValor().getCaballos()[2] + "," + tmp.getValor().getCaballos()[3] + ","
                    + tmp.getValor().getCaballos()[4] + "," + tmp.getValor().getCaballos()[5] + ","
                    + tmp.getValor().getCaballos()[6] + "," + tmp.getValor().getCaballos()[7] + ","
                    + tmp.getValor().getCaballos()[8] + "," + tmp.getValor().getCaballos()[9] + "\n";
        return resultado;
    }
    
      public void OrdenarResultados(){
        inicioNodo.setAnterior(null);                                                              
        ultimoNodo.setSiguiente(null);                                                
        Nodo aux=inicioNodo.getSiguiente();                                                 
        Nodo auxi=inicioNodo.getAnterior();                                                 
        while(aux!=null){                                                                             
            Nodo auxiE = aux.getAnterior();                                                
            while(auxiE!=null){                                                                  
                if(auxiE.getValor().getPuntos() > auxiE.getSiguiente().getValor().getPuntos()){  
                    if (auxiE == inicioNodo) {                                                   
                        Nodo pivot = auxiE.getSiguiente();                                      
                        Nodo pivotR= auxiE;                                                       
                        auxiE.setSiguiente(pivot.getSiguiente());                        
                        auxiE.setAnterior(pivot);                                        
                        pivot.getSiguiente().setAnterior(auxiE);                          
                        pivot.setAnterior(null);                                           
                        pivot.setSiguiente(auxiE);                                          
                        inicioNodo=auxiE;                                                         
                    }else if(auxiE==ultimoNodo){                                               
                        Nodo pivot = auxiE.getSiguiente();                                      
                        Nodo pivotR= auxiE;                                                     
                        auxiE.getAnterior().setSiguiente(pivot);                          
                        auxiE.setSiguiente(null);                                         
                        auxiE.setAnterior(pivot);                                       
                        pivot.setAnterior(pivotR.getAnterior());                           
                        pivot.setSiguiente(auxiE);                                                 
                        ultimoNodo=auxiE;                                                           
                    }else{                                                                    
                        Nodo pivot = auxiE.getSiguiente();                                     
                        Nodo pivotR= auxiE;                                                     
                        auxiE.getAnterior().setSiguiente(pivot);                          
                        auxiE.setSiguiente(pivot.getSiguiente());                          
                        auxiE.setAnterior(pivot);                                         
                        pivot.getSiguiente().setAnterior(auxiE);                          
                        pivot.setAnterior(pivotR.getAnterior());                           
                        pivot.setSiguiente(auxiE);                                       
                        auxiE=pivot.getAnterior();                                            
                    }
                }else{
                    break;                                                                       
                }
            }
            aux = aux.getSiguiente();                                                      
        }
        inicioNodo.setAnterior(ultimoNodo);                                            
        ultimoNodo.setSiguiente(inicioNodo);                                             
                                                                                    
                                                                                      //RESULTADO O(n²)
                                                                                    
        
     
    }
    
    
    
    public void insertarInicio(Nodo nodoInsertar){
        if(ultimoNodo==nodoInsertar){
            nodoInsertar.getAnterior().setSiguiente(null);
            ultimoNodo= nodoInsertar.getAnterior();
        }else{
            nodoInsertar.getAnterior().setSiguiente(nodoInsertar.getSiguiente());
            nodoInsertar.getSiguiente().setAnterior(nodoInsertar.getAnterior());
        }
        inicioNodo.setAnterior(nodoInsertar);
        nodoInsertar.setSiguiente(inicioNodo);
        nodoInsertar.setAnterior(null);
        inicioNodo=nodoInsertar;
    }
    
    public void InsertarEntre(Nodo primeroNodo, Nodo segundoNodo, Nodo nodoInsertar){
        if(ultimoNodo== nodoInsertar){
            nodoInsertar.getAnterior().setSiguiente(null);
            ultimoNodo=nodoInsertar.getAnterior();
        }else{
            nodoInsertar.getAnterior().setSiguiente(nodoInsertar.getSiguiente());
            nodoInsertar.getSiguiente().setAnterior(nodoInsertar.getAnterior());
        }
        primeroNodo.setSiguiente(nodoInsertar);
        nodoInsertar.setAnterior(primeroNodo);
        segundoNodo.setAnterior(nodoInsertar);
        nodoInsertar.setSiguiente(segundoNodo);
    }
    
    
    
}