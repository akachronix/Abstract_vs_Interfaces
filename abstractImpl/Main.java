package abstractImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Red", 5));
        shapes.add(new Rectangle("Blue", 4, 6));
        shapes.add(new Triangle("Green", 3, 4, 3, 4, 5));

        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter() + "\n");
        }
    }
}
