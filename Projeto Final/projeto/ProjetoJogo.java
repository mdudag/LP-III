package projeto;

public class ProjetoJogo {
    static public void main(String args[]) {
        Tabuleiro tab1, tab2;

        tab1 = new Tabuleiro();
        tab2 = new Tabuleiro();

        JogoTabuleiro jogo = new JogoTabuleiro(tab1, tab2);
        jogo.iniciarJogo();
        //System.out.println("j1: " +  tab1.jogador + " - j2: " +  tab2.jogador);
        System.out.println("\n  --- Tabuleiro dos Jogadores ---");
        jogo.mostrarTabuleiroDoJogo(1, -1, 0);
        jogo.jogar();
    }
}
