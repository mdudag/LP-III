package q03;

import q02.Shape2D;
import q02.Triangulo;
import q02.Ponto2D;

public class TrianguloScale extends Triangulo implements Shape2DScalavel {
    public TrianguloScale(float x, float y, float l1, float l2, float l3) {
        super(x, y, l1, l2, l3);
    }

    public TrianguloScale(TrianguloScale triang) {
        super(triang.p.getX(), triang.p.getY(), triang.lado1, triang.lado2, triang.lado3);
    }

    public TrianguloScale() {
        super(0, 0, 1, 1, 1);
    }

    // Métodos

    @Override
    public void scale(int scale) {
        lado1 *= scale;
        lado2 *= scale;
        lado3 *= scale;
    }

    @Override
    public void reflectToX() {
        p = new Ponto2D(-p.getX(), p.getY());
    }

    @Override
    public void reflectToY() {
        p = new Ponto2D(p.getX(), -p.getY());
    }
}
