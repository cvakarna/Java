package com.siva.nestedLoop;

/**
a program called TimeTable to produce the 
multiplication table of 1 to 9  using two nested for-loops:

*
*
*/

public class TimeTable {// save as TimeTable.java
	// method get timetable
	public static void getTimeTable() {
		// set the table size
		int size = 9;
		// loop for get table
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {

				System.out.print(row * column + "  ");
			} // end inner loop
			System.out.println();// to print next line
		} // end outer loop
	}// end method

	public static void main(String[] args) {// program starts from here
		// call getTimeTable() to get timetable
		getTimeTable();

	}
}
