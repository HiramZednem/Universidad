package paquete1;

public class suma extends operaciones{
    //Atributo
    double resultadoOperacion;
    public void sumar(){
        pedirDatos();
        resultadoOperacion = n1 + n2;
        resultado = "La suma de "+n1+" + "+n2+" = "+resultadoOperacion;
        resultado();
    }
}
