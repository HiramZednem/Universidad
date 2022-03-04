package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    int numero= 0;
    int conta = Integer.parseInt(JOptionPane.showInputDialog(null,"Hasta que numero va a contar el programa?"));
	Recursividad metodo = new Recursividad(numero, conta);
    metodo.imprimir();
    }
}
