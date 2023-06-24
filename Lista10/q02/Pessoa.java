package q02;

public class Pessoa {
    private String nome;
    private long id;
    private Data nascimento;
    protected final static double valorMinEmprestimo = 1000;

    Pessoa(String n, int i, Data d) {
        nome = n;
        id = i;
        nascimento = d;
    }

    @Override
    public String toString(){
        String resultado;
        resultado = "Nome: "+nome+"\nIdentidade: "+id+"\n";
        if (this.nascimento != null)
               resultado += "Data de Nascimento: "+nascimento.dayToPrintLong(nascimento);
                
        return resultado;
    }

    public double calculaEmprestimo() {
        return valorMinEmprestimo;
    }
}
