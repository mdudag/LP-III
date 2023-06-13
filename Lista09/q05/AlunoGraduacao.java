package q05;

import q03.Data;
import java.lang.Math;

public class AlunoGraduacao {
    protected String nome;
    protected long matricula;
    protected Data dataAdmissao;
    protected int semestre;
    protected String tipoCurso;
    protected boolean isRegular;
    protected float mensalidade;

    public AlunoGraduacao(String nome, long matricula, int d, int m, int a, int semestre, String tipoCurso, boolean isRegular) {
        if (validaAlunoGraduacao(matricula, d, m, a, semestre)) {
            this.nome = nome;
            this.matricula = matricula;
            dataAdmissao = new Data(d, m, a);
            this.semestre = semestre;
            this.tipoCurso = tipoCurso;
            this.isRegular = isRegular;
            this.mensalidade = getMensalidade(tipoCurso);
        }
        else {
            this.nome = this.tipoCurso = null;
            this.mensalidade = this.matricula = d = m = a = semestre = 0;
            this.isRegular = false;

            System.out.println("AlunoGraduacao inválido");
        }
    }

    protected boolean validaAlunoGraduacao(long matricula, int d, int m, int a, 
                                           int semestre) {
        Data data = new Data(d, m, a);

        if (matricula>0 && dataAdmissao.verificarData(d, m, a) &&
            semestre>0)
            return true;
        
        return false;
    }

    public String toString() {
        return "    ------ Informações do Aluno ------\n" +
               "\n Nome: " + nome +
               "\n Nº de matrícula: " + matricula +
               "\n Data de Admissão: " + dataAdmissao +
               "\n Semestre: " + semestre +
               "\n Curso: " + tipoCurso +
               "\n Mensalidade: R$" + mensalidade;
    }

    public float getMensalidade(String tipoCurso) {
        float valor = 700f;

        if (tipoCurso == "Engenharia")
            valor += 20/100 * 700;
        else if (tipoCurso == "Computação")
            valor += 10/100 * 700;
        else // Letras
            valor += 5/100 * 700;

        
        // Aluno irregular
        if (!alunoRegular())
            valor += 20/100 * 700;

        return valor;
    }   

    protected boolean alunoRegular() {
        int aux = Math.abs(dataAdmissao.getMes() - 6);

        if (aux == semestre)
            return true;

        return false;
    }
}
