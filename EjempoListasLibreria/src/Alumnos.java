public class Alumnos {
    //Atributos
    private String nombre;
    private String grupo;
    private Double calificacion;




//Metodo to string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("\nGrupo: ");
        sb.append(grupo);
        sb.append("\nCalificacion: ");
        sb.append(calificacion);
        return sb.toString();
    }



    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
