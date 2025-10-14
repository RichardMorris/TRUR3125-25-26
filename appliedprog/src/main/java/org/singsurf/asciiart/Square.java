package org.singsurf.asciiart;

public class Square implements Drawable {
    int size;

    public Square(int siz) {
        this.size = siz; 
    }

    public void draw() {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}