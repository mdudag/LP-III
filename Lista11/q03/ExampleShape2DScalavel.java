package q03;

import java.util.ArrayList;
import java.util.List;

public class ExampleShape2DScalavel {
    public static void main(String args[]) {
        List<Shape2DScalavel> myShapes2d = new ArrayList<>();

        myShapes2d.add(new QuadradoScale(0, 4, 2));
        myShapes2d.add(new RetanguloScale(7, -1, 4, 3));
        myShapes2d.add(new TrianguloScale(-4, 5, 3, 3, 3));
        myShapes2d.add(new CirculoScale());

        for (Shape2DScalavel item: myShapes2d)
            System.out.println(item.toString());
        
        System.out.println();
    }
}
