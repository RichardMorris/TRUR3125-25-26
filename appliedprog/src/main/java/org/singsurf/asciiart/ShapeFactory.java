package org.singsurf.asciiart;

public interface ShapeFactory {
    /**
     * Defines the method for creating squares.
     * 
     * @param size size of the square
     * @return A Drawable representing a square
     */
    public Square makeSquare(int size);

}