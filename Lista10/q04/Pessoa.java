package q04;

public class Pessoa {
    private String nome, endereco, telefone, email;

    public Pessoa(String n, String end, String tel, String email) {
        nome = n;
        endereco = end;
        telefone = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
               "\nEndereço: "+ endereco +
               "\nTelefone: " + telefone +
               "\nEmail: " + email;
    }
}
