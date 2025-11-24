
package org.singsurf.asciiart;

/**
 * A standard version of the shape factory creating normal Squares.
 */
public class StandardShapeFactory implements ShapeFactory {

    @Override
    public Square makeSquare(int size) {
        return new Square(size);
    }

    @Override
    public PositionedSquare makeSquare(int size,int x,int y) {
        return new PositionedSquare(size,x,y);
    }
    @Override
    public Container makeContainer() {
        return new Container();
    }

}
