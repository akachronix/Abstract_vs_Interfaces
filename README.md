### How to run
Main.java uses both implementations so just run:
```bash
java Main.java
```
### AI Usage
- Only supercharged Intellisense was used in terms of AI. Did not use prompts or the chat function. Corrected variable names, clerical errors, and if the AutoComplete was irrelevant I didn't use it.

### Design rationale
- The interface version is better as it is more scalable with the trade off of being a bit too loaded with files for my taste. I hate having 3 line files of code but such is the nature of Java. 
```Java
public interface Drawable {
    public void draw();
}
```
- However, the tradeoff is worth the extra functionality afforded by interfaces. 
- You may also add to interfaces to add more functionality later.
- In my case, the interface implementation has more functionality with almost exact same code with more extensibility and separation.

### Polymorphism
- There are more elements of polymorphism in the interface implementation as we have classifications for Calculable and Drawable objects. For example, we can use if statements and instanceof to determine if the shape is not able to be drawn.
``` Java
if (rect instanceof Drawable) {     // Able to be drawn
    rect.draw();
} else {                            // Not able to be drawn
    // Don't draw.
}
```
- In the abstract implementation we're still allowed to determine whether an object is a shape but we don't have the added functionality above.
```Java
if (rect instanceof Shape) {    // Is shape subclass
    rect.area();
} else {                        // Not shape subclass
    // Do non-shape things
}
```