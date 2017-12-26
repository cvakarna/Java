package com.siva.nestedLoop;

/**
 * Print checkerboard pattern 7x7 using nested-loop
 *                       #  #  #  #  #  #  #  
 						  #  #  #  #  #  #  #  
						 #  #  #  #  #  #  #  
 						  #  #  #  #  #  #  #  
					     #  #  #  #  #  #  #  
 						  #  #  #  #  #  #  #  
						 #  #  #  #  #  #  #  

 * 
 */

public class CheckBoardPattern {// save as CheckBoardPattern.java
	// method to obtain checkboard pattern
	private static void patternOfCheck() {
		// set size
		int size = 7;
		// loop for getting checkboard pattern
		for (int row = 1; row <= 7; row++) {
			if (row % 2 == 0) {
				System.out.print(" ");

			}
			for (int column = 1; column <= 7; column++) {
				System.out.print("#  ");

			} // end inner loop

			System.out.println();
		}
	}// end method

	public static void main(String[] args) {// program starts from here
		// call the patternOfCheck() to get pattern
		patternOfCheck();

	}
}
