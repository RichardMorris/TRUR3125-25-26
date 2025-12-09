package org.singsurf.asciiart;

public class ColouredMain {
    Drawable scene; // An expandable list of objects
    ColouredShapeFactory shapeFac;
    Renderer renderer;
    /**
     * Constructor, uses the standard shape factory
     * and a simple renderer.
     */
    public ColouredMain() { 
        shapeFac = new ColouredShapeFactory();
        scene = new Container();
        renderer = new ColouredRenderer(20, 10);
    }

    /**
     * Sets up the scene. 
     * This is better as a separate method than in the constructor.
     */
    public void createScene() {
        var container = shapeFac.makeContainer();
        container.add(shapeFac.makeSquare(3,1,2, java.awt.Color.RED));
        container.add(shapeFac.makeSquare(5,3,4, java.awt.Color.BLUE));
        
        scene = container;
    }

    /**
      * Display all objects
      */
    public void display() {
        renderer.display(scene);
    }

    /**
     * Changes the shape factory
     */
    public void setShapeFactory(ShapeFactory fac) {
        shapeFac = (ColouredShapeFactory) fac;
    }


    public static void main(String[] args) {
        System.out.println("Using the simple rendered");
        ColouredMain myapp = new ColouredMain(); // build the app
        myapp.createScene();
        myapp.display(); 
    }
}
