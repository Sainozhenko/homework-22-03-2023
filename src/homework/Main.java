package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(54, "Circle");
        Shape rectangle = new Rectangle(22, 32, "Rectangle");
        Shape square = new Square(21, "Square");


        List<Shape> figures = new ArrayList<>(List.of(circle, rectangle, square));

        System.out.println(figures);

        Collections.sort(figures);
        System.out.println();
        for (Shape s : figures) {
            System.out.println(s.getName() + " has area of " + s.getArea());
        }
/*
Output:
Circle { radius=54, name='Circle'},
Rectangle { width=22.0, height=32.0},
Square { side=21.0, name='Square'}]

Square has area of 441.0
Rectangle has area of 704.0
Circle has area of 9160.884177867836
*/

    }
}
