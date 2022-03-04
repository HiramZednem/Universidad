
package paquete1;

import javax.swing.*;

public class main {





    public static void main(String[] args) {
        do{
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion deseada" +
                    "\n1. Sumar" +
                    "\n2. Restar" +
                    "\n0.Salir"));
            switch (opc){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    suma metodoSuma = new suma();
                    metodoSuma.sumar();
                    JOptionPane.showMessageDialog(null,metodoSuma);
                    break;
                case 2:
                    resta metodoResta = new resta();
                    metodoResta.restar();
                    JOptionPane.showMessageDialog(null,metodoResta);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un dato valido!");
                    break;


            }

        }while(true);
    }



}
