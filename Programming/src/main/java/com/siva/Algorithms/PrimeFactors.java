package com.siva.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
	
	public static void toFindPerfect() {
		// scanner obj
		Scanner sc = new Scanner(System.in);
		// input
		System.out.println("enter the upper bound value");
		// taking input
		int upperBound = sc.nextInt();
		// initialize number& sum value
		long number = 1;

		long product = 1;
		// loop for take every number upto specified level
		boolean prime = false;
		int count = 0;

		while (number <= upperBound) {
			// loop for find factors
			for (int i = 1; i < number; i++) {

				if (number % i == 0) {
					prime = isPrime(i);
					product = product * i;

				}
			} // end for loop
			if (product == number) {
				System.out.print("  " + number);
				count++;
			}
			number++;
			product = 1;
		} // end loop
		System.out.println();
		System.out.println("total :" + count);
	}

	/*
	 * 
	 * method for findig prime or not
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		toFindPerfect();
	}
}
