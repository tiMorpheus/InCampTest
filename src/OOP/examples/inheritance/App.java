package OOP.examples.inheritance;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        Point point1 = new Point(2, 2);

        ColorPoint point2 = new ColorPoint(5,6,"Red");
        ColorPoint point3 = new ColorPoint(point1, "Yellow");

        Line line1 = new Line(100,2,150,6);


        Triangle triangle2 = new Triangle(new Point(1,3),new Point(1111,2),new Point (2000, 3));


        // This is generic List which could takes every objects who extends geometry's class
        List<Geometry> geometry = new ArrayList<>();

        // Fill our ArrayList
        geometry.add(point1);
        geometry.add(point2);
        geometry.add(point3);
        geometry.add(line1);
        geometry.add(triangle2);

        //Polymorphism example
        // The Java virtual machine calls the appropriate
        // method for the object that is referred to in each variable
        for (Geometry g : geometry) {
            System.out.println(g);
        }
    }
}
