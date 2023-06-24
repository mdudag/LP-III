package q05;

public class LivroBiblioteca extends Livro implements ItemBiblioteca {
    protected boolean isEmprestado;
    protected String localizacao;

    public LivroBiblioteca(String titulo, String autor, int nroPag, int anoPub, boolean isEmpr, String local) {
        super(titulo, autor, nroPag, anoPub);

        if (validaLivro(nroPag, anoPub)) {
            isEmprestado = isEmpr;
            localizacao = local;

        }
        else {
            this.titulo = this.autor = null;
            nroPaginas = anoPub = 0; 
            isEmprestado = false;
            localizacao = "SemLocalização";

            System.out.println("Erro!! Livro inválido.");
        }
    }
    
    // Outros Métodos

    protected boolean validaLivro(int nroPag, int anoPub) {
        if (super.validaLivro(nroPag, anoPub))
            return true;

        return false;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nLivro emprestado: " + isEmprestado +
               "\nLocalização: " + localizacao;
    }

    @Override
    public boolean estaEmprestado() {
        return isEmprestado;
    }

    @Override
    public void emprestar() {
        if (!isEmprestado)
            isEmprestado = true;
        else 
            System.out.println("Empréstico falhou. O livro já foi emprestado!!");
    }

    @Override
    public void devolver() {
        if (isEmprestado)
            isEmprestado = false;
        else 
            System.out.println("Devolução falhou. O livro não foi emprestado!!");
    }

    @Override
    public String localizacao() {return localizacao;}

    @Override
    public String descricaoSumaria() {return super.toString();}
}
