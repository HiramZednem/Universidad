package ExplicacionKeyla;

public class Clubo {
    //Atributos
    private String nombre;
    private String textura;

    public Clubo(String nombre, String textura) {
        this.nombre = nombre;
        this.textura = textura;
    }

    public Clubo(String nombre) {
        this.nombre = nombre;
    }


    //Metodos
    public void colocar (){
        System.out.print("Me coloque en un lugar y mi textura es: ");
        System.out.println(textura);
    }
    public void destrur(){
        System.out.println("Me rompi, pero no se que hacer pq no tengo propiedad xd:(");
    }
























    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
}
