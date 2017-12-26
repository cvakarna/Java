package com.siva.KeyBoardAndFileInput;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * 
 * program called KeyboardScanner to prompt user for an int, a double, and a
 * String
 */
public class KeyBoardScanner {// save as KeyBoardScanner.java
	static Logger logger = Logger.getLogger(KeyBoardScanner.class);

	// method to do all actions from end user
	public static void keyBoardRead() { // create scanner object to read data
										// from keyboard
		Scanner sc = new Scanner(System.in);
		// declare the variables
		int intNum;
		float floatNum;
		String name;
		double sum;
		logger.info("enter the integer.........:");
		intNum = sc.nextInt();
		logger.info("enter floating value.......:");
		floatNum = sc.nextFloat();
		logger.info("enter your name.........:");
		name = sc.next();
		// calculte sum
		sum = intNum + floatNum;
		// print result
		logger.info("hey " + name + " !!!   the result for your given data is:" + sum);
		// close the input stream
		sc.close();

	}

	public static void main(String[] args) {
		// call method
		keyBoardRead();
	}
}
