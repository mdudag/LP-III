package projeto;

import java.util.ArrayList;

public class PrintTabuleiro extends Grafo<String> {
        private Grafo<String> tab;
        private int posiPrimeiroVerticeLinha[];
        private String stringAnterior;
        private final int qntNiveis = 9;

        public PrintTabuleiro() {
            super();
            criaTab();
                    //  2*0  2*1
            int aux[] = {0, 1, 3, 6, 10, 15, 21, 28, 36};  // se 36   44
            posiPrimeiroVerticeLinha = aux;
            stringAnterior = "";
        }

        // ---------------------------------------------------

        public void criaTab() {
            tab = new Grafo<String>();

            adicionarVertice();
            ArrayList<ArrayList<Integer>> aux = posicoesVertices();
            adicionarAresta(aux);
        }

        private void adicionarVertice() {
            tab.adicionarVertice("#");

            for (int i=1; i<45; i++) 
                tab.adicionarVertice("o");
        }

        public ArrayList<ArrayList<Integer>> posicoesVertices() {
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();

            ArrayList<Integer> x0 = new ArrayList<>();
            ArrayList<Integer> x1 = new ArrayList<>();
            ArrayList<Integer> x2 = new ArrayList<>();
            ArrayList<Integer> x3 = new ArrayList<>();
            ArrayList<Integer> x4 = new ArrayList<>();
            ArrayList<Integer> x5 = new ArrayList<>();
            ArrayList<Integer> x6 = new ArrayList<>();       
            ArrayList<Integer> x7 = new ArrayList<>(); 
            ArrayList<Integer> x8 = new ArrayList<>();
                            
            int inicio=0, j=0;

            for (int i=0; i<qntNiveis; i++) {   
                inicio+=i;

                for (j=inicio; j<inicio+i+1; j++) {
                    switch(i) {
                        case 0: x0.add(j); break;
                        case 1: x1.add(j); break;
                        case 2: x2.add(j); break;
                        case 3: x3.add(j); break;
                        case 4: x4.add(j); break;
                        case 5: x5.add(j); break;
                        case 6: x6.add(j); break;
                        case 7: x7.add(j); break;
                        case 8: x8.add(j); break;
                    }
                }
            }

            a.add(x0); a.add(x1); a.add(x2);
            a.add(x3); a.add(x4); a.add(x5);
            a.add(x6); a.add(x7); a.add(x8);

            return a;
        } 

        private void adicionarAresta(ArrayList<ArrayList<Integer>> a) {
            int cont=0, j, k;

            for (int i=0; i<qntNiveis-1; i++) {     
                k=0; 

                for (j=0; j < a.get(i).size(); j++) {   
                    cont=0;
                    
                    while (true) {
                        tab.adicionarAresta(a.get(i).get(j), a.get(i+1).get(k));
                        
                        if (++cont==2) break;
                        k++;
                    }
                }
            }
        }

        public void printDadoVertice(int pos, String dado) {
            int num=0;

            if (pos!=0)
                num = primeiroDaLinha(pos);
             
            if (num!=-1) {
                if (pos!=0) {  // Para imprimir as arestas
                    int aux2 = 17 - (num-1)*2;
                    String esp2 = quantString(" ", aux2-1);
                    String arestas = quantString("/ \\ ", num);

                    System.out.println("\n" + esp2 + arestas);
                }

                // Para imprimir os vértices
                int aux = 17 - num*2;
                String esp1 = quantString(" ", aux);

                System.out.print(esp1);
            }
            // System.out.println("dadoPos: " + pos);
            System.out.print(dado + "   ");    
            //  MetodoStatic.systemPause();
        }

        static public String quantString(String str, int quant) {
            String aux = "";

            for (int i=0; i<quant; i++)
                aux += str;
            
            return aux;
        }   

        public int primeiroDaLinha(int pos) {
            int aux[] = posiPrimeiroVerticeLinha;

            for (int i=0; i<aux.length; i++) 
                if (pos == aux[i])
                    // O valor é usado para imprimir determinada quant de arestas 
                    return i;

            return -1;
        }

        @Override
        public void buscaEmLargura() {
            ArrayList<Vertice<String>> listaDeVisitados = new ArrayList<Vertice<String>>();
            ArrayList<Vertice<String>> fila = new ArrayList<Vertice<String>>();

            Vertice<String> raiz = tab.getVertices().get(0);

            listaDeVisitados.add(raiz);
            System.out.println();
            printDadoVertice(0, raiz.getDado());
    
            fila.add(raiz);

            Vertice<String> visitado, proximo;
            int i=0, j;

            while(fila.size() > 0) {
                visitado = fila.get(0);

                // Quantidade de arestas de saída do visitado
                int quantArestasDeSaida = 2;

                for (j=0; j<quantArestasDeSaida; j++) {
                    ++i;

                    // Guarda o vertice "destino" que é ligado ao vertice "atual" (origem), 
                    // são ligadas pela aresta de saída do vertice "atual"
                    proximo = visitado.getArestasDeSaida().get(j).getDestino();
                    
                    if (!listaDeVisitados.contains(proximo)) {
                        listaDeVisitados.add(proximo);
                        printDadoVertice(proximo.getId(), proximo.getDado());

                        // Se não forem os últimos vértices
                        if (proximo.getId()<36)
                            fila.add(proximo);
                    }
                }

                // Remove o visitado
                fila.remove(0);
            }

            System.out.println("\n");
        }

        public void printTabuleiro(int nivel, int direcao) {
            // Para retirar a setinha que aponta ao nível anterior neste momento
            int aux[] = posiPrimeiroVerticeLinha;
            int i;

            if (nivel>0 && stringAnterior!="") {
                tab.modificarDadoDoVertice(aux[nivel]-1, stringAnterior);
            }

            switch(nivel) {
                case 0:                           break; // Apenas mostra o nível 0
                case 1: modificaNivel1(direcao);  break;
                case 2: modificaNivel2(direcao);  break;
                case 3: modificaNivel3(direcao);  break;
                case 4: modificaNivel4(direcao);  break;
                case 5: modificaNivel5(direcao);  break;
                case 6: modificaNivel6(direcao);  break;
                case 7: modificaNivel7(direcao);  break;
                case 8: modificaNivel8(direcao);  break;
                default: 
                    System.out.println("\nErro! Esse nível não existe."); return;
            }
    
            // Acrescenta uma setinha para identificar o nível no tabuleiro
            //if (nivel != 0) 
                // Posição do vértice na lista de vértices
                int j;

                if (nivel!=8) j = aux[nivel+1]-1;
                else          j = 44;  // última posição do vértice do tabuleiro

                stringAnterior = tab.getVertices().get(j).getDado();
                tab.modificarDadoDoVertice(j, stringAnterior + "  <-");
            
            // Para imprimir o tabuleiro
            buscaEmLargura();
    }

    public void printTabuleiro() {  
        printTabuleiro(0, 0);
    }

    private void modificaNivel1(int direcao) {
        int aux = posiPrimeiroVerticeLinha[1];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            default: tab.modificarDadoDoVertice(aux+1, "#");  break;
        }
    }

    private void modificaNivel2(int direcao) {
        int aux = posiPrimeiroVerticeLinha[2];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "@");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            default: tab.modificarDadoDoVertice(aux+2, "#");  break;
        }
    }

    private void modificaNivel3(int direcao) {
        int aux = posiPrimeiroVerticeLinha[3];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "#");  break;
            default: tab.modificarDadoDoVertice(aux+3, "@");  break;
        }
    }

    private void modificaNivel4(int direcao) {
        int aux = posiPrimeiroVerticeLinha[4];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "@");  break;
            case 3:  tab.modificarDadoDoVertice(aux+3, "#");  break;
            default: tab.modificarDadoDoVertice(aux+4, "#");  break;
        }
    }

    private void modificaNivel5(int direcao) {
        int aux = posiPrimeiroVerticeLinha[5];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "@");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "@");  break;
            case 3:  tab.modificarDadoDoVertice(aux+3, "#");  break;
            case 4:  tab.modificarDadoDoVertice(aux+4, "@");  break;
            default: tab.modificarDadoDoVertice(aux+5, "#");  break;
        }
    }

    private void modificaNivel6(int direcao) {
        int aux = posiPrimeiroVerticeLinha[6];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "@");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "#");  break;
            case 3:  tab.modificarDadoDoVertice(aux+3, "#");  break;
            case 4:  tab.modificarDadoDoVertice(aux+4, "@");  break;
            case 5:  tab.modificarDadoDoVertice(aux+5, "#");  break;
            default: tab.modificarDadoDoVertice(aux+6, "@");  break;
        }
    }

    private void modificaNivel7(int direcao) {
        int aux = posiPrimeiroVerticeLinha[7];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "#");  break;
            case 3:  tab.modificarDadoDoVertice(aux+3, "#");  break;
            case 4:  tab.modificarDadoDoVertice(aux+4, "@");  break;
            case 5:  tab.modificarDadoDoVertice(aux+5, "@");  break;
            case 6:  tab.modificarDadoDoVertice(aux+6, "#");  break;
            default: tab.modificarDadoDoVertice(aux+7, "#");  break;
        }
    }

    private void modificaNivel8(int direcao) {
        int aux = posiPrimeiroVerticeLinha[8];

        switch(direcao) {
            case 0:  tab.modificarDadoDoVertice(aux, "#");    break;
            case 1:  tab.modificarDadoDoVertice(aux+1, "#");  break;
            case 2:  tab.modificarDadoDoVertice(aux+2, "#");  break;
            case 3:  tab.modificarDadoDoVertice(aux+3, "@");  break;
            case 4:  tab.modificarDadoDoVertice(aux+4, "#");  break;
            case 5:  tab.modificarDadoDoVertice(aux+5, "#");  break;
            case 6:  tab.modificarDadoDoVertice(aux+6, "#");  break;
            case 7:  tab.modificarDadoDoVertice(aux+7, "@");  break;
            default: tab.modificarDadoDoVertice(aux+8, "#");  break;
        }
    }
}
