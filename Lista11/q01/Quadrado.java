package q01;

public class Quadrado extends Shape2D {
    public Quadrado(float x, float y, float r) {
        super(x, y, r);
    }

    public Quadrado(Quadrado quad) {
        super(quad.p.x, quad.p.y, quad.reta);
    }

    public Quadrado() {
        super(0, 0, 1);
    }

    // Outros Métodos

    @Override
    public String toString() {
        return "\n  --- Quadrado ---\n" +
               p.toString() +
               "\nLado: " + reta;
    }

    @Override
    public float calculaArea() {
        return reta*reta;
    }

    @Override
    public float calculaPerimetro() {
        return 4*reta;
    }
}
