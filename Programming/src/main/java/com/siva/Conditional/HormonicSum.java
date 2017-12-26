package com.siva.Conditional;
/**
 * program to calculate hormonic sum
 * 
 */

import org.apache.log4j.Logger;

public class HormonicSum {// save as HormonicSum.java
	static Logger logger = Logger.getLogger(HormonicSum.class);

	// method to calculate the hormonicsum
	static private void sumcalculator() {
		// set the val
		int maxDenominator = 5;
		double sumL2R = 0.0;
		double sumR2L = 0.0;
		// for loop for summing left 2 right
		for (int denaminator = 1; denaminator <= maxDenominator; denaminator++) {

			sumL2R = sumL2R + (double) 1 / denaminator;

		}
		// to print hormonic sum from left to right
		logger.info("hormonic sum from left2right is:" + sumL2R);
		// for loop for summing right to left
		for (int denaminator = maxDenominator; denaminator > 0; denaminator--) {

			sumR2L = sumR2L + (double) 1 / denaminator;
		}
		// to print hormonic sum from right to left

		logger.info("hormonic sum right to left series" + sumR2L);

	}// end method

	public static void main(String[] args) {// program starts from here
		// call sumcalculator to get sum of hormonic series
		sumcalculator();
	}

}
