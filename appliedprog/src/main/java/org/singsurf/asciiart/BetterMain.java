package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class BetterMain {
    List<Drawable> shapes; // An expandable list of objects

    public BetterMain() { // A constructor
        shapes = new ArrayList<>();
        shapes.add(makeSquare(3));  // Using the factory method
        shapes.add(makeSquare(5));
    }

    /**
     * A Factory Method.
     * If we wanted to change the type of square used we can simply
     * change this method.
     * 
     * @param size size of the square
     * @return A Drawable representing a square
     */
    public Square makeSquare(int size) {
        return new BetterSquare(size);
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
        BetterMain myapp = new BetterMain(); // build the app
        myapp.display(); // call the method
    }
}
