import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = new int[5];

        //Guardar datos en el arreglo;
        for (int i=0;i<5;i++)
        {
            System.out.print((i+1)+". Introduce numero: ");
            arreglo[i]= sc.nextInt();
        }

        //Igualar un auxiliar
        int arregloAux[] = new int[5];
        System.out.println("ArregloAux");
        for (int i=0;i<5;i++)
        {
            arregloAux[i] = arreglo[i];
        }

        //Ordenar en nuevo arreglo ||MAYOR A MENOR
        int arregloOrdenado[] = new int[5];
        int indice=0;
        for (int i=0;i<5;i++)
        {
            for (int j=0; j<5;j++)
            {
                if (arregloAux[indice] > arregloAux[j])
                {
                    indice=j;
                }
            }
            arregloOrdenado[i] = arregloAux[indice];
            arregloAux[indice] = 99999999;
            indice=0;

        }

        //imprimir arreglo

        for (int i=0;i<5;i++)
        {
            System.out.println("Numero "+(i+1));
            System.out.println(arregloOrdenado[i]);
        }





    }
}
