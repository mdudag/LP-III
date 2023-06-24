package q04;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Pessoa> myPessoas;

    public Agenda() {
        myPessoas = new ArrayList<>();
    }

    public List<Pessoa> getMyPessoas() {
        return myPessoas;
    }

    public void addNaAgenda(Pessoa p) {
        myPessoas.add(p);
    }

    public void listarContatos() {
        for (Pessoa p: myPessoas)
            System.out.println(p);
    }

    // Não consegui fazer
    public void buscarContato(boolean isPessoaFisica, String chave) {
        for (Pessoa p: myPessoas) {
            if (isPessoaFisica && (p instanceof PessoaFisica)) {
                if (buscaPessoaFisica(p, chave))
                    break;
            }
            else if (!isPessoaFisica && (p instanceof PessoaJuridica)) {
                if (buscaPessoaJuridica(p, chave))
                    break;
            }
        }
    }

    protected boolean buscaPessoaFisica(PessoaFisica p, String chave) {
        if (p.getCPF() == chave) {
            System.out.println(p);
            return true;
        }

        return false;
    }

    protected boolean buscaPessoaJuridica(PessoaJuridica p, String chave) {
        if (p.getCNPJ() == chave) {
            System.out.println(p);
            return true;
        }

        return false;
    }
}
