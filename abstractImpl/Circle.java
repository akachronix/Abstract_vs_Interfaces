package abstractImpl;

/**
 * Class representing a Circle shape, extending the abstract Shape class
 */
public class Circle extends Shape 
{
    private double radius;

    /**
     * Constructor to initialize Circle object that calls superclass constructor to set name and color
     * @param color Init color of the circle
     * @param radius Init radius of the circle
     */
    public Circle(String color, double radius) {
        super("Circle", color);
        this.radius = radius;
    }

    /**
     * Method to draw the circle using '*' characters
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
     * Method to calculate the area of the circle
     * @return area of the circle
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Method to calculate the perimeter of the circle
     * @return perimeter of the circle
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}