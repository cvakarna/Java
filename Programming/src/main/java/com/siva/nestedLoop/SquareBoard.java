package com.siva.nestedLoop;

/*
 * program to print square board 5x5 like bellow
 *           # # # # # 
             # # # # # 
             # # # # # 
             # # # # # 
             # # # # # 

 * 
 */
public class SquareBoard {// save as SquareBoard.java
	// method to obtain pattern
	private static void printSquare() {
		// set the square or size of the board
		int size = 5;
		// nested loop to obtain pattern
		for (int row = 0; row < 5; row++) {
			for (int column = 0; column < 5; column++) {
				System.out.print("#" + " ");
			} // end inner loop
			System.out.println();
		} // end outer loop

	}

	public static void main(String[] args) {// program starts from here
		// call the printSquare() to get pattern
		printSquare();

	}

}
