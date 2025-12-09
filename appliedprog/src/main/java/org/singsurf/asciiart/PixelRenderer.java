package org.singsurf.asciiart;

public interface PixelRenderer extends Renderer {

    /**
     * Plot a character at the given position
     * 
     * @param x x coordinate
     * @param y y coordinate
     * @param c character to plot
     */
    public void plot(int x,int y, Pixel c);

}
