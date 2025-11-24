package org.singsurf.asciiart;

/**
 * A Better version of a square, uses # rather than *
 */
public class BetterSquare extends Square {

    public BetterSquare(int n) {
        super(n);
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

    @Override
    public void draw(Renderer r) {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                r.plot(col, row, '#');
            }
        }
    }
}