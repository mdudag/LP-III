package q03;

public class ColecaoDeFiguras {
    public static void main(String args[]) {
        Shape2DScalavel shape2DCirculo = new CirculoScale(2, 9, 5);
        CirculoScale circulo = new CirculoScale();
        QuadradoScale quadrado = new QuadradoScale(0, 4, 2);
        RetanguloScale retangulo = new RetanguloScale(7, -1, 4, 3);
        TrianguloScale triangulo = new TrianguloScale(-4, 5, 3, 3, 3);

        printShapes2D(shape2DCirculo);
        printShapes2D(circulo);
        printShapes2D(quadrado);
        printShapes2D(retangulo);
        printShapes2D(triangulo);
    }

    public static void printShapes2D(Shape2DScalavel shape2D) {
        System.out.println(shape2D); 
        System.out.println("Área: "+shape2D.calculaArea());
        System.out.println("Perímetro: "+ shape2D.calculaPerimetro() +"\n");
    }
}
