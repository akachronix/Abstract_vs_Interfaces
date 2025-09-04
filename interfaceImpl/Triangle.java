package interfaceImpl;

public class Triangle implements Drawable, Calculable {
    private String name, color;
    private double base, height;

    public Triangle(String color, double base, double height) {
        this.name = "Triangle";
        this.color = color;
        this.base = base;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void draw() {
        int rows = (int) height;
        for (int i = 1; i <= rows; i++) {
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
