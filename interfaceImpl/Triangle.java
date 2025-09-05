package interfaceImpl;

public class Triangle extends Shape implements Drawable, Calculable 
{
    private double base, height;

    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.name = "Triangle";
        this.color = color;
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public double perimeter() {
        // Assuming an equilateral triangle for simplicity
        return 3 * base;
    }

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
