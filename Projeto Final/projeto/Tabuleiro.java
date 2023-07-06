package projeto;

public class Tabuleiro extends PrintTabuleiro {
    protected Local local;
    protected String jogador;
    protected int moedas, localAnterior;

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
        // Os níveis irão modificar a quantidade de moedas do jogador

        int aux=0;

        switch(nivelAtual) {
            case 0: aux = nivel0();                     break;    
            case 1: aux = nivel1(direcao);              break;
            case 2: aux = nivel2(direcao, moedasAdv);   break; 
            case 3: aux = nivel3(direcao, moedasAdv);   break; 
            case 4: aux = nivel4(direcao, moedasAdv);   break; 
            case 5: aux = nivel5(direcao, moedasAdv);   break; 
            case 6: aux = nivel6(direcao, moedasAdv);   break; 
            case 7: aux = nivel7(direcao, moedasAdv);   break; 
            case 8: aux = nivel8(direcao, moedasAdv);   break;
            default: 
                System.out.println("\nErro! Esse nível não existe."); break;

        }

        // Incrementando as moedas ganhas
        moedas+=aux;

        if (moedas<0) moedas=0;

        // O valor conseguido no nível é retornado caso seja necessário
        // em algum momento, como para mandar o valor para o adversário
        // no método mostraTabuleiroDoJogo da classe Tabuleiro
        return aux;
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
            default: return local.localVazio();
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
            case 0: return local.localVazio();
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
            default: return local.localVazio();
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
            case 0: return local.localVazio();
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
            case 1: return local.localVazio();
            case 2: return local.lagoNoCaminho(MetodoStatic.getNumAleatorio(0, 1));
            case 3: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            case 4: return local.ganhaQuatroMoedas(jogador);
            case 5: return local.ganhaQuatroMoedas(jogador);
            case 6: return local.ganhaQuatroMoedas(jogador);
            case 7: return local.surpresa(MetodoStatic.getNumAleatorio(0, 2), jogador, moedas, moedasAdv);
            default: return local.localVazio();
        }
    }
}
