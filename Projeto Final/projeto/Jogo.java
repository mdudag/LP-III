package projeto;

public interface Jogo {
    void iniciarJogo();
    void contextoDoJogo();
    void informacoesDoJogo();
    void mostrarTabuleiroDoJogo(int jogador, int direcao);
    int agitarAmuleto(Tabuleiro tab);
    void fimDoJogo();
}
