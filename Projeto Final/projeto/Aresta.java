package projeto;

public class Aresta<T> {
    private Vertice<T> origem;
    private Vertice<T> destino;

    public Aresta(Vertice<T> origem, Vertice<T> destino) {
        this.origem = origem;
        this.destino = destino;
    }   

    // ---------------------------------------------------

    public Vertice<T> getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice<T> novaOrigem) {
        origem = novaOrigem;
    }

    public Vertice<T> getDestino() {
        return destino;
    }

    public void setDestino(Vertice<T> novoDestino) {
        destino = novoDestino;
    }
}
