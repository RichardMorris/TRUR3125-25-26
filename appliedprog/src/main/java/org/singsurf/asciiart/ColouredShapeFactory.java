package org.singsurf.asciiart;

import java.awt.Color;

public class ColouredShapeFactory implements ShapeFactory {

	@Override
	public Square makeSquare(int size) {
		return new ColouredSquare(size, 0, 0, java.awt.Color.BLACK);
	}

	@Override
	public Square makeSquare(int size, int x, int y) {
		return new ColouredSquare(size, x, y, java.awt.Color.BLACK);
	}

	public Square makeSquare(int size, int x, int y, Color c) {
		return new ColouredSquare(size, x, y, c);
	}

	@Override
	public Container makeContainer() {
		return new Container();
	}

}
