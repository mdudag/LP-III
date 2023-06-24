package q;

import java.lang.Math;

public class Ponto2D {
    protected float x;
    protected float y;

    public Ponto2D(float x, float y) {
      this.x = x;
      this.y = y;
    }

    public Ponto2D(Ponto2D p) {
      this(p.x, p.y);
    }

    public Ponto2D() {
      this(0, 0);
    }

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
    
    // Outros métodos

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

    public boolean isOrigin() {
      if (x==0 && y==0)
        return true;

      return false;
    }

    public void localPonto() {
      System.out.println("\nO ponto está no eixo x? " + isEixoX() +
                        "\nO ponto está no eixo y? " + isEixoY() +
                        "\nO ponto está na origem? " + isOrigin());
    }
    
    /* public int quadrante() {
      if (x > 0) 
        return (y > 0) ? 1 : 4;
      else if (x < 0)
        return (y > 0) ? 2 : 3;
      else
        return 0;
    } */

    public float distancia(float x, float y) {
      return ((float) (Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2))));
    }
    
    public float distancia(Ponto2D p) {
      return distancia(p.x, p.y);
    }

    public float distancia() {
      return distancia(0, 0);
    }

    public String toString() {
      return "\nPonto: ("+x+", "+y+")";
    }

    public void imprimirPonto() {
      System.out.printf(toString());
      //System.out.printf("\nO ponto se encontra no %dº quadrante", quadrante());
    }
}
