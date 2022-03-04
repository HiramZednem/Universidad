package paquete1;

public class division extends operaciones{
    //Atributo
    double resultadoOperacion;
    public void dividir(){
        pedirDatos();
        resultadoOperacion = n1 / n2;
        resultado = "La multiplicación de "+n1+" / "+n2+" = "+resultadoOperacion;
        resultado();
    }
}
