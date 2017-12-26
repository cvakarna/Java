package com.siva.Conditional;
/**
 * PROGRAM FOR PRINTING A DAY IN WORD
 * */

import org.apache.log4j.Logger;

public class PrintDayInWord {// SAVE AS PrintDayInWord .java
	static Logger logger = Logger.getLogger(PrintDayInWord.class);

	// method for logic
	static void dayInWord() {
		// set number here
		int number = 1;
		// print the number
		logger.info("the num is :" + number);
		// using switch case
		switch (number) {
		case 0:
			logger.info("SUNDAY");
			break;
		case 1:
			logger.info("MONDAY");
			break;
		case 2:
			logger.info("THUESDAY");
			break;
		case 3:
			logger.info("WEDNESDAY");
			break;
		case 4:
			logger.info("THERSDAY");
			break;
		case 5:
			logger.info("FRIDAY");
			break;
		case 6:
			logger.info("SATURDAY");
			break;
		default:
			logger.info("GOOD DAY");

		}// END SWITCH CASE

	}// END THE METHOD

	public static void main(String[] args) {// program starts from here
		// call the method
		dayInWord();

	}// end main
}// end class
