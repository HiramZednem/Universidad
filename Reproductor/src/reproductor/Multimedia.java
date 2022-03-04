/**
 * Aqui basicamente no hay impresiones por que de aqui hay una herencia a
 * Pelicula que se encarga de guardar e imprimir los datos
 */
package reproductor;
enum Formato {
    wav, mp3, mp4, midi, avi, mov, mpg, cdAudio, dvd
}

public class Multimedia {
    //Atributos
    private  String autor;
    private  Formato formato;
    private  double duracion;
    private  int año;
    private  String titulo;

    //METODOS:
    /*                     CONSTRUCTOR                     */
    public Multimedia(String titulo, String autor, Formato formato, double duracion, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        this.año = año;
    }

    public String toString() { //Aqui esta guardando los datos que estan siendo impresos en la linea 42 de ListaMultimedia
        return "Título: " + titulo + " De " + autor + "\n" +
                "Formato " + formato + " Duración " + (int) duracion + " minutos " + "Lanzamieno: " + año;
    }
}