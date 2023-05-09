public class CirculoExample {
  public static void main(String args[]) {
    Circulo circulo1 = new Circulo(2, 3, -18);

    circulo1.imprimirCirculo();
    System.out.printf("\nArea do cículo: %.2f", circulo1.area());
    System.out.printf("\nPerímetro do cículo: %.2f\n", circulo1.perimeter());

    Circulo circulo2 = new Circulo(10, -3, 22);
    
    circulo2.imprimirCirculo();
    System.out.printf("\nArea do cículo: %.2f", circulo2.area());
    System.out.printf("\nPerímetro do cículo: %.2f\n", circulo2.perimeter());

    Ponto2D p = new Ponto2D(5, 500);

    System.out.println("\nO ponto do cículo 2 é interno ao círculo 1? " + 
                        circulo1.isInnerPoint(circulo2.getPonto()));
    System.out.println("O ponto (" + p.getX() + ", "+ p.getY() + ") é interno ao círculo 1? " +     
                        circulo1.isInnerPoint(p));
    System.out.println("\nA área do cículo 1 é maior que a do circulo 2? " + circulo1.isBiggerThan(circulo2));
  }
}
