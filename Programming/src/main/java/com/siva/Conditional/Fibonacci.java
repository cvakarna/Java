package com.siva.Conditional;

import org.apache.log4j.Logger;

/**
 * Print first 20 Fibonacci numbers and their average
 */
public class Fibonacci {// save as Fibonacci.java
	static Logger logger = Logger.getLogger(Fibonacci.class);

	public static void toComputeFibonacci() {
		// the index n for F(n), starting from n=3
		int n = 3;
		// F(n) to be computed
		int fn;
		// F(n-1), init to F(2)
		int fnMinus1 = 1;
		// F(n-2), init to F(1)
		int fnMinus2 = 1;
		// maximum n, inclusive
		int nMax = 5;
		// Need sum to compute average
		int sum = fnMinus1 + fnMinus2;
		double average;
		// loop for calculating the sum
		while (n <= nMax) {
			fnMinus2 = fnMinus1;
			fnMinus1 = sum;
			sum = fnMinus1 + fnMinus2;
			n++;

		} // end
			// print sum
		logger.info("sum is :" + sum);
		// cal avg
		average = (double) sum / nMax;
		// print avg

		logger.info("average:" + average);

	}

	public static void main(String[] args) {// program starts from here
		// call the method
		toComputeFibonacci();
	}

}
