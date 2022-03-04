package ExplicacionKeyla;

public class CuboAgua extends Clubo{
    public CuboAgua(String nombre) {
        super(nombre);
    }

    public void colocar() {
        super.colocar(); //ESTA PALLABRA INDICA QUE REUTILIZARA EL CODIGO
        System.out.println(" y me expandi");
    }
}

