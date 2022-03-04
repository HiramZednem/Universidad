package Retornos;

import java.util.Scanner;

public class DatosBiometricos {
    //Metodos
    Scanner sc = new Scanner(System.in);

    public String nombre(){
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }
    public int edad(){
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        return edad;
    }
    public double estatura(){
        System.out.print("Ingrese su estatura: ");
        double estatura = sc.nextDouble();
        return estatura;
    }
    public double peso(){
        System.out.print("Ingrese su peso: ");
        double peso = sc.nextDouble();
        return peso;
    }
    public char letra(){
        System.out.print("Ingrese su letra favortia: ");
        char letra = sc.next().charAt(0);
        return letra;
    }
    public void mostrarResultados(String Nombre, int edad, double estatura, double peso, char letra){
        System.out.println("\nNombre = " + Nombre);
        System.out.println("edad = " + edad);
        System.out.println("estatura = " + estatura);
        System.out.println("peso = " + peso);
        System.out.println("letra = " + letra);
    }

}
