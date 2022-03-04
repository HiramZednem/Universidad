package paquete1;

public class Nodo {
    Object valor;
    Nodo siguiente;


    /*||=====CONSTRUCTOR=====||*/

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    /*||=====================||*/

    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    public Object getValor() {
        return valor;
    }


}

