package Constructor;

public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos

    //=========METODO CONSTRUCTOR=============//
    public Persona(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //=========================================//

    public void Mostrar()
    {
        System.out.println("Mi nombre es: "+nombre+"\nMi edad es: "+edad);
    }
}
