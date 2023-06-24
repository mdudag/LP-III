package q06;

import q05.ItemBiblioteca;

public class MapaBiblioteca extends Mapa implements ItemBiblioteca {
    protected boolean isEmprestado;
    protected String localizacao;

    public MapaBiblioteca(String titulo, int ano, String escala, String descSum, boolean isEmpr, String local) {
        super(titulo, ano, escala, descSum);
        isEmprestado = isEmpr;
        localizacao = local;
    }

    @Override
    public String toString() {
        return super.toString() +
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
    public String descricaoSumaria() {return descricaoSumaria;}
}
