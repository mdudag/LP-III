package q04;

public class ExamplePessoa {
    public static void main(String[] args) {
        Data dataNasc = new Data(30, 11, 1975);
        Data dataAdm = new Data(18, 2, 2005);
        Data dataChefe = new Data(22, 3, 2018);

        Funcionario pessoaFuncionario = new Funcionario("Jose Cuervo", 234517, dataNasc, dataAdm, 3500.00);
        
        System.out.println("FUNCIONARIO:\n");
        printPessoa(pessoaFuncionario);

        ChefeDeDepartamento pessoaChefe = new ChefeDeDepartamento("Jose Cuervo", 
                                                                  234517, 
                                                                  dataNasc, 
                                                                  dataAdm, 
                                                                  3500.00, 
                                                                  "CCAM", 
                                                                  dataChefe);

        System.out.println("CHEFE DE DEPARTAMENTO:\n");
        printPessoa(pessoaChefe);
    }

    static public void printPessoa(Pessoa p) {
        System.out.println(p);
        System.out.println("Emprestimo: "+ p.calculaEmprestimo() +"\n");
    }
}
