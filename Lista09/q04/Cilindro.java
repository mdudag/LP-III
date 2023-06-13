package q04;

public class Cilindro extends Cone {
    public Cilindro(float x, float y, float r, float h) {
        super(x, y, r, h);
    }

    // Outros Métodos

    public float calculaVolume() {
        return (float) (super.area() * altura);
    }

    public float calculaAreaSuperficial() {
        // 2*pi*r² + 2*pi*r * h
        return (float) (2*super.area() + super.perimeter() * altura);
    }
}
