package q01;

import java.util.ArrayList;
import java.util.List;

public class ExampleShape2D {
    public static void main(String args[]) {
        List<Shape2D> myShapes2d = new ArrayList<>();

        myShapes2d.add(new Quadrado(0, 4, 2));
        myShapes2d.add(new Retangulo(7, -1, 4, 3));
        myShapes2d.add(new Triangulo(-4, 5, 3, 3, 3));
        myShapes2d.add(new Circulo());

        for (Shape2D item: myShapes2d)
            System.out.println(item.toString());
        
        System.out.println();
    }
}
