public class Ponto2DExample {
  public static void main(String args[]) {
    Ponto2D ponto1 = new Ponto2D(2.4f, -8.1f);
    Ponto2D ponto2 = new Ponto2D(3f, 5.6f);
    Ponto2D ponto3 = new Ponto2D();

    ponto1.imprimirPonto();
    System.out.println();
    ponto2.imprimirPonto();
    System.out.println();
    ponto3.imprimirPonto();
    
    System.out.printf("\n\nDistância entre P1 e P2: %.0f", ponto1.distancia(ponto2));
    System.out.printf("\nDistância entre P1 e a origem: %.0f\n", ponto1.distancia());
    System.out.printf("\nDistância entre P1 e (4, 10): %.0f\n", ponto1.distancia(4, 10));
  }
}
