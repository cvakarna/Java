package com.siva.MethodOperations;

public class ReverseArray {
	public void reverse(int array[]) {// loop for processing the array
		int i = 0;
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(",");
			}
		}

	}

	public static void main(String[] args) {// program starts from here
		// create object
		ReverseArray ra = new ReverseArray();
		// initialize array
		int[] a = { 1, 3, 5, 4, 6 };
		// invoke reverse method
		ra.reverse(a);

	}
}
