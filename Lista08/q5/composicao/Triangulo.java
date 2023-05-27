public class Triangulo {
  private Ponto2D P1, P2, P3;
  private float reta1, reta2, reta3;

  public Triangulo(float x1, float y1, float x2, float y2, float x3, float y3) {
    Ponto2D P1 = new Ponto2D(x1, y1);
    Ponto2D P2 = new Ponto2D(x2, y2);
    Ponto2D P3 = new Ponto2D(x3, y3);
    
    this.P1 = P1;
    this.P2 = P2;
    this.P3 = P3;

    if ((P1.getX()==P2.getX() && P2.getX()==P3.getX()) || (P1.getY()==P2.getY() && P2.getY()==P3.getY())) {
      P3.setX(++x3);
      P3.setY(++y3);
    }

    reta1 = calculaDimensao(P1, P2);
    reta2 = calculaDimensao(P2, P3);
    reta3 = calculaDimensao(P3, P1);
  }

  public String imprimeTriangulo() {
    return "Pontos do triângulo: P1("+P1.getX()+", "+P1.getY()+") , P2("+P2.getX()
           +", "+P2.getY()+") e P3("+P3.getX()+", "+P3.getY()+")";
  }

  public float calculaDimensao(Ponto2D pIni, Ponto2D pFin) {
    return pIni.distancia(pFin);
  }

  public boolean isTrianguloRetangulo() {
    // Se houver um lado que o seu quadrado seja igual 
    // a soma dos quadrados dos outros
    if (reta1*reta1 == (reta2*reta2 + reta3*reta3) || 
        reta2*reta2 == (reta1*reta1 + reta3*reta3) ||
        reta3*reta3 == (reta1*reta1 + reta2*reta2))
      return true;

    return false;
  }
  
  public boolean isTrianguloIssoceles() {
    // Se houverem dois lados do triângulo iguais e um diferente
    if ((reta1==reta2 && reta1!=reta3) || 
        (reta1==reta3 && reta1!=reta2) ||
        (reta2==reta3 && reta1!=reta2))
      return true;

    return false;
  }
  
  public boolean isTrianguloEquilatero() {
    // Se houverem os três lados do triângulo iguais
    if (reta1==reta2 && reta1==reta3)
      return true;

    return false;
  }
}
