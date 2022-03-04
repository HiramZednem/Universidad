package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String apodo;

    //Metodos:

    //Metodo constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String apodo) {
        this.apodo = apodo;
    }

    public void Correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }
    public void Correr(int km){
        System.out.println("He corrido "+km+" km");
    }
}
