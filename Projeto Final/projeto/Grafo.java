package projeto;

import java.util.ArrayList;

public class Grafo<T> {  // "T": algum tipo de dado
    private ArrayList <Vertice<T>> vertices;
    private ArrayList<Aresta<T>> arestas;
    private int id;

    public Grafo() {
        vertices = new ArrayList<Vertice<T>>();
        arestas = new ArrayList<Aresta<T>>();
        id = 0;
    }

    // ---------------------------------------------------

    private void setId() { ++id; }

    public ArrayList<Vertice<T>> getVertices() {
        return vertices;
    }

    public ArrayList<Aresta<T>> getArestas() {
        return arestas;
    }

    // ---------------------------------------------------

    public void adicionarVertice(T dado) {
        Vertice<T> novoVertice = new Vertice<T>(dado, id);
        vertices.add(novoVertice);
        setId();
    }

    public void modificarDadoDoVertice(int posDoVertice, T novoDado) {  
        // Recebe a posição do vértice para modificar o dado desse vértice
        vertices.get(posDoVertice).setDado(novoDado);
    }

    public void adicionarAresta(int idDaOrigem, int idDoDestino) {
        Vertice<T> origem = buscaVertice(idDaOrigem);
        Vertice<T> destino = buscaVertice(idDoDestino);

        if (!validaAresta(origem, destino)) {
            System.out.println("\nAresta inválida!!");
            return;
        }

        Aresta<T> novaAresta = new Aresta<T>(origem, destino);
        origem.adicionarArestaDeSaida(novaAresta);
        arestas.add(novaAresta);
    }

    public Vertice<T> buscaVertice(int idDoVertice) {
        Vertice<T> v = null;

        for (int i=0; i<vertices.size(); i++) 
            if (vertices.get(i).getId() == idDoVertice) {
                
                v = vertices.get(i); break;
            }

        return v;
    }

    private boolean validaAresta(Vertice<T> a, Vertice<T> b) {
        if (a==null || b==null)
            return false;

        return true;
    }

    public void buscaEmLargura() {
        ArrayList<Vertice<T>> listaDeVisitados = new ArrayList<Vertice<T>>();
        ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();

        Vertice<T> raiz = vertices.get(0);

        listaDeVisitados.add(raiz);
        System.out.println(raiz.getDado());
        fila.add(raiz);

        Vertice<T> visitado, proximo;
        int i;

        while(fila.size() > 0) {
            visitado = fila.get(0);

            // Quantidade de arestas de saída do visitado
            int quantArestasDeSaida = visitado.getArestasDeSaida().size();

            for (i=0; i<quantArestasDeSaida; i++) {
                // Guarda o vertice de destino do vertice atual que são ligadas pela aresta de saída
                proximo = visitado.getArestasDeSaida().get(i).getDestino();
                
                if (!listaDeVisitados.contains(proximo)) {
                    listaDeVisitados.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }

            // Remove o visitado
            fila.remove(0);
        }
    }
}
