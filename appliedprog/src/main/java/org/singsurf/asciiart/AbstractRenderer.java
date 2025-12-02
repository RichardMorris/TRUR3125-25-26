package org.singsurf.asciiart;

/**
 * An abstract base class with with a Template Method with an outline of the
 * display method. 
 * Sub classes must implement the clear() and render() part of the algorithm.
 */
public abstract class AbstractRenderer implements Renderer {

    /**
     * Clears the rendering surface.
     * Protected means only subclasses can call this method.
     * It is abstract so subclasses must implement it.
     */
    protected abstract void clear();

    /**
     * Displays the rendering surface.
     * Protected means only subclasses can call this method.
     * It is abstract so subclasses must implement it.
     */
    protected abstract void render();

    /**
     * Outline of the main steps of the display algorithm.
     */
    @Override
    public void display(Drawable scene) {
        clear();
        scene.draw(this);
        render();
    }
}