public class Main4 {
  public static void main(String args[]) {
    Ponto2D ponto1 = new Ponto2D();
    Ponto2D ponto2 = new Ponto2D();

    ponto1.setX(2.4f);
    ponto1.setY(-8.1f);

    ponto2.setX(3f);
    ponto2.setY(5.6f);

    ponto1.imprimirPonto();
    System.out.println();
    ponto2.imprimirPonto();
    System.out.printf("\n\nDistância entre os pontos: %.0f", ponto1.distancia(ponto2));
  }
}
