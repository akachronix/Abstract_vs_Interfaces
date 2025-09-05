package abstractImpl;

/**
 * Class representing a Rectangle shape, extending the abstract Shape class
 */
public class Rectangle extends Shape 
{
    private double length;
    private double width;

    /**
     * Constructor to initialize Rectangle object that calls superclass constructor to set name and color
     * @param color Init color of the rectangle
     * @param length Init length of the rectangle
     * @param width Init width of the rectangle
     */
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }

    /**
     * Method to draw the rectangle using '*' characters
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
     * Method to calculate the area of the rectangle
     * @return area of the rectangle
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Method to calculate the perimeter of the rectangle
     * @return perimeter of the rectangle
     */
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}