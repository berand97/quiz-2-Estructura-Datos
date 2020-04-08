package unac.edu.co;

public class ListaCD {
    Nodo primero;
    Nodo ultimo;

    public ListaCD() {

        primero = null;
        ultimo = null;

    }

    public void Insertar(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setDato(x);

        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;

        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
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
            System.out.println("\t Lista Circular vac�a.");
        }
    }

}
