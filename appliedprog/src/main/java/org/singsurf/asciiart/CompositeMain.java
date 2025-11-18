package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    List<Drawable> shapes; // An expandable list of objects
    ShapeFactory shapeFac;

    /**
     * Constructor, uses the standard shape factory.
     */
    public CompositeMain() { 
        shapeFac = new StandardShapeFactory();
        shapes = new ArrayList<>();
    }

    /**
     * Sets up the scene. 
     * This is better as a separate method than in the constructor.
     */
    public void createScene() {
        var container = makeContainer();
        container.add(makeSquare(3));
        container.add(makeSquare(5));
        
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

   public Container makeContainer() {
        return shapeFac.makeContainer();
    }


    /**
      * Display all objects
      */
    public void display() { 
        for(Drawable shape: shapes) { // loop through all objects in the list
            shape.draw(); // for each draw the object
        }
    }

    /**
     * Changes the shape factory
     */
    public void setShapeFactory(ShapeFactory fac) {
        shapeFac = fac;
    }


    public static void main(String[] args) {
        System.out.println("Using the standard constructor");
        CompositeMain myapp = new CompositeMain(); // build the app
        myapp.createScene();
        myapp.display(); 
        myapp.clearScene();

        System.out.println("Using the BetterShapeFactory");
        myapp.setShapeFactory(new BetterShapeFactory());
        myapp.createScene();
        myapp.display();
        myapp.clearScene();
    }
}
