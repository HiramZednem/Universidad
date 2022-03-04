package paquete1;

import javax.swing.*;

public class Lista {
    Nodo cabeza=null;
    int tamano=0;

    public Lista() {
    }

    public void agregarCabeza(Object valor){
       if (cabeza==null){
            cabeza= new Nodo(valor);}
        else{
           Nodo nuevo = new Nodo(valor);
            Nodo temp = cabeza;

            nuevo.enlazarSiguiente(temp);
            cabeza=nuevo; //
        }


        tamano++;
    }
    public boolean isListaVacia(){
        if (cabeza == null){
            return true;
        }
        else{
            return false;
        }
    }

    public int getTamano() {
        return tamano;
    }

    public void mostrarIndividual(int indice,int numeroingresado, int contador){ // indice ==
        if (contador < (numeroingresado-1)){
            JOptionPane.showMessageDialog(null,"El numero ingresado no es valido, intente nuevamente!");
        }
        else {
            Nodo temporal = cabeza;
            for (int i = 0; i < indice; i++) {
                temporal = temporal.getSiguiente();
            }
            System.out.println(numeroingresado + ". " + temporal.getValor());
        }
    }

    public void mostrarTodos (int contador){
        if(contador==0)
        {
            JOptionPane.showMessageDialog(null, "No hay datos para mostrar!");
        }
        else{
            System.out.println("Datos de la lista:");
            System.out.println("=======================");
            for (int j=0; j<contador;j++ ) {
                Nodo temporal = cabeza;
                for (int i = 0; i < j; i++) {
                    temporal = temporal.getSiguiente();
                }
                System.out.println((contador-j)+". "+temporal.getValor());
            }

            System.out.println("=======================");
        }
    }

    public void eliminarPrimero(){
        cabeza = cabeza.getSiguiente();
        tamano--;
    }
    public void eliminar(int index){
        //1 -> 2 ->3 ->4 ->5 ->6
        //1-> 2->4
        // 1->2->4 ->5 ->6


        /// nodo1-> nodo2-> nodo3
        /// 0       1       2
        if (index == 0){
            cabeza= cabeza.getSiguiente();
        }
        else {
            int contador=0;
            Nodo temporal =cabeza;
            while(contador < index -1){
                temporal=temporal.getSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(
                    temporal.getSiguiente().getSiguiente()
            );
        }
        tamano--;

    }
}
