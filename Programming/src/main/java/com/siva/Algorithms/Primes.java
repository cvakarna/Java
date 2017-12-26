package com.siva.Algorithms;

import java.util.Scanner;


public class Primes {

	/*
	 * method for getting primes
	 */
	public static void getPrimes() {
		// scanner object
		Scanner sc = new Scanner(System.in);
		// asking upper band
		System.out.println("please enter the upperband:");
		// read and store upperband value
		int upperBond = sc.nextInt();
		// take initial value
		int startNumber = 1;
		// assign boolean value
		boolean prime = false;
		// count variable
		int count = 0;
		// loop for iterating integers from start to end
		while (startNumber <= upperBond) {
			prime = isPrime(startNumber);
			if (prime) {
				System.out.println(startNumber);
				count++;
			} // end if
			startNumber++;
		} // end while

		// printing the result prime numbers and percentage
		System.out.println(count + "  total prime numbers found(" + (float) (count * 100) / upperBond + "%)");
	}

	/*
	 * method to determine an integer is a prime or not and return true if its
	 * otherwise return false
	 * 
	 */
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {// program starts from here
		// call this method
		getPrimes();
	}
}
