package org.singsurf.asciiart;

import java.awt.Color;

public class ColouredSquare extends PositionedSquare {
	ColouredPixel pix;


	public ColouredSquare(int n, int x, int y, Color c) {
		super(n, x, y);
		pix = new ColouredPixel('^',c);
	}

	@Override
	public void draw(Renderer r) {
		if(r instanceof PixelRenderer p) {
	        for(int row=0; row<size; ++row) {
	            for(int col=0; col<size; ++col) {
	                p.plot(x+col, y+row, pix);
	            }
	        }
		}
		else
			super.draw(r);
	}

	
}
