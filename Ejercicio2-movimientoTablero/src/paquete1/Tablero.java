package paquete1;
/*
Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro
             de un tablero y actualice su posición dentro del mismo.
             Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
             Tras cada movimiento el programa mostrará la nueva dirección elegida y
             las coordenadas de situación del objeto dentro del tablero.
 */
public class Tablero {
    private int x;
    private int y;
    private String direccion;

    public void moverArriba(){
        direccion = "arriba";
        y=y+1;
        imprimirDatos();
    }
    public void moverAbajo(){
        direccion = "abajo";
        y=y-1;
        imprimirDatos();
    }
    public void moverIzquierda(){
        direccion = "izquierda";
        x=x-1;
        imprimirDatos();
    }
    public void moverDerecha(){
        direccion = "derecha";
        x=x+1;
        imprimirDatos();
    }

    public void imprimirDatos(){
        System.out.println("La direccion elegida fue \""+direccion+"\"");
        System.out.println("La posicion actual es ["+x+"]["+y+"]");
        System.out.println("===========================================");

    }
}
