package org.singsurf.asciiart;

/**
 * A rendered for ASCII art shapes.
 */
public interface Renderer {
    /**
     * Plot a character at the given position
     * 
     * @param x x coordinate
     * @param y y coordinate
     * @param c character to plot
     */
    public void plot(int x,int y, char c);

    /**
     * Display a scene
     */
    public void display(Drawable scene);
}