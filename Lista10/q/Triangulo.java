package q;

public class Triangulo extends Shape2D {
    protected float reta2, reta3;

    public Triangulo(float x, float y, float r1, float r2, float r3) {
        super(x, y, r1); 

        if (validaTriangulo(r1, r2, r3)) {
            reta2 = r2;
            reta3 = r3;
        }
        else iniciaTriangulo();
    }

    public Triangulo(Triangulo triang) {
        this(triang.p.x, triang.p.y, triang.reta, triang.reta2, triang.reta3);
    }

    public Triangulo() {
        this(0, 0, 1, 1, 1);
    }

    // Método Getter

    public float getReta2() {
        return reta2;
    }

    public float getReta3() {
        return reta3;
    }

    // Outros Métodos

    protected boolean validaTriangulo(float r, float r2, float r3) {
        if (super.validaShape2D(r) &&
            r2>0 && r3>0)
            return true;
        return false;
    }

    protected void iniciaTriangulo() {
        iniciaShape2D();
        reta2 = 1;
        reta3 = 1;
    }

    @Override
    public String toString() {
        return "\n  --- Triângulo ---\n" +
               p.toString() +
               "\nLado 1: " + reta +
               "\nLado 2: " + reta2 +
               "\nLado 3: " + reta3;
    }

    @Override
    public float calculaArea() {
        return reta*reta2/2;
    }

    @Override
    public float calculaPerimetro() {
        return 3*reta;
    }
}
