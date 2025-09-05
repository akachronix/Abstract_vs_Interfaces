package interfaceImpl;
import interfaceImpl.interfaces.*;

/**
 * Rectangle class implementing Shape, Drawable, Calculable
 */
public class Rectangle extends Shape implements Drawable, Calculable 
{
    private double length, width;
    
    /**
     * Constructor to initialize Rectangle with color, length, and width
     * @param color Init color of the rectangle
     * @param length Init length of the rectangle
     * @param width Init width of the rectangle
     */
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.name = "Rectangle";
        this.color = color;
        this.length = length;
        this.width = width;
    }

    /**
     * Draw the rectangle using '*' characters from Drawable interface
     */
    @Override
    public void draw() 
    {
        for (int i = 0; i < width; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                if (i == 0 || i == width - 1 || j == 0 || j == length - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }

    /**
     * Calulate area of the rectangle
     * @return area of the rectangle
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Calculate perimeter of the rectangle
     * @return perimeter of the rectangle
     */
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    /**
     * Get length of the rectangle
     * @return length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Set length of the rectangle
     * @param length New length of the rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get width of the rectangle
     * @return width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set width of the rectangle
     * @param width New width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }
}
