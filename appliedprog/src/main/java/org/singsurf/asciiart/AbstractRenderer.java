package org.singsurf.asciiart;

/**
 * An abstract base class with with a Template Method with an outline of the
 * display method. 
 * Sub classes must implement the clear() and render() part of the algorithm.
 */
public abstract class AbstractRenderer implements Renderer {

    public abstract void clear();

    public abstract void render();

    @Override
    public void display(Drawable scene) {
        clear();
        scene.draw(this);
        render();
    }
}