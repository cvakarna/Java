package com.siva.nestedLoop;

/**
 * program to print rightangle triangular pattern
 * 
 *            #    
 			  ##   
			  ###  
              #### 
              #####

 * 
 * 
 */
public class TriangularPattern {// save as TriangularPattern.java
	// method for get pattern
	public static void getTriangular() {
		// set the size
		int size = 10;
		// loops for get that pattern
		for (int row = 0; row < size; row++) {
			for (int column = 0; column < size; column++) {
				if (column <= row)
					System.out.print("#");
				else
					System.out.print(" ");
			} // end inner loop
			System.out.println();
		} // end outer
	}// end method

	public static void main(String[] args) {// programs starts from here
		// call method to get pattern
		getTriangular();

	}
}
