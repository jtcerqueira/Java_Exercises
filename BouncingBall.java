/*
* File: BouncingBall.java
* ------------------------------
* This program simulates a ball bouncing on the screen.
*/
import acm.program.*;
import acm.graphics.*;

public class BouncingBall extends GraphicsProgram {
	
	public void run() {
		dx = 2;
		dy = 1;
		
		ball = new GOval ((getWidth()/2 - SIZE_BALL/2), (getHeight()/2 - SIZE_BALL/2),
				SIZE_BALL, SIZE_BALL);
		ball.setFilled(true);
		add(ball);
		
		while (true) {
      // This set of the code is provided by the acm Java Task Force site.
      // More details on the description.
			double bx = ball.getX();
			double by = ball.getY();
			if(bx < SIZE_BALL || bx > getWidth() - SIZE_BALL) dx = -dx;
			if(by < SIZE_BALL || by > getHeight() - SIZE_BALL) dy = -dy;
			ball.move(dx, dy);
			pause(PAUSE_TIME);
		}
	}
	
	// Private Constants.
	private static final int SIZE_BALL = 30;
	private static final int PAUSE_TIME = 3;
	
	// Instance variable.
	private GOval ball;
	private double dx;
	private double dy;
}
