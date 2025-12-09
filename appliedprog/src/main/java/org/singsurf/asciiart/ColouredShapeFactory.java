package org.singsurf.asciiart;

import java.awt.Color;

public class ColouredShapeFactory implements ShapeFactory {

	@Override
	public Square makeSquare(int size) {
		return new ColouredSquare(size, 0, 0, '*', java.awt.Color.BLACK);
	}

	@Override
	public Square makeSquare(int size, int x, int y) {
		return new ColouredSquare(size, x, y, '*', java.awt.Color.BLACK);
	}

	/**
	 * Create a square with specified size, position, character and colour.
	 * @param size Size of the square
	 * @param x X position
	 * @param y Y position
	 * @param ch Character to use for the square
	 * @param c Colour of the square
	 * @return The created coloured square
	 */
	public Square makeSquare(int size, int x, int y, Character ch, Color c) {
		return new ColouredSquare(size, x, y, ch, c);
	}

	@Override
	public Container makeContainer() {
		return new Container();
	}

}
