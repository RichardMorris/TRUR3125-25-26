package org.singsurf.asciiart;

public interface Drawable {
    /**
     * Draw the object using the provided renderer.
     */
    void draw(Renderer r); 

    /**
     * Maintained for backwards compatibility. Technical debt!
     */
    void draw();
}