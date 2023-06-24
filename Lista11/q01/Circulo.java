package q01;

import java.lang.Math;

public class Circulo extends Shape2D {
    public Circulo(float x, float y, float raio) {
        super(x, y, raio);
    }

    public Circulo(Circulo circ) {
        super(circ.p.x, circ.p.y, circ.reta);
    }

    public Circulo() {
        super(0, 0, 1);
    }

    // Outros Métodos

    @Override
    public String toString() {
        return "\n  --- Círculo ---\n" +
               p.toString() +
               "\nRaio: " + reta;
    }

    @Override
    public float calculaArea() {
        return (float) (Math.PI*reta*reta);
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2*Math.PI*reta);
    }
}
