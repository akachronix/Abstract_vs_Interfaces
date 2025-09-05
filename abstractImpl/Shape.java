package abstractImpl;

/**
 * Abstract class representing a generic Shape with common properties and methods
 */
public abstract class Shape 
{
    protected String name, color;

    /**
     * Constructor to initialize a generic Shape object  
     * @param name
     * @param color
     */
    Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Method to get the name of the shape
     * @return name of the shape
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method to get the color of the shape
     * @return color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Method to set the name of the shape
     * @param name name of the shape
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Method to set the color of the shape
     * @param color color of the shape
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Abstract method to calculate the area of the shape to be implemented by subclasses
     * @return area of the shape
     */
    public abstract double area();

    /**
     * Abstract method to calculate the perimeter of the shape to be implemented by subclasses
     * @return perimeter of the shape
     */
    public abstract double perimeter();

    /**
     * Abstract method to draw the shape to be implemented by subclasses
     */
    public abstract void draw();
}