public class SegmentoReta {
  private Ponto2D pIni;
  private Ponto2D pFin;

  public SegmentoReta(Ponto2D P1, Ponto2D P2) {
    pIni = P1;
    pFin = P2;

    // Se a dimensão for nula
    if (calculaDimensao() == 0) {
      // Aumenta o valor de um dos pontos
      P2.setX(P2.getX()+1);
      P2.setY(P2.getY()+1);
      
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
