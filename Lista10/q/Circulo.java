package q;

import java.lang.Math;

public class Circulo extends Shape2D {
    public Circulo(float x, float y, float raio) {
        super(x, y, raio);
    }

    public Circulo(Circulo curc) {
        super(curc.p.x, curc.p.y, curc.reta);
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

    public float calculaArea() {
        return (float) (Math.PI*reta*reta);
    }

    public float calculaPerimetro() {
        return (float) (2*Math.PI*reta);
    }
}
