package paquete1;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        do{
           int opc =  Integer.parseInt(JOptionPane.showInputDialog("Seleccione opción deseada:\n" +
                   "1.Suma\n" +
                   "2.Resta\n" +
                   "3.Multiplicación\n" +
                   "4.Division\n" +
                   "5.Salir"));
           switch (opc){
               case 1:
                   suma metodoSuma = new suma();
                   metodoSuma.sumar();
                   break;
               case 2:
                   resta metodoResta = new resta();
                   metodoResta.restar();
                   break;
               case 3:
                   multiplicacion metodoMultiplicar = new multiplicacion();
                   metodoMultiplicar.multiplicar();
                   break;
               case 4:
                   division metodoDividir = new division();
                   metodoDividir.dividir();
                   break;
               case 5:
                   System.exit(0);
                   break;
               default: JOptionPane.showMessageDialog(null, "Ingrese una opción correcta!");
           }
        }while(true);
    }
}
