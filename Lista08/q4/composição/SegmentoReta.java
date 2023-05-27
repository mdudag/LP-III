public class SegmentoReta {
  private Ponto2D pIni;
  private Ponto2D pFin;

  public SegmentoReta(float x1, float y1, float x2, float y2) {
    Ponto2D P1 = new Ponto2D(x1, y1);
    Ponto2D P2 = new Ponto2D(x2, y2);
    
    pIni = P1;
    pFin = P2;

    // Se a dimensão for nula
    if (calculaDimensao() == 0) {
      // Aumenta o valor de um dos pontos
      P2.setX(x2++);
      P2.setY(y2++);
      
      // Atribui o novo valor do ponto
      pFin = P2;
    }
  }

  public String imprimeSegmentoReta() {
    return "O segmento de reta inicia no ponto (" +  pIni.getX() + 
           ", " + pIni.getY() + ") e finaliza no ponto (" + pFin.getX() + 
           ", " + pFin.getY() + ") com dimensão " + calculaDimensao();
  }

  public float calculaDimensao() {
    return pIni.distancia(pFin);
  }
}
