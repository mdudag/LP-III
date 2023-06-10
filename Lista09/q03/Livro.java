package q03;

public class Livro {
    protected String titulo;
    protected String autor;
    protected long nroPaginas;
    protected int anoPublicacao;

    public Livro(String titulo, String autor, long nroPag, int anoPub) {
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

    public Livro(String titulo, String autor, long nroPag) {
        this(titulo, autor, nroPag, 0);
    }

    public Livro(String titulo, long nroPag) {
        this(titulo, "SemNome", nroPag);
    }

    public Livro(String titulo) {
        this(titulo, 0);
    }

    public Livro() {
        this("SemTítulo");
    }

    // Outros Métodos

    protected boolean validaLivro(long nroPag, int anoPub) {
        if ((nroPag<1) || (anoPub<1))
            return false;

        return true;
    }

    public String toString() {
        return  "   ----- Sobre o livro -----\n" + 
                "\nTítulo: " + titulo + 
                "\nAutor: " + autor + 
                "\nNúmero de páginas: " + nroPaginas + " páginas " + 
                "\nAno de publicação: " + anoPublicacao;
    }

    public boolean isOlder(Livro l) {
        if (anoPublicacao < l.anoPublicacao)
            return true;
        
        return false;
    }
}
