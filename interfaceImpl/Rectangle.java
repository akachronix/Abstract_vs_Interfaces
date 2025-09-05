package interfaceImpl;

public class Rectangle extends Shape implements Drawable, Calculable 
{
    private double length, width;
    
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);
        this.name = "Rectangle";
        this.color = color;
        this.length = length;
        this.width = width;
    }

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

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
