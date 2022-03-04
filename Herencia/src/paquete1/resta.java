package paquete1;

public class resta extends operaciones {
    //Atributo
    double resultadoOperacion;
    public void restar(){
        pedirDatos();
        resultadoOperacion = n1 - n2;
        resultado = "La resta de "+n1+" - "+n2+" = "+resultadoOperacion;
        resultado();
    }
}
