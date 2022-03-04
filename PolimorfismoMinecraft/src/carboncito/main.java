package carboncito;

public class main {
    public static void main(String[] args) {
        System.out.println("\nPiedra - Destruir");
        Bloque piedra = new Bloque("piedra", "3d", "piedra.jpg");
        piedra.Destruir();

        System.out.println("\nCarbon - Destruir");
        Carbon carbon = new Carbon("carboncito.Carbon","3d","crbn.png");
        carbon.Destruir();

        System.out.println("\nPiedra - Colocar");
        piedra.Colocar();

        System.out.println("\ncarboncito.Carbon - Colocar");
        carbon.Colocar();


    }
}
