package paquete1;

public  class Estaticos {
    //Atributo estatico
    private static String frase="Hola que tal?";

    //Metodo estatico
    public static int sumar(int n1, int n2)
    {
        int suma = n1+n2;
        return suma;
    }




    public static void main(String[] args) {
        Estaticos objeto1 = new Estaticos();
        Estaticos objeto2 = new Estaticos();

        objeto2.frase  = "Adios!";

        System.out.println("la suma es: "+ Estaticos.sumar(1,3));
    }
}
