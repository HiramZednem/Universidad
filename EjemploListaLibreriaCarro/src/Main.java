/*
    En un futuro agregar una funcion para limpiar las unidades registradas
    y poder volver registrar unidades
     (Hacerlo una cola con el mismo sistema)

     Contador de horas: 6
*/
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList VehiculosA = new ArrayList();
    //METODOS
    public static void registrarUnidades(Carros unidades[],int unidadesR){
        Scanner sc = new Scanner(System.in);

        String marca;
        int anio;
        double precio;

        for (int i=0;i < unidadesR-1;i++)
        {

            System.out.print("Introduce la Marca de la unidad "+(i+1)+": "); marca = sc.nextLine();
            System.out.print("Introduce el Año de la unidad "+(i+1)+": "); anio = sc.nextInt();
            System.out.print("Introduce el Precio de la unidad "+(i+1)+": "); precio = sc.nextDouble();
            System.out.println("=============================================");
            sc.nextLine();
            unidades[i] = new Carros(marca,anio,precio);
            VehiculosA.add(unidades[i]);

        }

    }

    public static int buscarNueva(Carros unidad[]){
        int nUnidad=0;
        for(int i=1;i< unidad.length;i++)
        {
            if(unidad[nUnidad].getAnio() < unidad[i].getAnio())
            {
                nUnidad=i;
            }
        }
        return nUnidad;
    }

    public static int buscarVieja(Carros unidad[]){
        int nUnidad=0;
        for(int i=1;i< unidad.length;i++)
        {
            if(unidad[nUnidad].getAnio() > unidad[i].getAnio())
            {
                nUnidad=i;
            }
        }
        return nUnidad;
    }

    public static int buscarBarata(Carros unidad[]){
        int nUnidad=0;
        for(int i=1;i< unidad.length;i++)
        {
            if(unidad[nUnidad].getPrecio() > unidad[i].getPrecio())
            {
                nUnidad=i;
            }
        }
        return nUnidad;
    }

    public static int buscarCara(Carros unidad[]){ //+
        int nUnidad=0;
        for(int i=1;i< unidad.length;i++)
        {
            if(unidad[nUnidad].getPrecio() < unidad[i].getPrecio())
            {
                nUnidad=i;
            }
        }
        return nUnidad;
    }

    //===========================METODO BURBUJA==============================//
    public static void ordenarAnio(Carros ordenAnio[]){

        Carros aux[] = new Carros[ordenAnio.length]; //creo mi objeto auxiliar

        //Existencia de datos en aux para evitar errores?
        for(int i=0;i< ordenAnio.length;i++) {
            aux[i]=ordenAnio[i];
        }

        for (int i=0; i < ordenAnio.length-1;i++){
            for (int j=0; j< ordenAnio.length-1;j++){
                if (ordenAnio[j].getAnio() > ordenAnio[j+1].getAnio()){
                    ordenAnio[j]=aux[j];
                    ordenAnio[j] = ordenAnio[j+1];
                    ordenAnio[j+1] = aux[j];
                }
            }
        }
    }

    public static void ordenarPrecio(Carros ordenPrecio[]){

        Carros aux[] = new Carros[ordenPrecio.length]; //creo mi objeto auxiliar

        //Existencia de datos en aux para evitar errores?
        for(int i=0;i< ordenPrecio.length;i++) {
            aux[i]=ordenPrecio[i];
        }

        for (int i=0; i < ordenPrecio.length-1;i++){
            for (int j=0; j< ordenPrecio.length-1;j++){
                if (ordenPrecio[j].getPrecio() > ordenPrecio[j+1].getPrecio()){
                    ordenPrecio[j]=aux[j];
                    ordenPrecio[j] = ordenPrecio[j+1];
                    ordenPrecio[j+1] = aux[j];
                }
            }
        }
    }
    //METODO MAIN

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int unidadesR;
        int nUnidad;

        unidadesR = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades van a ser registradas? "));
        while (unidadesR <=0){
            JOptionPane.showMessageDialog(null, "Ingrese un valor valido!");
            unidadesR = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades van a ser registradas? "));
        }

        Carros unidades[] = new Carros[unidadesR]; // CREO MI OBJETO

        Carros ordenAnio[] = new Carros[unidadesR]; //CREO UN OBJETO PARA EL ORDEN DE ANIOS
        Carros ordenPrecio[] = new Carros[++unidadesR];

        registrarUnidades(unidades,unidadesR);

        for(int i=0; i<unidadesR-1;i++)
        {
            ordenAnio[i]=unidades[i];
            ordenPrecio[i]=unidades[i];
        }



        do {
            int opc;
            opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opcion deseada:\n" +
                    "1. Buscar unidad mas nueva\n" +
                    "2. Buscar unidad mas vieja\n" +
                    "3. Buscar unidad mas barata\n" +
                    "4. Buscar unidad mas cara\n" +
                    "5. Lista unidades mas nuevo al mas viejo\n" +
                    "6. Lista unidades mas viejo al mas nuevo\n" +
                    //Unidades ordenadas por precio
                    "7. Lista unidades mas caro al mas barato\n" +
                    "8. Lista unidades mas barato al mas caro\n" +
                    "0. Salir"));
            switch (opc){
                case 1:
                    nUnidad = buscarNueva(unidades);
                    System.out.println("La unidad mas nueva es: ");
                    unidades[nUnidad].MostrarCarroIndividual();
                    break;
                case 2:
                    nUnidad = buscarVieja(unidades);
                    System.out.println("La unidad mas vieja es: ");
                    unidades[nUnidad].MostrarCarroIndividual();
                    break;
                case 3:
                    nUnidad = buscarBarata(unidades);
                    System.out.println("La unidad mas barata es: ");
                    unidades[nUnidad].MostrarCarroIndividual();
                    break;
                case 4:
                    nUnidad = buscarCara(unidades);
                    System.out.println("La unidad mas cara es: ");
                    unidades[nUnidad].MostrarCarroIndividual();
                    break;
                case 5:
                    ordenarAnio(ordenAnio);
                    System.out.println("Mas nuevo al mas viejo");
                    for (int i= (ordenAnio.length-1);i >= 0; i--){
                        ordenAnio[i].MostrarCarroIndividual();
                    }
                    break;
                case 6:
                    ordenarAnio(ordenAnio);
                    System.out.println("Mas viejo al mas nuevo:");
                    for (int i=0;i < ordenAnio.length; i++){
                        ordenAnio[i].MostrarCarroIndividual();
                    }
                    break;
                case 7:
                    ordenarPrecio(ordenPrecio);
                    System.out.println("Lista del mas caro al mas barato");
                    for (int i= (ordenPrecio.length-1);i >= 0; i--){
                        ordenPrecio[i].MostrarCarroIndividual();
                    }
                    break;
                case 8:
                    ordenarPrecio(ordenPrecio);
                    System.out.println("Mas barato al mas caro:");
                    for (int i=0;i < ordenPrecio.length; i++){
                        ordenPrecio[i].MostrarCarroIndividual();
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }while(true);

    }
}
