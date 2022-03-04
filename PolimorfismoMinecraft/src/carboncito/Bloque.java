package carboncito;

public class Bloque {
    //ATRIBUTOS
    private String nombre;
    private String dimension;
    private String textura;

    public Bloque(String nombre, String dimension, String textura) {
        this.nombre = nombre;
        this.dimension = dimension;
        this.textura = textura;

    }

    public void Destruir(){
        System.out.println("Ay!, me rompí, pero no tengo identidad xd");
    }
    public void Colocar(){
        System.out.println("Me coloque");
    }
}
