package q04;

import java.lang.Math;

public class Cone extends Circulo {
    protected float altura;

    public Cone(float x, float y, float r, float h) {
        super(x, y, r);

        if (validaCone(r, h)) {
            raio = r;
            altura = h;
        }
        else 
            ponto.x = ponto.y = raio = altura = 0;
    }

    // Outros Métodos

    protected boolean validaCone(float r, float h) {
        validaCirculo(r);
        
        if (h>0)
            return true;

        return false;
    }

    public String toString() {
        return super.toString() +
               "\n  - Altura: " + altura;
    }

    public float calculaVolume() {
        return (float) (super.area() * altura * 1/3);
    }

    public float calculaAreaSuperficial() {
        float g = (float) (Math.sqrt(raio*raio + altura*altura));

        // pi*r² + pi*r*g
        return super.area() + super.area()/raio*g;
    }
}
