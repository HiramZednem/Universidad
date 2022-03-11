/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolistadoble;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author crystal17
 */
public class ListaDoble {
    Nodo primero;
    Nodo ultimo;
    
    Scanner teclado= new Scanner(System.in);
    
    
    public ListaDoble(){
        primero= null;
        ultimo=null;
    }
    
 
    public void agregar(Object dato){
        Nodo nuevo= new Nodo ();
        nuevo.dato=dato;
        if (primero == null){
        primero=nuevo;
        primero.siguiente=null;
        primero.anterior=null;
        ultimo=primero;
        }
        else {
            ultimo.siguiente=nuevo;
            nuevo.anterior= ultimo;
            nuevo.siguiente=null;
            ultimo=nuevo;
            
        }

    }
    public void mostrar(){
        Nodo actual = new Nodo();
        actual=primero;
        String nodosMostrar="Matriculas Registradas: \n";
        while(actual != null){
            nodosMostrar = nodosMostrar + actual.dato + "\n";
            
            actual=actual.siguiente;
            
        }
        JOptionPane.showMessageDialog(null, nodosMostrar);
        
    }
    public void buscar(Object dato){
         Nodo actual = new Nodo();
         actual = primero;
         boolean bandera=false;
         while(actual!=null){
             if(actual.dato == dato){
                 bandera=true;
             }
             actual=actual.siguiente;
         }
         if (bandera){
             JOptionPane.showMessageDialog(null, "Matricula encontrada");
         }else{
             JOptionPane.showMessageDialog(null, "Matricula no encontrada");
         }
        }
    
    public void modificar (Object dato){
        Nodo actual= new Nodo ();
        actual= primero;
       boolean  bandera = false;
        while(actual != null){
            if(actual.dato ==dato){
                /*
                System.out.println("introduzca nuevo valor del nodo");
                actual.dato=teclado.nextInt();
                actual.dato=Integer.parseInt( JOptionPane.showInputDialog("Introduzca nueva matricula") );
                */
                bandera=true;
                 actual.dato =  Integer.parseInt( JOptionPane.showInputDialog("Introduzca nueva matricula a ser modifcada: ") );
                
            }
            actual=actual.siguiente;
            
        } 
        if(!bandera){
        JOptionPane.showMessageDialog(null, "La matricula que intena modificar\n no se encuentra");
        }
    }

    
    public void eliminar(Object dato){
        Nodo actual = new Nodo();
        Nodo atras= new Nodo();
        actual=primero;
        atras =null;
        
        
        while(actual != null){
        
            if(actual.dato == dato){
                if (actual == primero){
                    primero=primero.siguiente;
                    primero.anterior=null;
                }
                else {
                        atras.siguiente= actual.siguiente;
                        actual.siguiente.anterior=actual.anterior;
                }
            }
            atras=actual;
            actual=actual.siguiente;
                
        }
    
    }
    
    
}
