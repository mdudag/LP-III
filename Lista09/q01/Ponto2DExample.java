package q01;

public class Ponto2DExample {
  public static void main(String args[]) {
    Ponto2D ponto1 = new Ponto2D(0f, -8.1f);
    Ponto2D ponto2 = new Ponto2D(3f, 0f);
    Ponto2D ponto3 = new Ponto2D();

    ponto1.imprimirPonto();
    ponto1.localPonto();
    ponto2.imprimirPonto();
    ponto2.localPonto();
    ponto3.imprimirPonto();
    ponto3.localPonto();
    
    System.out.printf("\n\nDistância entre P1 e P2: %.0f", ponto1.distancia(ponto2));
    System.out.printf("\nDistância entre P1 e a origem: %.0f", ponto1.distancia());
    System.out.printf("\nDistância entre P1 e P(4, 10): %.0f\n", ponto1.distancia(4, 10));
  }
}
