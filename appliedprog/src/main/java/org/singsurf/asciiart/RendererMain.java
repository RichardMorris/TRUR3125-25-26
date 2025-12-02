package org.singsurf.asciiart;

public class RendererMain {
    Drawable scene; // An expandable list of objects
    ShapeFactory shapeFac;
    Renderer renderer;
    /**
     * Constructor, uses the standard shape factory
     * and a simple renderer.
     */
    public RendererMain() { 
        shapeFac = new StandardShapeFactory();
        scene = new Container();
        renderer = new SimpleRenderer(20, 10);
    }

    /**
     * Sets up the scene. 
     * This is better as a separate method than in the constructor.
     */
    public void createScene() {
        var container = shapeFac.makeContainer();
        container.add(shapeFac.makeSquare(3,1,2));
        container.add(shapeFac.makeSquare(5,3,4));
        
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
        shapeFac = fac;
    }


    public static void main(String[] args) {
        System.out.println("Using the simple rendered");
        RendererMain myapp = new RendererMain(); // build the app
        myapp.createScene();
        myapp.display(); 
    }
}
