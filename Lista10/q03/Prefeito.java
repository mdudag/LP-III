package q03;

public class Prefeito extends Politico {
    private String cidadeGovernada;

    public Prefeito(String n, int i, Data d, String sigla, long numDoPartido) {
        super(n, i, d, sigla, numDoPartido);
    }

    @Override
    public String toString() {
        return "\n  ---- Prefeito ----\n"+
                super.toString() +
                "\nCidade Governada: " + cidadeGovernada;
    }
}
