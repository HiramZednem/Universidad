package ClasesYObjetos;

import javax.swing.*;

public class Casa {
    //Atributos
    String Color;
    int Numero;
    int Baños;

    public static void main(String[] args) {
        Casa micasa = new Casa(); //Objeto mi casa
        micasa.Color = "Morada";
        micasa.Numero = 512;
        micasa.Baños = 3;

        Casa tienda = new Casa(); //objeto casa doña marely
        tienda.Color= "Naranja";
        tienda.Numero = 624;
        tienda.Baños = 4;

        JOptionPane.showMessageDialog(null, "El color de la casa es: "+micasa.Color+"\n"+
                "El numero de la casa es: "+ micasa.Numero+"\n"+
                "El numero de baños de la casa es: "+micasa.Baños);

        JOptionPane.showMessageDialog(null, "El color de la casa es: "+tienda.Color+"\n"+
                "El numero de la casa es: "+ tienda.Numero+"\n"+
                "El numero de baños de la casa es: "+tienda.Baños);
    }
}
