package com.siva.Algorithms;


public class GreatestCommanDivisor {
	public static void findGcd(int a, int b)// assume a>=b
	{
		while (b != 0) {
			// change the vaue of a and b
			int temp = b;
			b = a % b;
			a = temp;

		} // end loop
			// after the loop completes i.e. b =0 we have gcd(a,0);
			// then gcd = a
		System.out.println("gcd of a given two numbers are:" + a);

	}

	public static void main(String[] args) {// program starts from here
		// call the method to get gcd of two given numbers
		findGcd(12, 3);// a should be greater than b
	}
}
