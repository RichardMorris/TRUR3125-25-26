package org.singsurf.asciiart;

import java.awt.Color;

/**
 * A coloured square, positioned at (x,y) with size and a coloured pixel.
 */

public class ColouredSquare extends PositionedSquare {
	/** The coloured pixel used to draw the square.
	 * All pixels in the square have the same colour and character.
	 */
	ColouredGlyph pix;


	public ColouredSquare(int n, int x, int y, Character symbol, Color c) {
		super(n, x, y);
		pix = new ColouredGlyph(symbol,c);
	}

	@Override
	public void draw(Renderer r) {
        for(int row=0; row<size; ++row) {
            for(int col=0; col<size; ++col) {
                r.plot(x+col, y+row, pix);
            }
        }
	}

	
}
