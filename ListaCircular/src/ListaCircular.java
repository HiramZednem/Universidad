public class ListaCircular {

    private nodo inicio;
    private nodo ultimo;

    private int tam;

    public void ListaCircular() {
        inicio = null;
        ultimo = null;
        tam = 0;
    }

    // consulta si la lista esta vacia
    // el return es true si el primer nodo (inici)no apunta a otro nodo
    public boolean esVacia() {
        return inicio == null;
    }

    // consulta cuantos elementos tiene la lista
    public int getTam() {
        return tam;
    }

    public void agregarFinal(String valor) {
        nodo nuevo = new nodo();
        nuevo.setValor(valor);

        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;

            ultimo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevo);

            nuevo.setSiguiente(inicio);

            ultimo = nuevo;
        }
        tam++;
    }

    public String getValor(int posicion) throws Exception {
        nodo aux = inicio;
        // verifica si la posicion dada por el usuarioo se encuantra en el rango
        if (posicion >= 0 && posicion < tam) {
            if (posicion == 0) {
                // retorna el valor del inio de la lista
                return inicio.getValor();
            } else {
                // Se crea una copia de la lista
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }

        }
        return "Bodega no valida";
    }





    public void editarPosicion(int posicion, String valor) {

        if (posicion >= 0 && posicion < tam) {
            if (posicion == 0) {
                inicio.setValor(valor);
            }

            else {
                nodo aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();

                }
                aux.setValor(valor);
            }
        }
    }

    public void eliminarPosicion(int posicion) {
        if (posicion >= 0 && posicion < tam) {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();

                ultimo.setSiguiente(inicio);
            } else {
                nodo aux = inicio;

                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
            }
            tam--;
        }
    }

    public void mostrar() {
        if (!esVacia()) {
            nodo aux = inicio;
            int i = 0;
            System.out.print("-> ");
            do {
                System.out.print("Bodega "+ i + ".[ " + aux.getValor() + " ]" + " -> ");
                aux = aux.getSiguiente();
                i++;
            } while (aux != inicio);
            System.out.println("\n");
        }
    }
}