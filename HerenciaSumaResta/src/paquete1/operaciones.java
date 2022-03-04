package paquete1;

import javax.swing.*;

public class operaciones {
    //Atributos
    private int n1;
    private int n2;
    private String resultado;

    //Constructores


    public operaciones() {
    }

    public operaciones(int n1, int n2, String resultado){
        this.n1 = n1;
        this.n2 = n2;
        this.resultado = resultado;
    }

    public void ObtenerNumeros (){
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero1:"));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero2:"));
    }




    //Método toString
    public String toString() {
        return "El resultado de ";
    }

    //Getters y Setters
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
