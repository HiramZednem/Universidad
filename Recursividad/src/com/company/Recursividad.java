package com.company;

import javax.swing.*;

public class Recursividad {
    private int x;
    private int conta;
    private String cadena="";

    //constructor
    public Recursividad(int numero, int conta) {
        this.x = numero;
        this.conta=conta;
    }

    public void imprimir()
    {
        if (x<=conta)
        {
            cadena = cadena + x + " ";
            System.out.println(x+" ");
            x++;
            imprimir();
        }
        else
        {
            JOptionPane.showMessageDialog(null,cadena);
            System.out.println("fin");
        }
    }






}

