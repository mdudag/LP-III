public class Ponto2DExample {
  public static void main(String args[]) {
    Ponto2D ponto1 = new Ponto2D(2.4f, -8.1f);
    Ponto2D ponto2 = new Ponto2D(3f, 5.6f);

    ponto1.imprimirPonto();
    System.out.println();
    ponto2.imprimirPonto();
    System.out.printf("\n\nDistância entre os pontos: %.0f", ponto1.distancia(ponto2));
  }
}
