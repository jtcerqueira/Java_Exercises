/*
 * This exercise is meant to center a square.
 * Or get a notion how algorithms work to center objects
 * no the canvas.
 */

import acm.program.*;
import acm.graphics.*;

public class CenteringSquare extends GraphicsProgram{
	
	public void run () {
		
		int x = getWidth()/2 - BASE/2;
		int y = getHeight()/2 - HEIGHT/2;
		
		GRect square = new GRect (x, y, BASE, HEIGHT);
		add (square);
		
	}
	
	private static final int BASE = 100;
	private static final int HEIGHT = 100;
}

/* Other algorithms I came across
 * 1.
 * float x = getWidth()/2 - VARIABLE_WIDTH/2;
 * float y = getHeight()/2 - VARIABLE_HEIGHT/2;
 * OBJECT circle = new OBJECT.Float(x, y, VARIABLE_WIDTH, VARIABLE_HEIGHT);
 * 
 * 2. For centereing an object accorgind with a width and height variable.
 * float x = (width-width of OBJECT) /2; 
 * float y = (height-height of OBJECT) /2; 
 * 
 * 3.
 * int x=(getWidth()-objectlWidth)/2;
 * int y=(getHeight()-objectHeight)/2;
 * 
 * 4.
 *  Dimension size = getSize();
 *  Ellipse2D circle = new Ellipse2D.Float(
 *   (size.width - 200) / 2,       // -200 due to the width/height of the circle
 *   (size.height - 200) / 2, 
 *   200, 200);
 *   
 *   source: https://stackoverflow.com/questions/8724429/centre-an-image-in-the-middle-of-a-panel
 */
