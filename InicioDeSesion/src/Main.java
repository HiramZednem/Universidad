import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /* Crear por medio de un Arraylist un sistema de inicio de sesion, que compruebe
    si el dato escrito ya esta registrado
     */
    static ArrayList<Usuario> lista = new ArrayList<>();
    public static void main(String[] args) {

        Usuario registro;
        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione Opcion Deseada: \n1.Iniciar Sesion\n2.Registrarse"));
            switch (opc) {
                case 1:
                    verificarUsuario();
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
                    int contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su contraseña numerica: "));
                    registro = new Usuario(nombre, contraseña);
                    lista.add(registro);
                    break;
                case 3:
                    String impresion="";
                    for(int i=0; i< lista.size();i++){
                        impresion+= lista.get(i).Imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,impresion);

                    lista.get(0).PilaUsuario.push("Hola persona 0, te estoy enviando un mensajes de prueba");
                    System.out.println(lista.get(0).PilaUsuario.pop());

            }
        }while (true);
    }

    public static void verificarUsuario(){
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre de inicio de sesion: ");

        for (int i=0; i< lista.size();i++){

            String aux = lista.get(i).getNombre();

            if (nombre.equals(aux))
            {
                System.out.println("ya chingaste");
            }
        }

    }
}
