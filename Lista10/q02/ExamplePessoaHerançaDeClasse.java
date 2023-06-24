package q02;

public class ExamplePessoaHerançaDeClasse {
    public static void main(String[] args) {
        Data dataNasc = new Data(30, 11, 1975);
        Pessoa pessoaSimples = new Pessoa("Jose Cuervo", 234517, dataNasc);
        
        System.out.println("\nPESSOA:\n"+pessoaSimples.toString());
        System.out.println("Emprestimo: "+ pessoaSimples.calculaEmprestimo() +"\n");

        Data dataAdm = new Data(18, 2, 2005);
        Funcionario pessoaFuncionario = new Funcionario("Jose Cuervo", 234517, dataNasc, dataAdm, 3500.00);

        System.out.println("FUNCIONARIO:\n"+pessoaFuncionario.toString());
        System.out.println("Emprestimo: "+ pessoaFuncionario.calculaEmprestimo() +"\n");

        Data dataChefe = new Data(22, 3, 2018);
        ChefeDeDepartamento pessoaChefe = new ChefeDeDepartamento("Jose Cuervo", 
                                                                  234517, 
                                                                  dataNasc, 
                                                                  dataAdm, 
                                                                  3500.00, 
                                                                  "CCAM", 
                                                                  dataChefe);

        System.out.println("CHEFE DE DEPARTAMENTO:\n"+pessoaChefe.toString());
        System.out.println("Emprestimo: "+ pessoaChefe.calculaEmprestimo() +"\n");
    }
}
