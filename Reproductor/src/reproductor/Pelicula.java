package reproductor;

public class Pelicula extends Multimedia { //Llega aqui directo y se aplica concepto de herencia para la impresion de mis datos

    //ATRIBUTOS
    private String actorPrincipal;
    private String actrizPrincipal;

    //METODOS
    /*                     CONSTRUCTOR                     */
    public Pelicula(String titulo, String autor, Formato formato, double duracion, int año, String actor, String actriz) {
        super(titulo, autor, formato, duracion, año);
        if (actor == null && actriz == null) {
            throw new IllegalArgumentException("Tiene que haber al menos un protagonista");
        }
        actorPrincipal = actor;
        actrizPrincipal = actriz;
    }


    public String toString() {
        String s = "Protagonizado por ";
        if (actrizPrincipal != null) {
            s += actrizPrincipal;
            if (actorPrincipal != null) {
                s += " y " + actorPrincipal;
            }
        }
        return super.toString() + "\n" + s;
    }
}
