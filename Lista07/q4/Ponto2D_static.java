public class Ponto2D_static {
  public static float distance(Ponto2D P1, Ponto2D P2) {
    // Calcula a distância entre dois pontos
    return ((float) (Math.sqrt(Math.pow((P2.getX() - P1.getX()), 2) + Math.pow((P2.getY() - P1.getY()), 2))));
  }

  public static float distance(Ponto2D P) {
    Ponto2D P0 = new Ponto2D(0, 0);
    return distance(P, P0);
  }

  public static int quadrant(Ponto2D P) {
    // Informa o quadrante que o ponto se encontra
    if (P.getX() > 0) 
      return (P.getY() > 0) ? 1 : 4;
    else if (P.getX() < 0)
      return (P.getY() > 0) ? 2 : 3;
    else
      return 0;
  }

  public static void imprimirPonto(Ponto2D P) {
    System.out.printf("\nPonto: (%.2f, %.2f)", P.getX(), P.getY());
    System.out.printf("\nO ponto se encontra no %dº quadrante", quadrant(P));
  }
}
