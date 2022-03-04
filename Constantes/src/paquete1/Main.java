package paquete1;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Hiram",18);
        Persona p2 = new Persona("Yolisma",63);
        Persona p3 = new Persona("Carlos",73);
        p1.MostrarEdadPorAnio();
        System.out.println("===============================");
        p2.MostrarEdadPorAnio();
        System.out.println("===============================");
        p3.MostrarEdadPorAnio();

    }
}
