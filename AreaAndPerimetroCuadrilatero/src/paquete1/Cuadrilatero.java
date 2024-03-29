package paquete1;

public class Cuadrilatero {
    /*
    Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud
    de sus dos lados. Los valores de la longitud deberán introducirse por línea de ordenes. Si es un cuadrado,
    sólo se proporcionará la longitud de uno de los lados al constructor.
     */

    //Atributos
    private float lado1;
    private float lado2;


    //Metodos

    //Metodo Constructor 1(Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo Constructor 2(Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getArea(){
        float area = lado1 * lado2;
        return area;
    }

    public float getPerimetro(){
        float perimetro = lado1*2 + lado2*2;
        return perimetro;
    }


}
