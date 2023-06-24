package q01;

public class Retangulo extends Shape2D {
    protected float reta2;

    public Retangulo(float x, float y, float r, float r2) {
        super(x, y, r);

        if (validaRetangulo(r, r2)) 
            reta2 = r2;
        else 
            iniciaRetangulo();
    }

    public Retangulo(Retangulo retang) {
        this(retang.p.x, retang.p.y, retang.reta, retang.reta2);
    }

    public Retangulo() {
        this(0, 0, 1, 1);
    }

    // Método Getter

    public float getReta2() {
        return reta2;
    }

    // Outros Métodos

    protected boolean validaRetangulo(float r, float r2) {
        if (super.validaShape2D(r) &&
            r2>0)
            return true;
        return false;
    }

    protected void iniciaRetangulo() {
        iniciaShape2D();
        reta2 = 1;
    }

    @Override
    public String toString() {
        return "\n  --- Retângulo ---\n" +
               p.toString() +
               "\nBase: " + reta +
               "\nAltura: " + reta2;
    }
    
    @Override
    public float calculaArea() {
        return reta*reta2;
    }

    @Override
    public float calculaPerimetro() {
        return 2*(reta+reta2);
    }
}
