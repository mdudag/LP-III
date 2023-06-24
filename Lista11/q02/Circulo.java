package q02;

import java.lang.Math;

public class Circulo implements Shape2D {
    private Ponto2D p;
    private float raio;

    public Circulo(float x, float y, float r)  {
        if (validaCirculo(r)) {
            p = new Ponto2D(x, y);
            raio = r;
        }
        else {
            System.out.println("Círculo inválido!");
            iniciaCirculo();
        }
    }

    public Circulo(Circulo circ) {
        this(circ.p.x, circ.p.y, circ.raio);
    }

    public Circulo() {
        this(0, 0, 1);
    }

    // Outros Métodos

    protected boolean validaCirculo(float r) {
        if (r>0) return true;
        return false;
    }

    protected void iniciaCirculo() {
        p = new Ponto2D();
        raio = 1;
    }

    public Ponto2D getCentro() {
        return p;
    }

    @Override
    public String toString() {
        return "\n  --- Círculo ---\n" +
               p.toString() +
               "\nRaio: " + raio;
    }

    @Override
    public float calculaArea() {
        return (float) (Math.PI*raio*raio);
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2*Math.PI*raio);
    }
}
