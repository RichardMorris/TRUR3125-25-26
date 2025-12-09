package org.singsurf.asciiart;

import java.awt.Color;

public class ColouredPixel implements Pixel {
	Character ch;
	Color c;
	
	public ColouredPixel(Character ch, Color c) {
		super();
		this.ch = ch;
		this.c = c;
	}

	@Override
	public Character getCharacter() {
		return ch;
	}
	
	public Color getColour() {
		return c;
	}

}
