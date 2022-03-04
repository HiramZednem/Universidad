import java.util.Scanner;

/*
Ejercicio 3: Construir un programa que dada una -serie de vehículos-
caracterizados por su marca, año y precio, imprima las propiedades
del vehículo más barato. Para ello, se deberán leer por teclado las
características de cada vehículo y crear una clase que represente a
cada uno de ellos.
SWITCH:
1.Poder buscar por año    || mas nuevo  || mas viejo  ||Ordenar desde mas nuevo a mas viejo
2.Poder buscar por precio || mas barato || mas caro   ||Ordenar desde mas caro a mas barato

*/
public class Carros {
    //ATRIBUTOS DEL ARREGLO DE OBJETOS unidadesMotoras[]
    private String marca;
    private int anio;
    private double precio;

    //METODO CONSTRUCTOR
    public Carros(String marca, int anio, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

    //GETTERS
    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void MostrarCarroIndividual(){
        System.out.println("Marca: "+marca);
        System.out.println("Año: "+anio);
        System.out.println("Precio: $"+precio);
        System.out.println("=============================================");
    }

}

