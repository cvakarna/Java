package com.siva.KeyBoardAndFileInput;

import java.util.Scanner;

public class Circle {
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		double number = 0;
		double circum = 0;
		System.out.println("enter the radius: or type -1 to exit");
		number = sc.nextDouble();
		while (number != -1) {
			circum = 2 * Math.PI * number;
			System.out.println("circumference:" + circum);
			break;

		}

	}

	public static void main(String[] args) {
		calculator();
	}
}
