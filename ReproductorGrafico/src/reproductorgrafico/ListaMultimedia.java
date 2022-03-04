/**
 *
 * ESTA CLASE  NOS SIRVE PARA VERIFICAR LOS DATOS AL METERLOS A NUESTRA LISTA
 * Y AGREGAR UNA POR UNA LAS PELICULAS SEPARANDOLAS CON DOS SALTOS DE LINEA
 *
 */
package reproductorgrafico;
public class ListaMultimedia {
    //Atributos
    private  Multimedia lista[];
    private int contador;

    //METODOS:
    /*               Esto es el constructor     */
    public ListaMultimedia(int tamañoMaximo) {
        lista = new Multimedia[tamañoMaximo];
        ///LO IMPORTANTE DEl CODIGO ES ESTO PQ BASICAMENTE MI LISTA ES IGUAL A LO QUE ESTA EN EL ARREGLO MULTIMEDiA
        contador = 0;
    }


    public boolean add(Multimedia datosMultimedia) {
        if (contador == lista.length)
        {
            System.out.println("No se pueden ingresar valores, la lista esta llena!");
            return false;
        }
        else
        {
            lista[contador] = datosMultimedia;
            contador++;
            return true;
        }
    }

    public String toString() { //Y ESTE CICLO ES REPETIDO HASTA EL TOTAL DE PELICULAS
        String s = "";
        for (int i = 0; i < contador; i++) {
            s += lista[i].toString() + "\n\n";
        }
        return s;
    } 
}
