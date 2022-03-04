package Metodos;

import javax.swing.*;

public class Calculadora {
    //Atributos
    int n1,n2;
    double resultado;

    public void pedirDatos(){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }

    public void sumar(){
        resultado = n1+n2;
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+resultado);
    }
    public void restar(){
        resultado = n1-n2;
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+resultado);
    }
    public void multiplicar(){
        resultado = n1*n2;
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+resultado);
    }
    public void dividir(){
        resultado = n1/n2;
        JOptionPane.showMessageDialog(null,"El resultado de la division es: "+resultado);
    }
    public void salir(){
        System.exit(0);
    }
}
