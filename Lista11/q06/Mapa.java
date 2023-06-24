package q06;

public class Mapa {
    protected String titulo, escala, descricaoSumaria;
    protected int ano;

    public Mapa(String titulo, int ano, String escala, String descSum) {
        this.titulo = titulo;
        this.ano = ano;
        this.escala = escala;
        descricaoSumaria = descSum;
    }

    public String getTitulo() {
        return titulo;
    } 
    
    public String getDescricaoSumaria() {
        return descricaoSumaria;
    }
    
    @Override
    public String toString() {
        return "   ----- Sobre o Mapa -----\n" + 
                "\nTítulo: " + titulo + 
                "\nAno: " + ano + 
                "\nEscala: " + escala;
    }
}
