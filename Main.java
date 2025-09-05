import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Using Interface Classes:\n");

        ArrayList<interfaceImpl.Shape> shapes = new ArrayList<>();
        shapes.add(new interfaceImpl.Circle("Red", 5));
        shapes.add(new interfaceImpl.Rectangle("Blue", 10, 5));
        shapes.add(new interfaceImpl.Triangle("Green", 6, 4));

        for (interfaceImpl.Shape shape : shapes)
        {
            System.out.println("Shape: " + shape.getName() + ", Color: " + shape.getColor());
            System.out.printf("Area: %.2f\n", shape.area());
            System.out.printf("Perimeter: %.2f\n", shape.perimeter());
            System.out.println("\nDrawing:");

            if (shape instanceof interfaceImpl.Drawable) {
                ((interfaceImpl.Drawable) shape).draw();
            }

            System.out.println("-----------------------\n");
        }

        System.out.println("-----------------------\n");
        System.out.println("Using Abstract Classes:\n");

        ArrayList<abstractImpl.Shape> abstractShapes = new ArrayList<>();
        abstractShapes.add(new abstractImpl.Circle("Red", 5));
        abstractShapes.add(new abstractImpl.Rectangle("Blue", 10, 5));
        abstractShapes.add(new abstractImpl.Triangle("Green", 6, 4));

        for (abstractImpl.Shape shape : abstractShapes)
        {
            System.out.println("Shape: " + shape.getName() + ", Color: " + shape.getColor());
            System.out.printf("Area: %.2f\n", shape.area());
            System.out.printf("Perimeter: %.2f\n", shape.perimeter());
            System.out.println("\nDrawing:");

            shape.draw();

            System.out.println("-----------------------\n");
        }
    }
}
