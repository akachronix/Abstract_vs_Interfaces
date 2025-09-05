package abstractImpl;

/**
 * Class representing a Triangle shape, extending the abstract Shape class
 */
public class Triangle extends Shape 
{
    private double base;
    private double height;

    /**
     * Constructor to initialize Triangle object that calls superclass constructor to set name and color
     * @param color Init color of the triangle
     * @param base Init base of the triangle
     * @param height Init height of the triangle
     */
    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
    }

    /**
     * Method to draw the triangle using '*' characters
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

    /**
     * Method to calculate the area of the triangle
     * @return area of the triangle
     */
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    /**
     * Method to calculate the perimeter of the triangle
     * @return perimeter of the triangle
     */
    @Override
    public double perimeter() {
        return 3 * base; // Assuming an equilateral triangle for simplicity
    }
}