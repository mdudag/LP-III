package q03;

public class LivroBiblioteca extends Livro {
    protected boolean isEmprestado;
    protected Data dataDevolucao;

    public LivroBiblioteca(String titulo, String autor, long nroPag, int anoPub, boolean isEmpr, int d, int m, int a) {
        super(titulo, autor, nroPag, anoPub);

        if (validaLivro(nroPag, anoPub, d, m, a)) {
            isEmprestado = isEmpr;
            Data data = new Data(d, m, a);
            dataDevolucao = data;
        }
        else {
            isEmprestado = false;
        }
    }

    public LivroBiblioteca(String titulo, String autor, long nroPag, int anoPub, boolean isEmpr) {
        this(titulo, autor, nroPag, anoPub, isEmpr, 0, 0, 0);
    }

    public LivroBiblioteca(String titulo, String autor, long nroPag, int anoPub, int d, int m, int a) {
        this(titulo, autor, nroPag, anoPub, false, d, m, a);
    }

    public LivroBiblioteca(String titulo, String autor, long nroPag, int anoPub) {
        this(titulo, autor, nroPag, anoPub, 0, 0, 0);
    }
    
    // Outros Métodos

    protected boolean validaLivro(long nroPag, int anoPub, int d, int m, int a) {
        Data data = new Data(d, m, a);
        if (super.validaLivro(nroPag, anoPub) && 
            data.verificarData(d, m, a))
            return true;

        return false;
    }

    public String toString() {
        return super.toString() + 
               "\nLivro emprestado: " + isEmprestado +
               "\nData: " + dataDevolucao.getData();
    }

    public boolean isAvaliable() {
        if (isEmprestado == false)
            return true;
            
        return false;
    }

    public void borrow() {
        isEmprestado = true;
    }
}
