package org.singsurf.asciiart;

/** 
 * A pixel with a character representation.
 * Implementing classes may add colour or other information.
 */
public interface Pixel {
	/**
	 * Get the character representation of this pixel.
	 */
	Character getCharacter();
}
