package q04;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private float faturamento;

    public PessoaJuridica(String n, String end, String tel, String email, String cnpj, float fat) {
        super(n, end, tel, email);

        CNPJ = cnpj;
        faturamento = fat;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCNPJ: " + CNPJ +
               "\nFaturamento: " + faturamento;
    }
}
