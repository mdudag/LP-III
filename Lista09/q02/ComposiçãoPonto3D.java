package q02;

import q01.Ponto2D;

public class ComposiçãoPonto3D {
    private Ponto2D p;
    private float z;

    public ComposiçãoPonto3D(float x, float y, float z) {
        Ponto2D p = new Ponto2D(x, y);

        this.p = p;
        this.z = z;
    }

    public ComposiçãoPonto3D(float x, float y) {
        this(x, y, 0);
    }

    public ComposiçãoPonto3D(float z) {
        this(0, 0, z);
    }

    public ComposiçãoPonto3D() {
        this(0, 0, 0);
    }

    // Método Getter

    public float getZ() {
        return z;
    }

    public Ponto2D getPonto2D() {
        return p;
    }

    // Método Setter

    public void setZ(float z) {
        this.z = z;
    }

    public void setPonto2D(Ponto2D p) {
        this.p = p;
    }

    // Outros Métodos

    public boolean isPlanoXY() {
        if (z==0 &&
            p.getX()!=0 &&
            p.getY()!=0)
        return true;
      
      return false;
    }

    public boolean isPlanoXZ() {
        if (p.getY()==0 &&
            p.getX()!=0 &&
            z!=0)
        return true;
      
      return false;
    }

    public boolean isPlanoYZ() {
        if (p.getX()==0 &&
            p.getY()!=0 &&
            z!=0)
        return true;
      
      return false;
    }

    public boolean isOrigin() {
      if (p.getX()==0 && 
          p.getY()==0 && 
          z==0)
        return true;

      return false;
    }

    public void localPonto() {
      System.out.println("\nO ponto está no plano xy? " + isPlanoXY() +
                         "\nO ponto está no plano xz? " + isPlanoXZ() +
                         "\nO ponto está no plano yz? " + isPlanoYZ() +
                         "\nO ponto está na origem? " + isOrigin());
    }

    public float distancia(float x2, float y2, float z2) {
        float x1 = getPonto2D().getX();
        float y1 = getPonto2D().getY();
        float z1 = z;

      return ((float) (Math.sqrt(
                       Math.pow((x2 - x1), 2) + 
                       Math.pow((y2 - y1), 2) + 
                       Math.pow((z2 - z1), 2)
                       )));
    }
    
    public float distancia(ComposiçãoPonto3D p) {
        float x2 = p.getPonto2D().getX();
        float y2 = p.getPonto2D().getY();
        float z2 = p.getZ();

      return distancia(x2, y2, z2);
    }

    public float distancia() {
      return distancia(0, 0, 0);
    }

    public String toString() {
      return "\nPonto: ("+p.getX()+", "+p.getY()+", "+z+")";
    }

    public void imprimirPonto() {
      System.out.printf(toString());
    }
}
