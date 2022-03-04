import java.util.Scanner;

public class Main {
    public static int calcularMenor(Carros vehiculos[]){
        int indice=0;
        vehiculos[0].getPrecio();
        for (int i = 1;i< vehiculos.length;i++)
        {
            if(vehiculos[indice].getPrecio() > vehiculos[i].getPrecio()) //321 > 456 -F 321 > 2
            {
                indice = i;
            }
        }

        return indice;
    }




    public static void main(String[] args) {
        //Atributos
        String marca;
        int modelo;
        double precio;

        //Creo Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos vehiculos se van a registrar?");
        int vehiculosNumeroRegistros = sc.nextInt();

        //Creo un array de objetos donde guardare los atributos;
        Carros vehiculos[] = new Carros[vehiculosNumeroRegistros];

        for(int i=0;i<vehiculos.length;i++)
        {
            sc.nextLine();
            System.out.println("Carro "+(i+1)+":");
            System.out.print("Ingrese marca: "); marca = sc.nextLine();
            System.out.print("Ingrese modelo: "); modelo = sc.nextInt();
            System.out.print("Ingrese precio: "); precio = sc.nextDouble();

            vehiculos[i] = new Carros(marca,modelo,precio);
        }
        int indiceMasBarato=calcularMenor(vehiculos);
        vehiculos[indiceMasBarato].imprimirResultados();
    }
}
