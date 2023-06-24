package q02;

public class ExamplePessoaHerançaDeSubclasse {
    public static void main(String[] args) {
        Data dataNasc = new Data(30, 11, 1975);
        Pessoa pessoaSimples = new Pessoa("Jose Cuervo", 234517, dataNasc);

        Data dataAdm = new Data(18, 2, 2005);
        Funcionario pessoaFuncionario = new Funcionario("Jose Cuervo", 234517, dataNasc, dataAdm, 3500.00);

        Data dataChefe = new Data(22, 3, 2018);
        ChefeDeDepartamento pessoaChefe = new ChefeDeDepartamento("Jose Cuervo", 
                                                                  234517, 
                                                                  dataNasc, 
                                                                  dataAdm, 
                                                                  3500.00, 
                                                                  "CCAM", 
                                                                  dataChefe);

        printPessoa(pessoaSimples, "\nPESSOA");
        printPessoa(pessoaFuncionario, "FUNCIONARIO");                                                         
        printPessoa(pessoaChefe, "CHEFE DE DEPARTAMENTO");
    }

    static public void printPessoa(Pessoa p, String nome) {
        System.out.println(nome + ":\n" + p.toString());
        System.out.println("Emprestimo: " + p.calculaEmprestimo() + "\n");
    }
}
