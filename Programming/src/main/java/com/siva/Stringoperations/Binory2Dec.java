package com.siva.Stringoperations;

import java.util.Scanner;

public class Binory2Dec {
	public static void getDec() { // take variable for decNum
		int decNum = 0;
		// create scanner obj to get data
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary string :");
		String binary = sc.nextLine();// take binary string and store into
										// binary string variable
		// get length
		int binLength = binary.length();
		// loop for proceesing binary to decimal
		for (int i = 0; i < binLength; i++) {
			char binChar = binary.charAt(i);
			// 3 cases: '1' (add to dec), '0' (do nothing), others (error)
			if (binChar == '1') {
				decNum = (int) (decNum + Math.pow(2, i));

			} else if (binChar == '0') {

			} else {
				System.out.println("wrong input data");
				System.exit(11);
			}

		} // end loop
			// print result
		System.out.println("the decimal num is :" + decNum);
	}// end method

	public static void main(String[] args) {// program starts from here
		// call method

		getDec();
	}
}
