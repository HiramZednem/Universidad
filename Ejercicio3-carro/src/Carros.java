/*
Ejercicio 3: Construir un programa que dada una -serie de vehículos-
caracterizados por su marca, modelo y precio, imprima las propiedades
del vehículo más barato. Para ello, se deberán leer por teclado las
características de cada vehículo y crear una clase que represente a
cada uno de ellos.
*/

public class Carros {
    //ATRIBUTOS
    private String marca;
    private int modelo;
    private double precio;

    //METODO CONSTRUCTOR
    public Carros(String marca, int modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void imprimirResultados(){
        System.out.println("coche mas barato:");
        System.out.println("La marca del coche es: "+marca);
        System.out.println("El modelo del coche es: "+modelo);
        System.out.println("El precio del coche es: "+precio);
    }
}
