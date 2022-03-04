package paquete1;

public class multiplicacion extends operaciones{
    //Atributo
    double resultadoOperacion;
    public void multiplicar(){
        pedirDatos();
        resultadoOperacion = n1 * n2;
        resultado = "La multiplicacion de "+n1+" * "+n2+" = "+resultadoOperacion;
        resultado();
    }
}
