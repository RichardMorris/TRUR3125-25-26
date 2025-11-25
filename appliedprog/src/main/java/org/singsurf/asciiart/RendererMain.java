package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class RendererMain {
    List<Drawable> shapes; // An expandable list of objects
    ShapeFactory shapeFac;
    Renderer renderer;
    /**
     * Constructor, uses the standard shape factory
     * and a simple renderer.
     */
    public RendererMain() { 
        shapeFac = new StandardShapeFactory();
        shapes = new ArrayList<>();
        renderer = new SimpleRenderer(20, 10);
    }

    /**
     * Sets up the scene. 
     * This is better as a separate method than in the constructor.
     */
    public void createScene() {
        var container = makeContainer();
        container.add(makeSquare(3,1,2));
        container.add(makeSquare(5,3,4));
        
        shapes.add(container);
    }

    public void clearScene() {
        shapes.clear();
    }
    /**
     * A delegate method.
     * It calls the makeSquare of the specified factory. 
     * 
     * @param size size of the square
     * @return A Drawable representing a square
     */
    public Square makeSquare(int size) {
        return shapeFac.makeSquare(size);
    }

    public Square makeSquare(int size, int x, int y) {
        return shapeFac.makeSquare(size,x,y);
    }

   public Container makeContainer() {
        return shapeFac.makeContainer();
    }


    /**
      * Display all objects
      */
    public void display() {
        renderer.clear(); // clear the renderer
        for(Drawable shape: shapes) { // loop through all objects in the list
            shape.draw(renderer); // for each draw the object
        }
        renderer.render(); // render the contents
    }

    /**
     * Changes the shape factory
     */
    public void setShapeFactory(ShapeFactory fac) {
        shapeFac = fac;
    }


    public static void main(String[] args) {
        System.out.println("Using the simple rendered");
        RendererMain myapp = new RendererMain(); // build the app
        myapp.createScene();
        myapp.display(); 
    }
}
