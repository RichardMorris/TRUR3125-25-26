package org.singsurf.asciiart;

public class OriginalIsBetterMain extends BetterMain {

    public OriginalIsBetterMain() { // A constructor
        super();
    }

    /**
     * A Factory Method.
     * If we wanted to change the type of square used we can simply
     * change this method.
     * 
     * @param size size of the square
     * @return A Drawable representing a square
     */
    public Drawable makeSquare(int size) {
        return new Square(size);
    }

    public static void main(String[] args) {
        OriginalIsBetterMain myapp = new OriginalIsBetterMain(); // build the app
        myapp.display(); // call the method
    }
}
