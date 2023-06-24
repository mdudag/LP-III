package q03;

import q02.Shape2D;
import q02.Quadrado;
import q02.Ponto2D;

public class QuadradoScale extends Quadrado implements Shape2DScalavel {
    public QuadradoScale(float x, float y, float l) {
        super(x, y, l);
    }

    public QuadradoScale(QuadradoScale quad) {
        super(quad.p.getX(), quad.p.getY(), quad.lado);
    }

    public QuadradoScale() {
        super(0, 0, 1);
    }

    // Métodos

    @Override
    public void scale(int scale) {
        lado *= scale;
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
