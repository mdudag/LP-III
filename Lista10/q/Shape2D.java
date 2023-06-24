package q;

public class Shape2D {
    protected Ponto2D p;
    protected float reta;

    public Shape2D(float x, float y, float reta) {
        if (validaShape2D(reta)) {
            p = new Ponto2D(x, y);
            this.reta = reta;
        }
        else iniciaShape2D(); 
    }

    public Shape2D(Shape2D shape2D) {
        this(shape2D.p.x, shape2D.p.y, shape2D.reta);
    }

    public Shape2D() {
        this(0, 0, 1);
    }

    // Método Getter

    public Ponto2D getPonto() {
        return p;
    }

    public float getReta() {
        return reta;
    }

    // Outros Métodos

    protected boolean validaShape2D(float r) {
        if (r>0) return true;
        return false;
    }

    protected void iniciaShape2D() {
        p.x = p.y = 0;
        reta = 1;
    }

    public String toString() {
        return "\n  --- Shape2D ---\n" +
               p.toString() +
               "\nReta: " + reta;
    }

    public float calculaArea() {
        return reta*reta;
    }

    public float calculaPerimetro() {
        return 2*reta;
    }
}
