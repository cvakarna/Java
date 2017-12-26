package com.siva.Stringoperations;

import java.util.Scanner;

/**
 * program called PhoneKeyPad, which prompts user for a String (case
 * insensitive), and converts to a sequence of keypad digits.
 * 
 */
public class PhoneKeyPad {

	public static void getPhoneKeyPad() {
		// create scanner to get inut string
		Scanner sc = new Scanner(System.in);
		// read data from user
		System.out.println("enter the data:");
		// get data and converted into lower case
		String data = sc.nextLine().toLowerCase();
		for (int i = 0; i < data.length(); i++) {
			// to get each character from the data
			char character = data.charAt(i);
			// check the case to print numbers
			// using switch case
			switch (character) {

			case 'a':
			case 'b':
			case 'c':
				System.out.print(1);
				break;
			case 'd':
			case 'e':
			case 'f':
				System.out.print(2);
				break;
			case 'g':
			case 'h':
			case 'i':
				System.out.print(3);
				break;
			case 'j':
			case 'k':
			case 'l':
				System.out.print(4);
				break;
			case 'm':
			case 'n':
			case 'o':
				System.out.print(5);
				break;
			case 'p':
			case 'q':
			case 'r':
				System.out.print(6);
				break;
			case 's':
			case 't':
			case 'u':
				System.out.print(7);
				break;
			case 'v':
			case 'w':
			case 'x':
				System.out.print(8);
				break;
			case 'y':
			case 'z':
				System.out.print(9);
				break;

			default:
				System.out.print(" ");
			}// end switch

		} // end loop

	}// end method

	public static void main(String[] args) {
		// cal method to get key
		getPhoneKeyPad();
	}

}
