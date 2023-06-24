package q04;

public class PessoaFisica extends Pessoa {
    private String CPF;
    private Data aniversario;

    public PessoaFisica(String n, String end, String tel, String email, String cpf, Data d) {
        super(n, end, tel, email);

        CPF = cpf;
        aniversario = d;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCPF: " + CPF +
               "\nData: " + aniversario.getData();
    }
}
