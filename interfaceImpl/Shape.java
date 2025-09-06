package interfaceImpl;

/** 
 * Generic shape class that other shapes will extend
 */
public abstract class Shape 
{
    protected String name, color;

    /**
     * Constructor to initialize generic Shape with name and color
     * @param name
     * @param color
     */
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * Get name of the shape
     * @return name of the shape
     */
    public String getName() {
        return name;
    }
    
    /**
     * Get color of the shape
     * @return color of the shape
     */
    public String getColor() {
        return color;
    }

    /**
     * Set name of the shape
     * @param name New name of the shape
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Set color of the shape
     * @param color New color of the shape
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Abstract method to calculate area of the shape to be implemented by subclasses
     * @return area of the shape
     */
    public abstract double area();

    /**
     * Abstract method to calculate perimeter of the shape to be implemented by subclasses
     * @return perimeter of the shape
     */
    public abstract double perimeter();
}
