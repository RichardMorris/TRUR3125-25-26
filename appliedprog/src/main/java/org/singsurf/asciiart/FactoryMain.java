package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {
    List<Drawable> shapes; // An expandable list of objects
    ShapeFactory shapeFac;

    /**
     * Constructor, uses the standard shape factory.
     */
    public FactoryMain() { 
        shapeFac = new StandardShapeFactory();
        shapes = new ArrayList<>();
    }

    /**
     * Sets up the scene. 
     * This is better as a separate method than in the constructor.
     */
    public void createScene() {
        shapes.add(makeSquare(3));  
        shapes.add(makeSquare(5));
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
        FactoryMain myapp = new FactoryMain(); // build the app
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
