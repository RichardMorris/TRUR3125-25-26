package org.singsurf.asciiart;

import java.util.ArrayList;
import java.util.List;

public class Container implements Drawable {
    List<Drawable> children;

    /** Sets up class so its in a usable state. */
    public Container() {
        children = new ArrayList<>();
    }
    @Override
    public void draw() {
        for(var child: children) {
            child.draw();
        }
    }
    
    // delegate method for adding a child

    public void add(Drawable child) {
        children.add(child);
    }

    @Override
    public void draw(Renderer r) {
        for(var child: children) {
            child.draw(r);
        }
    }
}