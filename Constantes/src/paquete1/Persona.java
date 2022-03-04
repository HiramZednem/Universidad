package paquete1;

public class Persona {
    private final String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODOS
    public void MostrarEdadPorAnio(){
       for( int anio= 2022; anio<=2050;anio++)
       {
           System.out.println("Nombre: "+nombre);
           System.out.println("Edad en el año "+anio+": "+edad);
           edad++;
       }
    }

}
