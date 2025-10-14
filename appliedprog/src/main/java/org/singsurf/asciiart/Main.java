package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    List<Drawable> shapes; // An expandable list of objects

    public Main() { // A constructor
        shapes = new ArrayList<>();
        shapes.add(new Square(3));
        shapes.add(new Square(5));
    }

    /**
      * Display all objects
      */
    public void display() { 
        for(Drawable shape: shapes) { // loop through all objects in the list
            shape.draw(); // for each draw the object
        }
    }

    public static void main(String[] args) {
        Main myapp = new Main(); // build the app
        myapp.display(); // call the method
    }
}
