import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Alumnos> Alumnos = new ArrayList();

    public static void registroAlumnos(){
        Alumnos aux = new Alumnos();
            //OPTIMIZACION DE CODIGO
            aux.setNombre(JOptionPane.showInputDialog("Introduzca el nombre del Alumno: "));
            aux.setGrupo(JOptionPane.showInputDialog("Introduzca el grupo del Alumno"));
            aux.setCalificacion(Double.parseDouble(JOptionPane.showInputDialog("Introduzca promedio del Alumno")));
            Alumnos.add(aux);
    }
    public static void verAlumnos(){
        if (Alumnos.size()==0){
            JOptionPane.showMessageDialog(null,"No hay Alumnos Registrados!");
        }
        else {
            System.out.println("\nAlumnos Registrados:");
            for (int i = 0; i < Alumnos.size(); i++) {
                System.out.println(Alumnos.get(i));
            }
        }
    }
    public static void alumnoMayorCalificacion(){
        Alumnos mayor = Alumnos.get(0);
        for(int i = 0; i < Alumnos.size(); i++){
            if(Alumnos.get(i).getCalificacion() > mayor.getCalificacion())
                mayor = Alumnos.get(i);
        }
        System.out.println("\nAlumno con Calificacion mas alta:");
        System.out.println(mayor);
    }
    public static void main(String[] args) {
        do {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione opcion: \n" +
                    "1. Registrar Alumno\n" +
                    "2. Ver Alumnos Registrados\n" +
                    "3. Ver Alumno con Calificacion mas alta\n" +
                    "4. Limpiar Datos\n" +
                    "5. ¿Hay alumnos registrados?"));
            switch (opc){
                case 1:
                    registroAlumnos();
                    break;
                case 2:
                    verAlumnos();
                    break;
                case 3:
                    alumnoMayorCalificacion();
                    break;
                case 4:
                    Alumnos.clear();
                    break;
                case 5:
                    if (Alumnos.isEmpty()){
                        JOptionPane.showMessageDialog(null,"No, no hay elementos registrados");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Si, hay alumnos registrados");
                    }
                    break;
            }
        }while (true);



    }
}
