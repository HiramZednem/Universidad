package paquete1;

public class resta extends operaciones{
    //Atributos

    //Constructores


    public resta() {
    }

    public resta (int n1, int n2, String resultado){
        super(n1,n2,resultado);

    }



    public void restar(){
        ObtenerNumeros(); //Como es público lo puedo mandar a llamar




    }

    @Override
    public String toString() {
        return super.toString()+" la resta es: "+(getN1()-getN2());
    }
}
