package q01;

abstract public class Shape2D {
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

    abstract public String toString();
    abstract public float calculaArea();
    abstract public float calculaPerimetro();
}
