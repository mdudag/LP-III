package projeto;

public interface Jogo {
    void iniciarJogo();
    void contextoDoJogo();
    void informacoesDoJogo();
    void mostrarTabuleiroDoJogo(int jogador, int nivel, int direcao);
    int agitarAmuleto();
    void fimDoJogo();
}
