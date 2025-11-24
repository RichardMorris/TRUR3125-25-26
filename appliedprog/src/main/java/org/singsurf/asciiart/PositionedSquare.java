package org.singsurf.asciiart;

/**
 * A Square at a given position. Uses % character.
 */
public class PositionedSquare extends Square {
    int x,y;

    public PositionedSquare(int n,int x,int y) {
        super(n);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        for(int i=0;i<y;++i) {
            System.out.println();
        }
        for(int row=0; row<size; ++row) {
            for(int i=0;i<x;++i) {
                System.out.print(" ");
            }
            for(int col=0; col<size; ++col) {
                System.out.print('%');
            }
            System.out.println();
        }
    }


    @Override
    public void draw(Renderer r) {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                r.plot(x+col, y+row, '%');
            }
        }
    }
}