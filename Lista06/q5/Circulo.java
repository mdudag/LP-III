import java.lang.Math;

public class Circulo {
  Ponto2D ponto;
  private float raio;

  public Circulo(float x, float y, float r) {
    ponto = new Ponto2D(x, y);
    raio = validaCirculo(r);
  }

  public Circulo() {
    this(0, 0, 1);
  }

  public Circulo(float x, float y) {
    this(x, y, 1);
  }

  public Circulo(float r) {
    this(0, 0, r);
  }
  
  // Método Getter

  public Ponto2D getPonto() {
    return ponto;
  }

  public float getRaio() {
    return raio;
  }

  // Outros métodos da classe

  private float validaCirculo(float r) {
    if (r == 0) {
      System.out.println("Erro!! Valor de raio inválido!");
    }
    else if (r < 0) {
      System.out.println("Valor de raio negativo convertido para positivo");
      r *= (-1);
    }

    return r;
  }

  public boolean isInnerPoint(Ponto2D p) {
    if (ponto.distancia(p) <= raio) 
      return true;

    return false;
  }

  public float area() {
    return (float) (Math.PI * raio * raio);
  }

  public float perimeter() {
    return (float) (2 * Math.PI * raio);
  }

  public boolean isBiggerThan(Circulo outroC) {
    if (area() > outroC.area())
      return true;

    return false;
  }

  public void imprimirCirculo() {
    System.out.println("\n+---------------------------------------+");
    System.out.println("|                CÍRCULO                |");
    System.out.println("+---------------------------------------+");
    System.out.printf("  - Ponto do centro: P(%.1f, %.1f)", ponto.getX(), ponto.getY());
    System.out.printf("\n  - Raio: %.1f\n", raio);
    System.out.println("+---------------------------------------+");
  }
}
