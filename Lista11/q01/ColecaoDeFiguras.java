package q01;

public class ColecaoDeFiguras {
    public static void main(String args[]) {
        Shape2D shape2DCirculo = new Circulo(2, 9, 5);
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado(0, 4, 2);
        Retangulo retangulo = new Retangulo(7, -1, 4, 3);
        Triangulo triangulo = new Triangulo(-4, 5, 3, 3, 3);

        printShapes2D(shape2DCirculo);
        printShapes2D(circulo);
        printShapes2D(quadrado);
        printShapes2D(retangulo);
        printShapes2D(triangulo);
    }

    public static void printShapes2D(Shape2D shape2D) {
        System.out.println(shape2D); 
        System.out.println("Área: "+shape2D.calculaArea());
        System.out.println("Perímetro: "+ shape2D.calculaPerimetro() +"\n");
    }
}
