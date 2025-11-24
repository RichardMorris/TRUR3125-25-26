package org.singsurf.asciiart;

public interface ShapeFactory {
    /**
     * Defines the method for creating squares.
     * 
     * @param size size of the square
     * @return A Drawable representing a square
     */
    public Square makeSquare(int size);

    /**
     * Create a square, at a particualar point
     * 
     * @param size size of the square
     * @param x X position of the square
     * @param y Y position of the square
     * @return A Drawable representing a square
     */
    public Square makeSquare(int size, int x, int y);

    public Container makeContainer();

}