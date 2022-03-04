import javax.swing.*;
import java.util.List;

public class EjemploListaCircular {

    public static void main(String[] args) throws Exception {

        ListaCircular listaCircular = new ListaCircular();
        do {
//Los nodos seran bodegas y e nvez de numeros carros
            int opc = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Carro Nuevo a Bodega disponible\n2. Mostar Carros \n3. Numero de Carros en Almancenes\n4. Consultar Carro por Bodega\n" +
                    "5. Cambiar Carro de Bodega\n6. Vender Carro y reccorrer bodegas\n0. Salir")) ;
            switch (opc){
                case 1:
                    listaCircular.agregarFinal(JOptionPane.showInputDialog("Ingrese Nombre de carro:: "));

                    break;
                case 2:
                    listaCircular.mostrar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"El numero de carros actuales es de: "+listaCircular.getTam());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, listaCircular.getValor(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Bodega a consultar: "))));
                    break;
                case 5:
                    listaCircular.editarPosicion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese nBodega a Cambiar: ")), JOptionPane.showInputDialog("Ingrese Carro a Cambiar: "));
                    JOptionPane.showMessageDialog(null,"Dato actualizado!");
                    break;
                case 6:
                    listaCircular.eliminarPosicion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Bodega donde se encuentra el vehiculo")));
                    JOptionPane.showMessageDialog(null,"Vehiculos vendidos!");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingrese un dato valido");
            }
        }while (true);




    }
}
