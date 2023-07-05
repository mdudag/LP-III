package projeto;

import java.util.ArrayList;
import java.util.Scanner;

import projeto.PrintTabuleiro;

public class Tabuleiro extends PrintTabuleiro {
    protected Local local;
    protected String jogador;
    protected int moedas;
    protected int localAnterior;

    public Tabuleiro(String jogador) {
        super();

        this.jogador = jogador;
        moedas = localAnterior = 0;
        local = new Local();
    }

    public Tabuleiro() {
        this("Jogador");
    }

    // ---------------------------------------------------

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String j) {
        jogador = j;
    } 

    public Local getLocal() {
        return local;
    }

    // ---------------------------------------------------

    public int nivelAtual(int direcao, short nivelAtual, int moedasAdv) {
        switch(nivelAtual) {
            case 0: return nivel0()+moedas;        
            case 1: return nivel1(direcao)+moedas; 
            case 2: return nivel2(direcao, moedasAdv)+moedas; 
            case 3: return nivel3(direcao, moedasAdv)+moedas; 
            case 4: return nivel4(direcao, moedasAdv)+moedas; 
            case 5: return nivel5(direcao, moedasAdv)+moedas; 
            case 6: return nivel6(direcao, moedasAdv)+moedas; 
            case 7: return nivel7(direcao, moedasAdv)+moedas; 
            case 8: return nivel8(direcao, moedasAdv)+moedas; 
            default: 
                System.out.println("\nErro! Esse nível não existe.");
                return 0;
        }
    }

    protected int nivel0() {
        printTabuleiro();
        System.out.println("\n\nAmbos os jogadores ganharam 10 moedas!");
        return 10;
    }

    protected int nivel1(int direcao) {
        printTabuleiro(1, direcao);

        switch (direcao) {
            case 0: return local.ganhaQuatroMoedas(jogador);
            default: local.localVazio(); return 0;
        }
    }

    protected int nivel2(int direcao, int moedasAdv) {
        printTabuleiro(2, direcao);
        
        switch(direcao) {
            case 0: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv); 
            case 1: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1)); 
            default: return local.ganhaQuatroMoedas(jogador); 
        }
    }

    protected int nivel3(int direcao, int moedasAdv) {
        printTabuleiro(3, direcao);

        switch(direcao) {
            case 0: local.localVazio(); return 0;
            case 1: return local.desconhecidoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 2: return local.ganhaQuatroMoedas(jogador);
            default: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
        }
    }

    protected int nivel4(int direcao, int moedasAdv) {
        printTabuleiro(4, direcao);

        switch(direcao) {
            case 0: case 1: return local.ganhaQuatroMoedas(jogador);
            case 2: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 3: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            default: local.localVazio(); return 0;
        }
    }

    protected int nivel5(int direcao, int moedasAdv) {
        printTabuleiro(5, direcao);

        switch(direcao) {
            case 0: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 1: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 2: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 3: return local.desconhecidoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 4: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            default: return local.ganhaQuatroMoedas(jogador);
        }
    }

    protected int nivel6(int direcao, int moedasAdv) {
        printTabuleiro(6, direcao);

        switch(direcao) {
            case 0: local.localVazio(); return 0;
            case 1: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 2: return local.desconhecidoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 3: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 4: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 5: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            default: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
        }
    }

    protected int nivel7(int direcao, int moedasAdv) {
        printTabuleiro(7, direcao);

        switch(direcao) {
            case 0: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 1: return local.ganhaQuatroMoedas(jogador);
            case 2: return local.ganhaQuatroMoedas(jogador);
            case 3: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 4: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 5: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 6: return local.ganhaQuatroMoedas(jogador);
            default: return local.desconhecidoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
        }
    }

    protected int nivel8(int direcao, int moedasAdv) {
        printTabuleiro(8, direcao);

        switch(direcao) {
            case 0: return local.ganhaQuatroMoedas(jogador);
            case 1: local.localVazio(); return 0;
            case 2: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 3: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 4: return local.ganhaQuatroMoedas(jogador);
            case 5: return local.ganhaQuatroMoedas(jogador);
            case 6: return local.ganhaQuatroMoedas(jogador);
            case 7: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            default: local.localVazio(); return 0;
        }
    }
}
