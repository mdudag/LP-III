package q03;

public class LivroLivraria extends Livro {
    protected float preco;
    protected long estoque;

    public LivroLivraria(String titulo, String autor, long nroPag, int anoPub, float preco, long estoque) {
        super(titulo, autor, nroPag, anoPub);
        
        if (validaLivroLivraria(nroPag, anoPub, preco, estoque)) {
            this.preco = preco;
            this.estoque = estoque;
        }
        else {
            preco = nroPag = estoque = anoPub = 0;
            titulo = autor = null;
        }
    }

    public LivroLivraria(String titulo, String autor, long nroPag, int anoPub, float preco) {
        this(titulo, autor, nroPag, anoPub, preco, 0);
    }

    public LivroLivraria(String titulo, String autor, long nroPag, int anoPub, long estoque) {
        this(titulo, autor, nroPag, anoPub, 0, estoque);
    }

    public LivroLivraria(String titulo, String autor, long nroPag, int anoPub) {
        this(titulo, autor, nroPag, anoPub, 0, 0);
    }

    // Outros Métodos

    protected boolean validaLivroLivraria(long nroPag, int anoPub, float preco, long estoque) {
        if (super.validaLivro(nroPag, anoPub) &&
            preco>0 && estoque>-1)
            return true;
        
        return false;
    }

    public String toString() {
        return super.toString() + 
               "\nPreço do Livro: R$" + preco +
               "\nEm estoque: " + estoque;
    }

    public boolean isAvaliable() {
        if (estoque>0)
            return true;

        return false;
    }

    public void sell() {
        if (isAvaliable())
            --estoque;
        else 
            System.out.println("Livro esgotado!");
    }   
}
