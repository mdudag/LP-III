package q03;

public class Governador extends Politico {
    private String estadoGovernado;

    public Governador(String n, int i, Data d, String sigla, long numDoPartido) {
        super(n, i, d, sigla, numDoPartido);
    }

    @Override
    public String toString() {
        return "\n  ---- Governador ----\n"+ 
                super.toString() +
                "\nEstado Governado: " + estadoGovernado;
    }
}
