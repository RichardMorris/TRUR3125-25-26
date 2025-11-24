
package org.singsurf.asciiart;

/**
 * A better version of the shape factory creating BetterSquares 
 */
public class BetterShapeFactory implements ShapeFactory {

    @Override
    public Square makeSquare(int size) {
        return new BetterSquare(size);
    }


    @Override
    public Container makeContainer() {
        return new Container();
    }

    @Override
    public Square makeSquare(int size, int x, int y) {
        return new PositionedSquare(size,x,y);
    }
}
