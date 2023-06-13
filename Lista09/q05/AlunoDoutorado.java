package q05;

public class AlunoDoutorado extends AlunoPosgraduação{

    public AlunoDoutorado(String nome, long matricula, int d, int m, int a, int semestre, String tipoCurso, boolean isRegular, String nomeOrientador, String tituloProjetoPesq) {
        super(nome, matricula, d, m, a, semestre, tipoCurso, isRegular, nomeOrientador, tituloProjetoPesq, 'D');
    }
}
