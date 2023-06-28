package projeto;

import projeto.Local;
import java.util.Scanner;
import java.lang.System;
import java.lang.Math;

public class JogoTabuleiro implements Jogo {
    static final int QUANT_JOGADORES = 2;  // Quantidade permitida de jogadores
    static private short nivelAtual;
    private Tabuleiro tab1, tab2;

    Scanner ler = new Scanner(System.in);

    public JogoTabuleiro(Tabuleiro tab1, Tabuleiro tab2) {
        this.tab1 = tab1;
        this.tab2 = tab2;
        nivelAtual = -1;
    }

    @Override
    public void iniciarJogo() {
        System.out.println(); System.out.println("  --- JOGO ---"); System.out.println();

        contextoDoJogo(); Local.systemPause();
        informacoesDoJogo(); Local.systemPause();

        System.out.println("Limpa tela"); limpaTela(); System.out.println();

        System.out.println("Iniciando Jogo..."); System.out.println();
        mudarNomeJogadores();
        mudarNivel();
    } 

    public void jogar() {
        do {
            System.out.println("nivel atual: "+nivelAtual);
             vezDoJogador1();
            // vezDoJogador2();

            if (nivelAtual != 8)
                continuarJogo();

            mudarNivel();

        } while(nivelAtual <= 8);
    }

    public void vezDoJogador1() {
        System.out.println("-----------------");
        System.out.println("Vez do Jogador 1");
        System.out.println(tab1.jogador + ", agite o amuleto");
        String resp = ler.nextLine();
        tab1.nivelAtual(agitarAmuleto(), nivelAtual);
    }

    public void vezDoJogador2() {
        System.out.println("-----------------");
        System.out.println("Vez do Jogador 2");
        System.out.println(tab2.jogador + ", agite o amuleto");
        String resp = ler.nextLine();
        tab2.nivelAtual(agitarAmuleto(), nivelAtual);
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
        System.out.println("+------------------------------------------------------+\n" + 
                           "|               INFORMACOES SOBRE O JOGO               |\n" +
                           "+------------------------------------------------------+\n" +
                           "   - Para passar pelos caminhos você precisa agitar o \n" + 
                           " amuleto para que ele defina qual    caminho seguir.\n" +
                           "   - Para agitar o amuleto tecle enter\n" + 
                           "   - Quando 'Continuar?' aparecer na tela: \n" + 
                           "       (1) Para continuar jogando\n" + 
                           "       (2) Para fim de jogo\n" + 
                           "+------------------------------------------------------+\n");
    }

    @Override
    public void contextoDoJogo() {
        System.out.println("Contextualizando...");
    }

    @Override
    public void mostrarTabuleiroDoJogo(int jogador, int nivel, int direcao) {
        if (jogador == 1)
            tab1.printTabuleiro(nivel, direcao);
        else
            tab2.printTabuleiro(nivel, direcao);
    }

    @Override
    public int agitarAmuleto() {
        return (int) (Math.random() % nivelAtual);
    }

    static final public void limpaTela() {
        for (int i=0; i<50; i++)
            System.out.print("\n");
    }

    public void continuarJogo() {
        int i;
        
        do {
            System.out.println("Continuar? ");
            i = ler.nextInt();
            
            if (i==1) {
                limpaTela();;
                break;
            }
            else if (i==2) System.exit(-1);
            
        } while(i!=1 || i!=2);
    }

    @Override
    public void fimDoJogo() {
        
    }
}
