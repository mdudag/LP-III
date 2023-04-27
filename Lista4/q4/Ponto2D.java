import java.lang.Math;

public class Ponto2D {
  private float x;
  private float y;

  // Método Getter

  public float getX() {
    return x;
  }

  public float getY() {
    return y;
  }
  
  // Método Setter

  public void setX(float x) {
    this.x = x;
  }

  public void setY(float y) {
    this.y = y;
  }
  
  // Métodos da classe

  public boolean isEixoX() {
    if ((y == 0) && (x != 0))
      return true;
    
    return false;
  }
  
  public boolean isEixoY() {
    if ((x == 0) && (y != 0))
      return true;
    
    return false;
  }
  
  public boolean isEixos() {
    if ((x == 0) && (y == 0))
      return true;
    
    return false;
  }
  
  public int quadrante() {
    if (x > 0) 
      return (y > 0) ? 1 : 4;
    else if (x < 0)
      return (y > 0) ? 2 : 3;
    else
      return 0;
  }

  public float distancia(Ponto2D p) {
    return ((float) (Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2))));
  }

  public void imprimirPonto() {
    System.out.printf("\nPonto: (%.2f, %.2f)", x, y);
    System.out.printf("\nO ponto se encontra no %dº quadrante", quadrante());
  }
}
