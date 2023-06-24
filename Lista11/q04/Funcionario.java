package q04;

public class Funcionario extends Pessoa {
    private Data admissao;
    private double salario;

    Funcionario(String nome, int id, Data nascm, Data adm, double sal) {
        super(nome, id, nascm);
        admissao = adm;
        salario = sal;
    }

    @Override
    public String toString() {
        return super.toString()+
               "\nData de admissao: "+admissao.dayToPrintLong(admissao)+
               "\nSalário: R$ "+salario;
    }

    final public double qualSalario(){
        return salario;
    }

    @Override
    public double calculaEmprestimo() {
        double aux = salario * 75/100;

        if (aux < 1000)
            return valorMinEmprestimo;
        
        return aux;
    }
}
