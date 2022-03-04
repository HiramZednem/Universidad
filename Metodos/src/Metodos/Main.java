package Metodos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora(); //creo el objeto calcular
        calcular.pedirDatos();

        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opcion deseada"+"\n" +
                    "1. Cambiar numeros"+"\n" +
                    "2. Sumar"+"\n" +
                    "3. Restar"+"\n" +
                    "4. Multiplicar"+"\n" +
                    "5. Dividir"+"\n" +
                    "6. Salir"));

            switch (opc){
                case 1:
                    calcular.pedirDatos();
                    break;
                case 2:
                    calcular.sumar();
                    break;
                case 3:
                    calcular.restar();
                    break;
                case 4:
                    calcular.multiplicar();
                    break;
                case 5:
                    calcular.dividir();
                    break;
                case 6:
                    calcular.salir();
                    break;
                default: JOptionPane.showMessageDialog(null,"El numero ingresado no es valido, intente nuevamente");
            }

        }while (true);
    }
}
