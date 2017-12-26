package com.siva.AssertionsExamples;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class AssertionExample {
	static Logger logger = Logger.getLogger(AssertionExample.class);

	private void example() {
		Scanner sc = new Scanner(System.in);
		logger.info("enter your age");
		int value = sc.nextInt();
		assert value >= 18 : "not valid";
		logger.info("value is:" + value);

	}

	private void switchcase() {
		int x = 6;
		switch (x) {
		case 1:
			int y = 3;
			break;
		case 2:
			y = 4;
			break;
		default:
			assert false;
			// logger.info("default");
		}
	}

	public static void main(String[] args) {
		AssertionExample ae = new AssertionExample();
		ae.example();
		ae.switchcase();
	}

}
