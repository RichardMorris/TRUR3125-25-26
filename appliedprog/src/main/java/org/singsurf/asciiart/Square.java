package org.singsurf.asciiart;

public class Square implements Drawable {
    int size;

    public Square(int siz) {
        this.size = siz; 
    }

    @Override
    public void draw(Renderer r) {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                r.plot(col, col, '*');
            }
        }
    }

    @Override
    public void draw() {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}