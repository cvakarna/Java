package com.siva.MethodOperations;

/**
 * 
 * prgram to swap two arrays if thier length is same
 */
public class SwapTwoArrays {
	public static boolean swap(int[] first, int[] second) { // check the
															// condition whether
															// two arrays
															// lengths are equal
															// or not
		if (first.length == second.length) {
			for (int i = 0; i < second.length; i++) {
				int temp = first[i];
				first[i] = second[i];
				second[i] = first[i];
			}
			/*
			 * for (int i = 0; i < second.length; i++) {
			 * System.out.print(first[i]+","); }
			 */
			return true;
		} else
			return false;
	}

	public static void input() {
		int[] first = { 1, 4, 3, 6 };
		int[] second = { 6, 9, 5, 4 };
		// invoke swap and store result
		boolean flag = swap(first, second);
		if (flag)// check condition
		{
			System.out.println("the two arrays are swapped");
		} else
			System.out.println("the two arrays are not swapped");
	}

	public static void main(String[] args) {// program starts here
		// invoke method
		input();
	}
}
