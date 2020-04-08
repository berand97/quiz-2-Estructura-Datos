package unac.edu.co;

public class GrandeInteger {
    //crear una lista
    Nodo primero;

    public GrandeInteger() {
        primero=null;
    }

    public void Insertar(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setDato(x);

        if (primero == null) {
            primero = nuevo;

        } else {
            Nodo ultimo=primero.getAnterior();
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            primero.setAnterior(ultimo);
        }

    }

    public void visualizar() {

        Nodo actual;

        actual = primero;

        if (actual != null) {
            do {
                System.out.print(actual.getDato() + " ");

                actual = actual.getSiguiente();

            } while (actual != primero);

        } else {
            System.out.println("\t Lista Circular vacía.");
        }
    }


}
