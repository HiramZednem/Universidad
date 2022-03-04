package paquete1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de datos que tendra el arreglo: ");
        int cantidadArreglo = sc.nextInt();

        int arreglo[] = new int[cantidadArreglo];

        for (int i=0; i<cantidadArreglo; i++)
        {
            System.out.print((1+i)+". Ingrese numero: ");
            arreglo[i]=sc.nextInt();
        }

        //METODO BURBUJA PARA ORDENAR ARREGLO
        int aux;
        for (int i=0; i < cantidadArreglo-1;i++)
        {
            for (int j=0;j<cantidadArreglo-1;j++)
            {
                if (arreglo[j] > arreglo[j+1])
                {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }

        //IMPRESION CRECIENTE
        System.out.println("Impresion creciente:");
        for (int i=0; i<cantidadArreglo;i++)
        {
            System.out.println((i+1)+". "+arreglo[i]);
        }
    }
}
