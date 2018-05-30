/*
 * File:ArcSweep.java
 * -------------------------------------
 * This file is made to understand how the sweep 
 *in Arcs behave in Java. Using acm library.
 * By JT Cerqueira
 */

//imports
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.color.*;

public class CreatingArch extends GraphicsProgram{
	public void run (){
	
	println("This file creates 4 archs just for practice");
		
		//this part of the program fill the left part of the arc.
		for(int i = 0; i <= 180; i++){
			GArc toleft = new GArc (200, 200, 0, i);
			toleft.setColor(Color.MAGENTA);
			toleft.setFillColor(Color.MAGENTA);
			toleft.setFilled(true);
			toleft.sendToBack();
			add(toleft);
			pause(13);
		
		}
		
		//this part of the program fill the right part of the arc.
		for(int j = -1; j >= -180; j--) {
			GArc toright = new GArc (200, 200, -360, j);
			toright.setColor(Color.BLUE);
			toright.setFillColor(Color.BLUE);
			toright.setFilled(true);
			toright.sendToFront();
			add(toright);
			pause(13);
		}
