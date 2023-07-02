package projeto;

import java.util.ArrayList;
import java.util.Scanner;

import projeto.PrintTabuleiro;

public class Tabuleiro extends PrintTabuleiro {
    //protected ArrayList<Local[]> caminhos;    // Composição?
    protected Local local;
    protected String jogador;
    protected int moedas;
    protected int localAnterior;

    public Tabuleiro(String jogador) {
        // Inicializando atributo da classe PrintTabuleiro
        super();

        this.jogador = jogador;
        moedas = localAnterior = 0;
        local = new Local();
        // caminhos = new ArrayList<Local[]>();

        // Inicializando os componentes do array
        // for (int i=0; i<9; i++) {
        //     caminhos.add(new Local[i+1]);

        //     for(int j=0; j<=i; j++) 
        //         caminhos.get(i)[j] = new Local();
        // }
    }

    public Tabuleiro() {
        this("Jogador");
    }

    // Método Getter e Setter

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String j) {
        jogador = j;
    } 

    // public ArrayList<Local[]> getCaminhos() {
    //     return caminhos;
    // }

    public Local getLocal() {
        return local;
    }

    // Outros Métodos

    public void nivelAtual(int direcao, short nivelAtual) {
        switch(nivelAtual) {
            case 0: nivel0();        break;
            case 1: nivel1(direcao); break;
            case 2: nivel2(direcao); break;
            case 3: nivel3(direcao); break;
            case 4: nivel4(direcao); break;
            case 5: nivel5(direcao); break;
            case 6: nivel6(direcao); break;
            case 7: nivel7(direcao); break;
            case 8: nivel8(direcao); break;
            default: 
                System.out.println("\nErro! Esse nível não existe.");
        }
    }

    protected void nivel0() {
        // Local local0 = caminhos.get(0)[0];
        System.out.println("entrou nivel 0");
        printTabuleiro(0, 0);
        //int aux = local0.ganhaQuatroMoedas(jogador);
        System.out.println("\n\nAmbos os jogadores ganharam 10 moedas!");
        //local0.systemPause();
        //return aux;
    }

    protected void nivel1(int direcao) {
        // Local local1 = caminhos.get(1)[direcao];
        
        //local1.ganhaQuatroMoedas();
        //local1.systemPause();
        printTabuleiro(1, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
        //System.out.println("entrou nivel 1");
    }

    protected void nivel2(int direcao) {
        // Local local2 = caminhos.get(2)[direcao];
        //local2.ganhaQuatroMoedas();
        // local2.systemPause();
        printTabuleiro(2, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
        //System.out.println("entrou nivel 2");
    }

    protected void nivel3(int direcao) {
        // Local local3 = caminhos.get(3)[direcao];
        //local3.ganhaQuatroMoedas();
        // local3.systemPause();
        printTabuleiro(3, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
        //System.out.println("entrou nivel 3");
    }

    protected void nivel4(int direcao) {
        // Local local4 = caminhos.get(4)[direcao];
        //local4.ganhaQuatroMoedas();
        // local4.systemPause();
        printTabuleiro(4, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
    }

    protected void nivel5(int direcao) {
        // Local local5 = caminhos.get(5)[direcao];
        //local5.ganhaQuatroMoedas();
        // local5.systemPause();
        printTabuleiro(5, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
    }

    protected void nivel6(int direcao) {
        // Local local6 = caminhos.get(6)[direcao];
        //local6.ganhaQuatroMoedas();
        // local6.systemPause();
        printTabuleiro(6, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
    }

    protected void nivel7(int direcao) {
        // Local local7 = caminhos.get(7)[direcao];
        //local7.ganhaQuatroMoedas();
        // local7.systemPause();
        printTabuleiro(7, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
    }

    protected void nivel8(int direcao) {
        // Local local8 = caminhos.get(8)[direcao];
        //local8.ganhaQuatroMoedas();
        // local8.systemPause();
        printTabuleiro(8, direcao);
        System.out.println("\n\nVocê ganhou 4 moedas!!");
    }
}
