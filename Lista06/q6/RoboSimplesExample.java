public class RoboSimples {
  private  String nomeDoRobo;
  private int posicaoXAtual, posicaoYAtual;
  private String direcaoAtual;

  RoboSimples(String nome, int px, int py, String d) {
    nomeDoRobo = nome;
    posicaoXAtual = px;
    posicaoYAtual = py;
    direcaoAtual = d;

    validaRobo(nome, d);
}

  RoboSimples(String nome) {
      this(nome, 0, 0, "N");
  }

  private void validaRobo(String nome, String d) {
    if (nome == null) 
      nomeDoRobo = "SemNome";
    
    if ((d != "N") || (d != "S") ||
        (d != "E") || (d != "O"))
      direcaoAtual = "N";
  }

  public void move() {
    this.move(1);
  }

  public void move(int passos) {
    if (direcaoAtual == "N") posicaoYAtual += passos;
    if (direcaoAtual == "S") posicaoYAtual -= passos;
    if (direcaoAtual == "E") posicaoXAtual += passos;
    if (direcaoAtual == "O") posicaoXAtual -= passos;
  
    if (direcaoAtual == "NE") {
      posicaoXAtual += passos;
      posicaoYAtual += passos;
    }
  
    if (direcaoAtual == "NO") {
      posicaoXAtual -= passos;
      posicaoYAtual += passos;
    }
  
    if (direcaoAtual == "SE") {
      posicaoXAtual += passos;
      posicaoYAtual -= passos;
    }
      
    if (direcaoAtual == "SO") {
      posicaoXAtual -= passos;
      posicaoYAtual -= passos;
    }
  }

  public void mudaDireção(String novaDirecao) {
    direcaoAtual = novaDirecao;
  }

  public String toString() {
    String str = "\nNome do robo: "+nomeDoRobo+"\n";
    str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
    str = str + "Direcao do robo: "+direcaoAtual;

    return str;
  }
}
