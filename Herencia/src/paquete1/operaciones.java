package paquete1;

import javax.swing.*;

public class operaciones {
    //atributos
    double n1;
    double n2;
    String resultado;

    //Metodos
    public void pedirDatos(){
     n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
     n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    }
    public void resultado(){
        JOptionPane.showMessageDialog(null,resultado);

    }
}
