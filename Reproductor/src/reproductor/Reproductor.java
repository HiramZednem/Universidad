package reproductor;

public class Reproductor {
    //Atributos

    //METODOS
    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(10); //Aqui se crea el objeto lista que viene de lista multimedia

        //PELICULAS
        lista.add(new Pelicula("Dr. No", "Terence Young", Formato.mov, 109, 1962,
                "Sean Connery", "Ursula Andress"));

        lista.add(new Pelicula("Vive y Deja Morir", "Albert R. Broccoli", Formato.dvd, 121, 1973,
                "Roger Moore", "Jane Seymour"));

        lista.add(new Pelicula("Sin Tiempo para Morir", "Cary Fukunaga", Formato.mp4, 163, 2021,
                "Daniel Craig", "Naomie Harris"));
        //CANCIONES
        lista.add(new Musica("La canción", "J Balvin", Formato.mp3, 4, 2019,
                "Oasis", "Urbano Latino"));
        lista.add(new Musica("Amorfoda", "Bad bunny", Formato.mp3, 2.33, 2018,
                "Oasis", "Pop"));
        lista.add(new Musica("Mejor no nos vemos", "Rels B", Formato.mp3, 3.9, 2018,
                "Sencillo", "Urbano Latino"));


        System.out.println(lista);
    }
}
