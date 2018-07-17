/**
 * File:ICM.java
 * ------------------
 * This program calculate the index of corporal mass.
 * 
 * @author JT Cerqueira, Date 07/17/18. 07h36min GMT-4.
 */

import java.util.Scanner;

public class CIMC {
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("This program calculates the ICM. Press "
							+ SENTINEL + " to end calculation.");
		double total = 0.0;
		double weight = 0.0;
		double height;
		
		while(weight != SENTINEL){
			
			System.out.println("Enter value in KG: ");
			weight = input.nextDouble();
			
			System.out.println("Enter the value of the height in meters: ");
			height = input.nextDouble();
			
			// Calculation of the ICM
			total= weight/(height*height);
						
			if(total <= UNDERWEIGHT) {
				
				System.out.println("You are underweight, with a CMI of "+ total +" below "
									+ UNDERWEIGHT + ". See a doctor.");
			
			} else if(total >= NORMAL_LOW && total <= NORMAL_HIGH) {
			
				System.out.println("You are healthy. Congratulations. Your CMI is: " + total +
								    " and the avarage is " + NORMAL_LOW + " and " + NORMAL_HIGH);
			
			} else if (total >= OVERWEIGHT_LOW && total <= OVERWEIGHT_HIGH) {
				
				System.out.println("You are overweight. You CMI is " + total + ". Avarage range among "
									+ NORMAL_LOW + " and " + NORMAL_HIGH);
			
			} else if (total >= OBESE) {
			
				System.out.println("Your CMI is" + OBESE + ". Maybe it's time to see a doctor and start"
									+ " eating healthy.");
			}
		}
				
	}
	
		/**
		 * Variables. 
		 */
		//BMI values.
		private static final double UNDERWEIGHT = 18.5;
		private static final double NORMAL_LOW = 18.5;
		private static final double NORMAL_HIGH = 24.9;
		private static final double OVERWEIGHT_LOW = 25.0;
		private static final double OVERWEIGHT_HIGH = 29.9;
		private static final double OBESE = 30;
		
		// Used to Stop calculation.
		private static final int SENTINEL = -1;
		
		// Scanner to input value.
		private static Scanner input;
}
