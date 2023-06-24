package q03;

import q02.Shape2D;
import q02.Retangulo;
import q02.Ponto2D;

public class RetanguloScale extends Retangulo implements Shape2DScalavel {
    public RetanguloScale(float x, float y, float b, float a) {
        super(x, y, b, a);
    }

    public RetanguloScale(RetanguloScale retang) {
        super(retang.p.getX(), retang.p.getY(), retang.base, retang.altura);
    }

    public RetanguloScale() {
        super(0, 0, 1, 1);
    }

    // Métodos

    @Override
    public void scale(int scale) {
        base *= scale;
        altura *= scale;
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
