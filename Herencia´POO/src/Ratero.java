public class Ratero extends Oficial{
    public Ratero(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" y lamentablemente es ratero";
    }
}
