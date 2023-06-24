package q05;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int nroPaginas;
    protected int anoPublicacao;

    public Livro(String titulo, String autor, int nroPag, int anoPub) {
        if (validaLivro(nroPag, anoPub)) {
            this.titulo = titulo;
            this.autor = autor;
            nroPaginas = nroPag;
            anoPublicacao = anoPub;
        }
        else {
            this.titulo = this.autor = null;
            nroPaginas = anoPub = 0; 

            System.out.println("Erro!! Livro inválido.");
        }
    }

    // Método Getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Outros Métodos

    protected boolean validaLivro(int nroPag, int anoPub) {
        if ((nroPag<1) || (anoPub<1))
            return false;

        return true;
    }

    @Override
    public String toString() {
        return  "   ----- Sobre o livro -----\n" + 
                "\nTítulo: " + titulo + 
                "\nAutor: " + autor + 
                "\nNúmero de páginas: " + nroPaginas + " páginas " + 
                "\nAno de publicação: " + anoPublicacao;
    }
}
