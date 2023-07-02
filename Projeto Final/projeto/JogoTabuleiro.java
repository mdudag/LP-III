package projeto;

import java.util.Scanner;
import java.lang.System;

public class JogoTabuleiro implements Jogo {
    static final protected int QUANT_JOGADORES = 2;  // Quantidade permitida de jogadores
    static protected short nivelAtual;
    private Tabuleiro tab1, tab2;

    Scanner ler = new Scanner(System.in);

    public JogoTabuleiro(Tabuleiro tab1, Tabuleiro tab2) {
        this.tab1 = tab1;
        this.tab2 = tab2;
        nivelAtual = 0;
    }

    static public short getNivelAtual() {
        return nivelAtual;
    }

    @Override
    public void iniciarJogo() {
        System.out.println("\n ------------------------------ J O G O ------------------------------\n"); 
        // System.out.println();

        contextoDoJogo(); MetodoStatic.systemPause();
        informacoesDoJogo(); MetodoStatic.systemPause();
        MetodoStatic.limpaTela();

        System.out.println("Iniciando Jogo...\n"); 
        mudarNomeJogadores();

        System.out.println("\n  --- Tabuleiro dos Jogadores ---\n");
        mostrarTabuleiroDoJogo(1, 0);
        System.out.println("\n\nAmbos os jogadores ganharam 10 moedas!");
        mudarNivel();
    } 

    public void jogar() {
        do {
            System.out.println("       NIVEL" + nivelAtual);
            vezDoJogador(tab1);
            MetodoStatic.systemPause();
            vezDoJogador(tab2);

            // Se não for o último nível, perguntar se deseja continuar jogando
            if (nivelAtual != 8) {
                continuarJogo();
                ler.nextLine();  // Para pegar o caracter de salto de linha (bug)
            }
            else fimDoJogo();

            mudarNivel();

        } while(nivelAtual <= 8);
    }

    public void vezDoJogador1() {
        System.out.println("\n ------------------");
        System.out.println("  Vez do Jogador 1");
        System.out.println("\n" + tab1.jogador + ", agite o amuleto");
        String resp = ler.nextLine();
        tab1.nivelAtual(agitarAmuleto(tab1), nivelAtual);

        if (nivelAtual == 8)
            System.out.printf("\n  === %s chegou no destino final ===\n", tab1.jogador);
        
    }

    public void vezDoJogador2() {
        System.out.println("\n ------------------");
        System.out.println("  Vez do Jogador 2");
        System.out.println("\n" + tab2.jogador + ", agite o amuleto");
        String resp = ler.nextLine();
        tab2.nivelAtual(agitarAmuleto(tab2), nivelAtual);

        if (nivelAtual == 8)
            System.out.printf("\n  === %s chegou no destino final ===\n", tab2.jogador);
            
        //MetodoStatic.systemPause();
    }

    public void vezDoJogador(Tabuleiro tab) {
        int i;
        if (tab == tab1) i = 1;
        else i = 2;
        
        System.out.println("\n ------------------");
        System.out.println("  Vez do Jogador " + i);
        System.out.println("\n" + tab.jogador + ", agite o amuleto");
        String resp = ler.nextLine();
        tab.nivelAtual(agitarAmuleto(tab), nivelAtual);

        if (nivelAtual==8) {
            System.out.printf("\n  === %s chegou no destino final ===\n", tab.jogador);
            if (tab==tab2)
                MetodoStatic.systemPause();
        }
    }

    private void mudarNomeJogadores() {
        System.out.print("Informe o nome do jogador 1: ");
        tab1.jogador = ler.nextLine();
        System.out.print("Informe o nome do jogador 2: ");
        tab2.jogador = ler.nextLine();

        if (tab1.jogador.equals(""))
            tab1.jogador = "Jogador 1";
        if (tab2.jogador.equals(""))
            tab2.jogador = "Jogador 2";
        else if (tab1.jogador.equals(tab2.jogador))
            tab2.jogador += "2";
    }

    private void mudarNivel() {
        ++nivelAtual;
    }

    public void informacoesDoJogo() {
        System.out.println("+--------------------------------------------------------------------+\n" + 
                           "|                      INFORMAÇÕES SOBRE O JOGO                      |\n" +
                           "+--------------------------------------------------------------------+\n" +
                           "|   - Quantidade de jogadores: "+QUANT_JOGADORES+"                                     |\n" +
                           "|   - Para passar pelos caminhos você precisa agitar o amuleto       |\n" + 
                           "|     para que ele defina qual caminho seguir.                       |\n" +
                           "|   - Para agitar o amuleto tecle enter                              |\n" +
                           "|   - Símbolos no caminho:                                           |\n" + 
                           "|       'o': Local que não foi percorrido                            |\n" +
                           "|       '#': Local que foi percorrido ou onde o jogador se encontra  |\n" +
                           "|       '@': Local onde há uma surpresa                              |\n" +
                           "|   - Quando 'Continuar?' aparecer na tela:                          |\n" + 
                           "|       (1) Para continuar jogando                                   |\n" + 
                           "|       (2) Para fim de jogo                                         |\n" + 
                           "+--------------------------------------------------------------------+");
    }

    @Override
    public void contextoDoJogo() {
        System.out.println("Contextualizando...");
    }

    @Override
    public void mostrarTabuleiroDoJogo(int jogador, int direcao) {
        if (jogador == 1)
            tab1.printTabuleiro(nivelAtual, direcao);
        else
            tab2.printTabuleiro(nivelAtual, direcao);
    }

    @Override
    public int agitarAmuleto(Tabuleiro tab) {
        tab.localAnterior = MetodoStatic.getNumAleatorio(tab.localAnterior, tab.localAnterior+1);
        return tab.localAnterior;
    }

    public void continuarJogo() {
        int i;
        
        do {
            System.out.print("\nContinuar? ");
            i = ler.nextInt();
            
            if (i==1) {
                MetodoStatic.limpaTela();
                break;
            }
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
        if ( tab1.moedas == tab2.moedas) {
            System.out.printf("\n empate");
            return;
        }
        else if (tab1.moedas > tab2.moedas) {
            g = tab1.jogador;
            p = tab2.jogador;
        }
        else {
            g = tab1.jogador;
            p = tab2.jogador;
        }

        System.out.printf("\n\n  Parabéns, %s! Você consegui escapar.", g, 
                          "\n  %s, você não consegui moedas suficientes. Lamento...", p);
    }
}
