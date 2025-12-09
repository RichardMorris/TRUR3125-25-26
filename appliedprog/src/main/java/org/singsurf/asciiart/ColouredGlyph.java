package org.singsurf.asciiart;

import java.awt.Color;

/**
 * A coloured glyph with a character representation.
 */
public class ColouredGlyph implements Glyph {
	Character ch;
	Color c;
	
	public ColouredGlyph(Character ch, Color c) {
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
