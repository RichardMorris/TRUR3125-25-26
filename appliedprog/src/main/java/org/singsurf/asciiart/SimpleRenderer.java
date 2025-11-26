package org.singsurf.asciiart;

/**
 * A simple implementation of the Renderer interface
 * that uses a 2D character array as a canvas.
 */
public class SimpleRenderer extends AbstractRenderer {
    final char[][] canvas;
    final int width;
    final int height;

    public SimpleRenderer(int w, int h) {
        this.width = w;
        this.height = h;
        canvas = new char[height][width];
    }

    @Override
    public void clear() {
        for(int row=0; row<height; ++row) {
            for(int col=0; col<width; ++col) {
                canvas[row][col] = ' ';
            }
        }
    }

    @Override
    public void plot(int x, int y, char c) {
        if(x >= 0 && x < width && y >= 0 && y < height) {
            canvas[y][x] = c;
        }
    }

    @Override
    public void render() {
        for(int row=0; row<height; ++row) {
            for(int col=0; col<width; ++col) {
                System.out.print(canvas[row][col]);
            }
            System.out.println();
        }
    }

}