package projeto;

import java.util.ArrayList;

public class Vertice<T> {
    private T dado;
    private final int id;
    private ArrayList<Aresta<T>> arestasDeSaida;

    public Vertice(T dado, int id) {
        this.dado = dado;
        this.id = id;
        arestasDeSaida = new ArrayList<Aresta<T>>();
    }

    // ---------------------------------------------------

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public final int getId() {
        return id;
    }

    public ArrayList<Aresta<T>> getArestasDeSaida() {
        return arestasDeSaida;
    }

    // ---------------------------------------------------

    public void adicionarArestaDeSaida(Aresta<T> aresta) {
        arestasDeSaida.add(aresta);
    }
}
