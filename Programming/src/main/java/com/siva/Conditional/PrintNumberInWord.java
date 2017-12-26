package com.siva.Conditional;
/**
 * program for print num in word
 * */

import org.apache.log4j.Logger;

public class PrintNumberInWord {// save as PrintNumberInWord.java
	static Logger logger = Logger.getLogger(PrintNumberInWord.class);

	// method declaration
	static void numberInWord() {
		// set the value of num here
		int number = 5;
		// check condition for printing given number in word
		if (number == 1) {
			logger.info("ONE");
		} else if (number == 2) {
			logger.info("TWO");
		} else if (number == 3) {
			logger.info("THREE");

		} else if (number == 4) {
			logger.info("FOUR");
		} else {
			logger.info("FIVE");
		}
		// USING SWITCH CASE
		switch (number) {
		case 1:
			logger.info("ONE");
			break;
		case 2:
			logger.info("TWO");
			break;
		case 3:
			logger.info("THREE");
			break;
		case 4:
			logger.info("FOUR");
			break;
		case 5:
			logger.info("FIVE");
		default:
			logger.info("the given num is :" + number);

		}
	}

	public static void main(String[] args) {
		// program starts from here
		numberInWord();
	}
}
