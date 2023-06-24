package q02;

public class ChefeDeDepartamento extends Funcionario{
    private String departamento;
    private Data promocaoChefe;

    ChefeDeDepartamento(String nome, int id, Data nascm, Data adm, 
                        double sal, String dep, Data prom) {
        super(nome, id, nascm, adm, sal);
        departamento = dep;
        promocaoChefe = prom;
    }

    @Override
    public String toString() {
        return super.toString()+ 
               "\nDepartamento: "+departamento+"\n"+
               "Data de promoçao ao cargo: "+promocaoChefe.dayToPrintLong(promocaoChefe);
    }

    public String getDepartamento(){
        return departamento;
    }

    public double calculaEmprestimo() {
        return super.qualSalario()*3;
    }
}
