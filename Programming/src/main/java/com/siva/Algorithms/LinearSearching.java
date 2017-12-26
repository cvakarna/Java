package com.siva.Algorithms;

public class LinearSearching {
	// method to find key in a array
	public static void searchLinear(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				System.out.println("key is found at position :" + (i + 1));
				break;
			} // end if
			if (i == array.length - 1) {
				System.out.println("key is not found");
			}

		} // end for
	}// end method

	public static void main(String[] args) {
		int[] array = { 1, 4, 6, 5, 7 };
		searchLinear(array, 4);
	}
}
