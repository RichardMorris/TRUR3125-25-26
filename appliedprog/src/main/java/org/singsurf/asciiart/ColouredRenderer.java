package org.singsurf.asciiart;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColouredRenderer extends AbstractRenderer implements GlyphRenderer {

    final Glyph[][] canvas;
    final int width;
    final int height;
    
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_BLACK = "\u001B[30m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_WHITE = "\u001B[37m";

    Map<Color,String> lookup = 
    		new HashMap<>();
    {
    	lookup.put(Color.BLACK, ANSI_BLACK);
    	lookup.put(Color.RED, ANSI_RED);
    	lookup.put(Color.GREEN, ANSI_GREEN);
    	lookup.put(Color.YELLOW, ANSI_YELLOW);
    	lookup.put(Color.BLUE, ANSI_BLUE);
    	lookup.put(Color.MAGENTA, ANSI_PURPLE);
    	lookup.put(Color.CYAN, ANSI_CYAN);
    	lookup.put(Color.WHITE, ANSI_WHITE);    	
    }
    
    public ColouredRenderer(int w, int h) {
        this.width = w;
        this.height = h;
        canvas = new ColouredGlyph[height][width];
    }

	@Override
	public void plot(int x, int y, Glyph c) {
        if(x >= 0 && x < width && y >= 0 && y < height) {
            canvas[y][x] = c;
        }
	}

	@Override
	public void plot(int x, int y, char c) {
        if(x >= 0 && x < width && y >= 0 && y < height) {
            canvas[y][x] = new ColouredGlyph(c,Color.BLACK);
        }		
	}

	@Override
	protected void clear() {
        for(int row=0; row<height; ++row) {
            for(int col=0; col<width; ++col) {
                canvas[row][col] = null;
            }
        }		
	}

	@Override
	protected void render() {
        for(int row=0; row<height; ++row) {
            for(int col=0; col<width; ++col) {
            	Glyph pix = canvas[row][col];
            	if(pix instanceof ColouredGlyph cp) {
            		Color c = cp.getColour();
					String ansi = lookup.get(c);
					
            		if(ansi != null) {
						System.out.print(ansi + cp.getCharacter() + ANSI_RESET);
					} else {
						System.out.print(cp.getCharacter());
					}
				} else if (pix != null) {
					System.out.print(pix.getCharacter());
				} else {
					System.out.print(' ');
				}
            }
            System.out.println();
        }		
	}

}
