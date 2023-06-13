package q05;

public class AlunoMestrado extends AlunoPosgraduação{

    public AlunoMestrado(String nome, long matricula, int d, int m, int a, int semestre, String tipoCurso, boolean isRegular, String nomeOrientador, String tituloProjetoPesq) {
        super(nome, matricula, d, m, a, semestre, tipoCurso, isRegular, nomeOrientador, tituloProjetoPesq, 'M');
    }
}
