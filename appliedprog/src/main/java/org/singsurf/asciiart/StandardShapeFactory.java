
package org.singsurf.asciiart;

/**
 * A standard version of the shape factory creating normal Squares.
 */
public class StandardShapeFactory implements ShapeFactory {

    @Override
    public Square makeSquare(int size) {
        return new Square(size);
    }

}
