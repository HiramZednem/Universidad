package paquete1;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<String>();




        do {
            int opc;
            opc = Integer.parseInt(JOptionPane.showInputDialog("Introduce opcione deseada\n" +
                    "1. Agregar Marca\n" +
                    "2. Mostrar Marca\n" +
                    "3. Buscar marca\n" +
                    "4. Vaciar pila\n" +
                    "5. Salir"));

            switch (opc)
            {
                case 1:
                    pila.push(JOptionPane.showInputDialog("Introduce Marca del Carro"));
                    break;
                case 2:
                    if (pila.empty())
                    {
                        JOptionPane.showMessageDialog(null,"La pila esta vacia!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"La marca del carro es:"+pila.peek());
                        pila.pop();
                    }
                    break;
                case 3:
                    String is = JOptionPane.showInputDialog("Introduce marca: ");
                    System.out.println( pila.search(is));
                    if (pila.search(is) == -1)
                    {
                        JOptionPane.showMessageDialog(null, "No se encuentra esa marca!");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Si se encuentra, esta en la posicion [" + pila.search(is) + "] de la pila");
                        break;
                    }
                case 4:
                    pila = new Stack<String>();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }while(true);





    }
}
