package q05;

public interface ItemBiblioteca {
    static final int maxDiasEmprestimo = 7;

    boolean estaEmprestado();
    void emprestar();
    void devolver();
    String localizacao();
    String descricaoSumaria();
}
