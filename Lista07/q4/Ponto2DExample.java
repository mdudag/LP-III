public class Ponto2DExample {
  public static void main(String args[]) {
    Ponto2D p1 = new Ponto2D(2.4f, -8.1f);
    Ponto2D p2 = new Ponto2D(3f, 5.6f);

    Ponto2D_static.imprimirPonto(p1);
    System.out.println();
    p2.imprimirPonto();
    System.out.println();
    
    System.out.printf("\n\nDistância entre P1 e P2: %.0f", Ponto2D_static.distance(p1, p2));
    System.out.printf("\nDistância entre P1 e a origem: %.0f\n", Ponto2D_static.distance(p1));
  }
}
