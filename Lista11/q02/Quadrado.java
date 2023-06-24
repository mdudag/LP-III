package q02;

public class Quadrado implements Shape2D {
    protected Ponto2D p;
    protected float lado;

    public Quadrado(float x, float y, float l) {
        if (validaQuadrado(l)) {
            p = new Ponto2D(x, y);
            lado = l;
        }
        else {
            System.out.println("Quadrado inválido!");
            iniciaQuadrado();
        }
    }

    public Quadrado(Quadrado quad) {
        this(quad.p.x, quad.p.y, quad.lado);
    }

    public Quadrado() {
        this(0, 0, 1);
    }

    // Outros Métodos

    protected boolean validaQuadrado(float l) {
        if (l>0) return true;
        return false;
    }

    protected void iniciaQuadrado() {
        p = new Ponto2D();
        lado = 1;
    }

    @Override
    public String toString() {
        return "\n  --- Quadrado ---\n" +
               p.toString() +
               "\nLado: " + lado;
    }

    @Override
    public float calculaArea() {
        return lado*lado;
    }

    @Override
    public float calculaPerimetro() {
        return 4*lado;
    }
}
