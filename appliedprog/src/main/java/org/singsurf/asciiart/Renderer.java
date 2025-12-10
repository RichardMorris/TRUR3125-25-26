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
     * Plot a character at the given position using a Glyph.
     * This is a default method that extracts the character from the Glyph
     * 
     * @param x x coordinate
     * @param y y coordinate
     * @param c character or glyph to plot
     */
    public default void plot(int x,int y, Glyph c) {
    	plot(x, y, c.getCharacter());
    }

    /**
     * Display a scene
     */
    public void display(Drawable scene);
}