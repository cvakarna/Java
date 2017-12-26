package com.siva.Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectAndDeficientNumbers {

	public static void toFindPerfect() {
		List<Long> list1 = new ArrayList<Long>();
		List<Long> list2 = new ArrayList<Long>();
		List<Long> list3 = new ArrayList<Long>();
		// scanner obj
		Scanner sc = new Scanner(System.in);
		// input
		System.out.println("enter the upper bound value");
		// taking input
		int upperBound = sc.nextInt();
		// initialize number& sum value
		long number = 1;

		long sum = 0;
		// loop for take every number upto specified level

		while (number <= upperBound) {
			// loop for find factors
			for (int i = 1; i < number; i++) {

				if (number % i == 0) {
					sum = sum + i;
				}
			} // end for loop

			if (sum == number) {
				list1.add(number);

			} else if (sum < number) {
				list2.add(number);
			}

			else
				list3.add(number);
			sum = 0;
			number++;

		} // end loop
			// printing perfect numbers
		System.out.println("these numbers are perfect:");
		System.out.println(list1);
		System.out.println(list1.size() + "perfect numbers found(" + list1.size() / upperBound * 100 + ")");
		double percentage = list1.size() * 100 / upperBound;
		System.out.println(list1.size() + "perfect numbers found(" + percentage + ")");

		// printing deficient numbers
		System.out.println("thease numbers are deficient:");
		System.out.println(list2);
		// printing niether perfect nor defficient numbers
		System.out.println("these are the  niether perfect nor defficient numbers");
		System.out.println(list3);

	}

	public static void main(String[] args) {
		toFindPerfect();
	}
}
