package q03;

public class Politico extends Pessoa {
    private String sigla;
    private long numDoPartido;

    public Politico(String n, int i, Data d, String sigla, long numDoPartido) {
        super(n, i, d);
        this.sigla = sigla;
        this.numDoPartido = numDoPartido;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nSigla do partido: " + sigla +
        "\nNúmero do partido: " + numDoPartido;
    }
}
