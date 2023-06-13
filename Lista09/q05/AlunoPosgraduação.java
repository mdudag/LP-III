package q05;

import q03.Data;

public class AlunoPosgraduação extends AlunoGraduacao{
    protected String nomeOrientador;
    protected String tituloProjetoPesq;
    protected char nivel;

    public AlunoPosgraduação(String nome, long matricula, int d, int m, int a, int semestre, String tipoCurso, boolean isRegular, String nomeOrientador, String tituloProjetoPesq, char nivel) {
        super(nome, matricula, d, m, a, semestre, tipoCurso, isRegular);

        if (validaAlunoPosgraduacao(matricula, d, m, a, semestre, nivel)) {
            this.nomeOrientador = nomeOrientador;
            this.tituloProjetoPesq = tituloProjetoPesq;
            this.nivel = nivel;
        } 
        else {
            dataAdmissao = new Data(0, 0, 0);

            this.nome = this.tipoCurso = this.nomeOrientador = this.tituloProjetoPesq = null;
            this.nivel = ' ';
            this.mensalidade = this.matricula = this.semestre = 0;
            this.isRegular = false;
        }
    }

    protected boolean validaAlunoPosgraduacao(long matricula, int d, int m, int a, int semestre, char nivel) {
             if (nivel=='m') nivel = 'M';
        else if (nivel=='d') nivel = 'D';

        if (validaAlunoGraduacao(matricula, d, m, a, semestre) &&
            (nivel=='M' || nivel=='D')) 
                return true;
        
        return false;
    }

    public String toString() {
        String aux = super.toString() + 
               "\n Orientador: " + nomeOrientador +
               "\n Titulo do Projeto de Pesquisa: " + tituloProjetoPesq +
               "\n Nível: ";

        if (nivel=='M') aux += "Mestrado";
        else aux += "Doutorado";

        return aux;
    }

    public boolean alunoRegular() {
        int ano = 2023 - dataAdmissao.getAno();
        int mesAtual = 6;
        int mesAdmissao = dataAdmissao.getMes();

        if (nivel=='M') {
            if (ano<2 || (ano==2 && mesAtual<mesAdmissao))
            return true;
        }
        else {
            if (ano<4 || (ano==4 && mesAtual<mesAdmissao))
            return true;
        }

        return false;
    }
}
