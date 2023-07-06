package projeto;

public class ProjetoJogo {
    static public void main(String args[]) {
        Tabuleiro tab1, tab2;

        tab1 = new Tabuleiro();
        tab2 = new Tabuleiro();
                                                
        JogoTabuleiro jogo = new JogoTabuleiro(tab1, tab2);
        jogo.iniciarJogo();
        
        MetodoStatic.limpaTela();
        jogo.jogar();
    }
}
