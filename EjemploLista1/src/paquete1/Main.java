/**
 * FUNCIONA COMO UNA PILA
 * ASI QUE LO TRABAJE COMO PILA PARA QUE MIS DATOS FUNCIONARAN
 * TIEMPO INVERTIDO: 37m
 */
package paquete1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lista metodo = new Lista();

        int contadorDatosIngresados=0;
        int indice=0;
        do{
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion deseada: \n 1. Agregar Marca de coche \n 2. Mostrar todos los datos ingresados \n 3. Mostrar por indice \n 4. Eliminar Ultima Marca Ingresada \n 5. Eliminar Marca en especifico \n 6. Salir" ));
            switch (opcion){
                case 1://Agregar
                    metodo.agregarCabeza(JOptionPane.showInputDialog("Introduzca Marca:"));
                    contadorDatosIngresados++;
                    break;
                case 2:
                    metodo.mostrarTodos(contadorDatosIngresados);
                    break;
                case 3:
                    indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiere mostrar"));
                    metodo.mostrarIndividual(contadorDatosIngresados-indice,indice,contadorDatosIngresados);
                    //LOS APILA, LA POSICION SE RECORRE ASI QUE PARA OBTENER EL N1, TENDRIA QUE HACER CONTADOR - 1(POR QUE QUIERO MOSTRAR EL UNO) 6 // 1  6-0
                    break;
                case 4:
                    metodo.eliminarPrimero();
                    contadorDatosIngresados--;
                    break;
                case 5:
                    indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que quiere eliminar"));
                    metodo.eliminar(contadorDatosIngresados-indice);
                    contadorDatosIngresados--;
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Dato ingresado incorrecto!");
            }
        }while (true);

    }
}
