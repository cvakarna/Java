package com.siva.MethodOperations;

import java.util.Scanner;

/**
 * program to calculate sin(x) and cos(x) series
 * 
 * 
 */
public class TrignometricSeries {
	// method for sine series
	public static double sin(double x, int numTerms) { // set series value
														// initial
		double series = x;
		double radians = x;
		int i = 3;
		for (int j = 2; j <= numTerms; j++) {
			radians = (radians * (-1) * x * x) / factorial(i);
			series = series + radians;
			i = i + 2;

		} // end loop

		return series;
	}

	// method to compute factorial
	public static long factorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void read() {// scanner obj
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the x value:");
		double x = sc.nextInt();
		System.out.println("enter the no of terms");
		int noOfTerms = sc.nextInt();
		// convert x into radians
		x = (Math.PI * x) / 180;
		double sum = sin(x, noOfTerms);
		// print the result
		System.out.println("sine series sum is:" + sum);
		System.out.println(Math.sin(x));
	}

	public static void main(String[] args) {
		read();
	}
}
