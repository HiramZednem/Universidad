package ParametrosArgumentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        int age = sc.nextInt();

        Metodos invocacion = new Metodos();

        invocacion.ImprimirDatos(name,age);
    }
}
