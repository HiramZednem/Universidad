package Retornos;

public class Main {
    public static void main(String[] args) {
        DatosBiometricos objeto = new DatosBiometricos();
        String nombre = objeto.nombre();
        int edad = objeto.edad();
        double estatura= objeto.estatura();
        double peso = objeto.peso();
        char letra = objeto.letra();

        objeto.mostrarResultados(nombre,edad,estatura,peso,letra);
    }
}
