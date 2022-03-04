package paquete1;

public class suma extends operaciones {
    //Atributos

    //Constructores


    public suma() {
    }

    public suma (int n1, int n2, String resultado){
        super(n1,n2,resultado);

    }



    public void sumar(){
        ObtenerNumeros(); //Como es público lo puedo mandar a llamar




    }

    @Override
    public String toString() {
        return super.toString()+" la suma es: "+(getN1()+getN2());
    }
}
