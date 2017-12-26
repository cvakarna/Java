package com.siva.Conditional;
/**
 * 
 * program to calculate the sum and avg of given numbers
 * 
 * */

import org.apache.log4j.Logger;

public class SumAndAverage {// save as SumAndAverage.java
	static Logger logger = Logger.getLogger(SumAndAverage.class);

	// method for logic to calculate the sum and avg
	public void calculater() {
		// initialize the value sum =0;
		int sum = 0;
		// nitialize the value avg
		double average = 0.0;
		// set the lowerbound
		int lowerBound = 1;
		// set upper bound
		int upperBound = 100;
		// loop for calculation
		for (int i = lowerBound; i <= upperBound; lowerBound++) {
			/*
			 * //sum the values upto 100 sum = sum+lowerBound;
			 */
			if (i % 2 != 0)// sum for odd num
			{
				sum = sum + i;
			}
		}
		// to find avg
		average = sum / upperBound;
		// print sum
		logger.info("the sum is:" + sum);
		// print avg
		logger.info("avg of the given numbers are :" + average);

	}

	public static void main(String[] args) {// program starts from here
		SumAndAverage s = new SumAndAverage();
		// call the method calculator to get sum and avg
		s.calculater();
		logger.info("test");

	}

}
