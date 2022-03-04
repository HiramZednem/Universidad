package paquete1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tablero bolita = new Tablero(); //creo mi objeto
        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion deseada:\n" +
                    "1.Mover Arriba\n" +
                    "2.Mover Abajo\n" +
                    "3.Mover Izquierda\n" +
                    "4.Mover Derecha\n" +
                    "5.Salir")) ;
            switch (opc){
                case 1:
                    bolita.moverArriba();
                    break;
                case 2:
                    bolita.moverAbajo();
                    break;
                case 3:
                    bolita.moverIzquierda();
                    break;
                case 4:
                    bolita.moverDerecha();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Seleccion Incorrecta!, intente nuevamente.");
            }
        }while(true);
    }
}
