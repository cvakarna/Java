package com.siva.DebuggingProgramm;

/**
 * 
 * factorial of a given number
 */

public class Factorial {// save as Factorial.java
	public static void doFact() {
		int n = 20;
		int factorial = 1;

		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}

	public static void main(String[] args) {// program starts from here
		// call method to get factorial
		doFact();

	}
}
