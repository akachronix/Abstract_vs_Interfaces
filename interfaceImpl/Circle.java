package interfaceImpl;
import interfaceImpl.interfaces.*;

/*
 * Circle class implementing Shape, Drawable, Calculable 
 */
public class Circle extends Shape implements Drawable, Calculable {
    private double radius;

    /**
     * Constructor for Circle
     * @param color init value of color
     * @param radius init value of radius
     */
    public Circle(String color, double radius) {
        super("Circle", color);
        this.name = "Circle";
        this.color = color;
        this.radius = radius;
    }

    /** 
     * Draw method using '*' characters from Drawable interface 
     */
    @Override
    public void draw() 
    {
        for (int i = 0; i <= 2 * radius; i++) 
        {
            for (int j = 0; j <= 2 * radius; j++) 
            {
                double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    /**
     * Get radius of the circle
     * @return radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set radius of the circle
     * @param radius New radius of the circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Area method from Calculable interface
     * @return area of the circle
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /** Perimeter method from Calculable interface
     * @return perimeter of the circle
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}
