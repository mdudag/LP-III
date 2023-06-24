package q03;

import java.lang.Math;
import q02.Shape2D;
import q02.Circulo;
import q02.Ponto2D;

public class CirculoScale extends Circulo implements Shape2DScalavel {
    public CirculoScale(float x, float y, float r)  {
        super(x, y, r);
    }

    public CirculoScale(CirculoScale circScale) {
        super(circScale.p.getX(), circScale.p.getY(), circScale.raio);
    }

    public CirculoScale() {
        this(0, 0, 1);
    }

    // Outros Métodos

    @Override
    public void scale(int scale) {
        raio *= scale;
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
