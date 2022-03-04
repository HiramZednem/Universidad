import javax.swing.*;

public class Usuario {
    //Atributos
    private String nombre;
    private int contraseña; //Contraseña numerica
    Pila PilaUsuario = new Pila(10); //Todas las bandejas de mis usuarios tienen capacidad de 10 mensajes

    //Constructor para poder crear un usuario
    public Usuario(String nombre, int contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }



    //METODO TEMPORAL IMPRIMIR
    public String Imprimir (){
        return "Nombre: "+getNombre() +"\nContraseña: "+ getContraseña();
    }



































    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getContraseña() {
        return contraseña;
    }
}
