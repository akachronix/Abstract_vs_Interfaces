package interfaceImpl;
import interfaceImpl.interfaces.*;

/**
 * Triangle class implementing Shape, Drawable, Calculable
 */
public class Triangle extends Shape implements Drawable, Calculable 
{
    private double base, height;

    /**
     * Constructor to initialize Triangle with color, base, and height
     * @param color Init color of the triangle
     * @param base Init base of the triangle
     * @param height Init height of the triangle
     */
    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.name = "Triangle";
        this.color = color;
        this.base = base;
        this.height = height;
    }

    /** 
     * Get base of the triangle
     * @return base of the triangle
     */
    public double getBase() {
        return base;
    }

    /**
     * Set base of the triangle
     * @param base New base of the triangle
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Get height of the triangle
     * @return height of the triangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set height of the triangle
     * @param height New height of the triangle
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculate area of the triangle
     * @return area of the triangle
     */
    public double area() {
        return 0.5 * base * height;
    }

    /**
     * Calculate perimeter of the triangle
     * @return perimeter of the triangle
     */
    public double perimeter() {
        // Assuming an equilateral triangle for simplicity
        return 3 * base;
    }

    /**
     * Draw the triangle using '*' characters from Drawable interface
     */
    @Override
    public void draw() 
    {
        int rows = (int) height;
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
