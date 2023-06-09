package projeto;

import java.lang.System;  

public class JogoTabuleiro implements Jogo {
    static final public int QUANT_JOGADORES = 2;  // Quantidade permitida de jogadores
    static public short nivelAtual;
    private Tabuleiro tab1, tab2;   // Relacionamento de Agregação

    public JogoTabuleiro(Tabuleiro tab1, Tabuleiro tab2) {
        this.tab1 = tab1;
        this.tab2 = tab2;
        nivelAtual = 0;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("\n -------------------------------   MOEDAS DA SALVAÇÃO   -------------------------------\n"); 
        // System.out.println();

        contextoDoJogo(); MetodoStatic.systemPause();
        informacoesDoJogo(); MetodoStatic.systemPause();
        fimContextualizacao(); MetodoStatic.systemPause();

        MetodoStatic.limpaTela();

        System.out.println("Iniciando Jogo...\n"); 
        mudarNomeJogadores();

        System.out.println("\n  --- Tabuleiro dos Jogadores ---\n");
        mostrarTabuleiroDoJogo(1, 0);
        MetodoStatic.systemPause();

        mudarNivel();
    } 

    @Override
    public void contextoDoJogo() {
        System.out.println("\n  No coração da civilização asteca havia uma tribo que adorava seus deuses atraves"+
                           "\n de rituais de sacrifício humano. Os astecas acreditavam que essas ofertas eram"+
                           "\n necessárias para garantir o equilíbrio entre o mundo humano e o divino.");

        MetodoStatic.systemPause();
        
        System.out.println("\n  Em meio a esses tempos sombrios, dois prisioneiros capturados se encontravam"+
                           "\n em uma situação desesperadora...");

        MetodoStatic.systemPause();

        System.out.println("\n  Eles foram levados para o centro cerimonial, onde um jogo de tabuleiro místico"+
                           "\n foi preparado para determinar o destino deles. Os astecas acreditavam que os deuses"+
                           "\n concederiam uma chance de sobrevivência, e a competição seria realizada em um"+
                           "\n labirinto na densa floresta. No entanto, havia uma condição: apenas um deles poderia"+
                           "\n escapar e a decisão seria baseada na quantidade de moedas coletadas.");
    }

    @Override
    public void informacoesDoJogo() {
        System.out.println(" __| |____________________________________________________________________| |__\n" + 
                           "(__   ____________________________________________________________________   __)\n" +
                           "   | |                                                                    | |\n" + 
                           "   | |                      INFORMAÇÕES SOBRE O JOGO                      | |\n" +
                           "   | |                   -----------------------------                    | |\n" + 
                           "   | |                                                                    | |\n" + 
                           "   | |   - Quantidade de jogadores: "+QUANT_JOGADORES+"                                     | |\n" + 
                           "   | |   - Para passar pelos caminhos você precisa agitar o amuleto       | |\n" + 
                           "   | |     para que ele defina qual caminho seguir.                       | |\n" + 
                           "   | |   - Para agitar o amuleto tecle enter                              | |\n" + 
                           "   | |   - Símbolos no caminho:                                           | |\n" + 
                           "   | |       'o': Local que não foi percorrido                            | |\n" + 
                           "   | |       '#': Local que foi percorrido ou onde o jogador se encontra  | |\n" + 
                           "   | |       '@': Local onde há uma surpresa                              | |\n" + 
                           "   | |   - Quando 'Continuar?' aparecer na tela:                          | |\n" + 
                           "   | |       (1) Para continuar jogando                                   | |\n" + 
                           "   | |       (2) Para fim de jogo                                         | |\n" + 
                           " __| |____________________________________________________________________| |__\r\n" + 
                           "(__   ____________________________________________________________________   __)\r\n" + 
                           "   | |                                                                    | |\n");
    }

    public void jogar() {
        do {
            System.out.println("       NIVEL" + nivelAtual);
            vezDoJogador(tab1, tab2.moedas);
            MetodoStatic.systemPause();
            vezDoJogador(tab2, tab1.moedas);

            // Se não for o último nível, perguntar se deseja continuar jogando
            if (nivelAtual != 8) continuarJogo(); 
            else                 fimDoJogo();

            mudarNivel();

        } while(nivelAtual <= 8);
    }

    public void vezDoJogador(Tabuleiro tab, int moedasAdv) {
        int i;
        if (tab == tab1) i = 1;
        else i = 2;
        
        System.out.println("\n ------------------");
        System.out.println("  Vez do Jogador " + i);
        System.out.println("\n" + tab.jogador + ", agite o amuleto");
        String resp = MetodoStatic.respostaString();

        // As moedas são adicionadas na classe Tabuleiro
        tab.nivelAtual(agitarAmuleto(tab), nivelAtual, moedasAdv);

        if (nivelAtual==8) {
            System.out.printf("\n  === %s chegou no destino final ===\n", tab.jogador);
            if (tab==tab2)
                MetodoStatic.systemPause();
        }
    }

    private void mudarNomeJogadores() {
        System.out.print("Informe o nome do jogador 1: ");
        tab1.jogador = MetodoStatic.respostaString();

        System.out.print("Informe o nome do jogador 2: ");
        tab2.jogador = MetodoStatic.respostaString();

        validaJogadores();
    }

    private void validaJogadores() {
        if (tab1.jogador.equals(""))
            tab1.jogador = "Jogador 1";
        if (tab2.jogador.equals(""))
            tab2.jogador = "Jogador 2";
        else if (tab1.jogador.equals(tab2.jogador))
            tab2.jogador += "2";
    }

    private void mudarNivel() { ++nivelAtual; }

    public void fimContextualizacao() {
        System.out.println("\n  Assim que as regras foram explicadas, eles se viram separados e lançados"+
                           "\n nas profundezas da floresta. Cada um deles começou sua jornada por caminhos"+
                           "\n sinuosos e repletos de desafios.");
        
        MetodoStatic.systemPause();

        System.out.println("\n  Eles sabiam que, além de sobreviver, precisavam ser astutos para garantir"+
                           "\n o maior número possível de moedas.");
    }

    // ---------------Sobrecarga de Métodos---------------
    
    public void mostrarTabuleiroDoJogo(int jogador, int direcao, int moedasAdv) {
        if (jogador == 1) {
            int aux = tab1.nivelAtual(direcao, nivelAtual, moedasAdv);

            if (nivelAtual==0)
                tab2.moedas += aux;
        }
        else
            tab2.nivelAtual(direcao, nivelAtual, moedasAdv);
    }

    public void mostrarTabuleiroDoJogo(int jogador, int direcao) {
        mostrarTabuleiroDoJogo(jogador, direcao, 0);
    }

    public void mostrarTabuleiroDoJogo(int jogador) {
        mostrarTabuleiroDoJogo(jogador, 0, 0);
    }

    // ---------------------------------------------------

    /* 
       Do jeito que o grafo foi feito, quando está em uma posição, você 
       só tem duas posibilidades, se estiver na posição 0, tem a posição
       0 e 1 para prosseguir no tabuleiro, se está na 1, tem a posição 1 e 2...
    */

    public int agitarAmuleto(Tabuleiro tab) {
        // Guarda-se sempre o local anterior para poder usar na próxima rodada
        // O valor do amuleto é um número aleatório referente a posição do local 
        // que você está e o incremento dela
        tab.localAnterior = MetodoStatic.getNumAleatorio(tab.localAnterior, tab.localAnterior+1);
        return tab.localAnterior;
    }

    public void continuarJogo() {
        int i;
        
        do {
            System.out.print("\nContinuar? ");
            i = MetodoStatic.respostaInt();  
            
            // Continua o jogo
            if (i==1) {  
                MetodoStatic.limpaTela(); break;
            }  
            // Finaliza o jogo
            else if (i==2) System.exit(-1);
            
        } while(i!=1 || i!=2);
    }

    @Override
    public void fimDoJogo() {
        MetodoStatic.limpaTela();
        System.out.println("\n\n    ------------------------ FIM DO TRAJETO ------------------------"); 
        System.out.printf("\n\t%s: %d moedas\n\t%s: %d moedas\n", tab1.jogador, tab1.moedas, tab2.jogador, tab2.moedas);
        System.out.printf("\n Moedas adquiridas pelos jogadores:");

        String g, p;
        if (tab1.moedas == tab2.moedas) {
            System.out.printf("\n empate");
            return;
        }
        else if (tab1.moedas > tab2.moedas) {
            g = tab1.jogador;
            p = tab2.jogador;
        }
        else {
            g = tab2.jogador;
            p = tab1.jogador;
        }

        System.out.printf("\n\n  Parabéns, %s! Você conseguiu escapar.\n  %s, você não conseguiu moedas suficientes. Lamento...\n\n", g,  p);
    }
}
