package abstractImpl;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super("Triangle", color);
        this.base = base;
        this.height = height;
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

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return 3 * base; // Assuming an equilateral triangle for simplicity
    }
}