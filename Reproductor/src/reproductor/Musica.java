package reproductor;

public class Musica extends Multimedia{
    //atributos
    private String album;
    private String genero;

    //METODOS
    public Musica(String titulo, String autor, Formato formato, double duracion,int año,String album,String genero){
        super(titulo,autor,formato,duracion,año);
        this.album = album;
        this.genero = genero;
    }
    public String toString() {
        String s = "Album: ";
            s += album;
            s+= " Genero: ";
            s+= genero;

        return super.toString() + "\n" + s;
    }
}
