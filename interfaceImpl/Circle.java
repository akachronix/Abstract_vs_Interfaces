package interfaceImpl;

public class Circle implements Drawable, Calculable {
    private String name, color;
    private double radius;

    public Circle(String color, double radius) {
        this.name = "Circle";
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
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

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}
