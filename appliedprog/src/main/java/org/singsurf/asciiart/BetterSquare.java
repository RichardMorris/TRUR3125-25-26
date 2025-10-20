package org.singsurf.asciiart;

/**
 * A Better version of a square, uses # rather than *
 */
public class BetterSquare implements Drawable {
    int size;

    public BetterSquare(int siz) {
        this.size = siz; 
    }

    @Override
    public void draw() {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}