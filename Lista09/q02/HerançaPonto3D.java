package q02;

import q01.Ponto2D;

public class HerançaPonto3D extends Ponto2D{
    private float z;

    public HerançaPonto3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public HerançaPonto3D(float x, float y) {
        this(x, y, 0);
    }

    public HerançaPonto3D(float z) {
        this(0, 0, z);
    }

    public HerançaPonto3D() {
        this(0, 0, 0);
    }

    // Método Getter

    public float getZ() {
        return z;
    }

    // Método Setter

    public void setZ(float z) {
        this.z = z;
    }

    // Outros Métodos

    public boolean isPlanoXY() {
        // OBS: Como x e y são protected, posso usá-los 
        // diretamente na classe que os herdou
        if ((z==0) && (x!=0) && (y!=0))
        return true;
      
      return false;
    }

    public boolean isPlanoXZ() {
        if ((y==0) && (x!=0) && (z!=0))
        return true;
      
      return false;
    }

    public boolean isPlanoYZ() {
        if ((x==0) && (y!=0) && (z!=0))
        return true;
      
      return false;
    }

    public boolean isOrigin() {
      if ((x==0) && (y==0) && (z==0))
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
      return ((float) (Math.sqrt(
                       Math.pow((x2 - x), 2) + 
                       Math.pow((y2 - y), 2) + 
                       Math.pow((z2 - z), 2)
                       )));
    }
    
    public float distancia(HerançaPonto3D p) {
      return distancia(p.x, p.y, p.z);
    }

    public float distancia() {
      return distancia(0, 0, 0);
    }

    public String toString() {
      return "\nPonto: ("+x+", "+y+", "+z+")";
    }

    public void imprimirPonto() {
      System.out.printf(toString());
    }
}
