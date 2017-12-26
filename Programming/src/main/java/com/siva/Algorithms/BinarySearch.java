package com.siva.Algorithms;

public class BinarySearch {
	public static void search(int[] array, int key) {
		int firstIndx = 0;
		int lastIndx = array.length - 1;
		int middleIndx = (firstIndx + lastIndx) / 2;
		while (firstIndx <= lastIndx) {
			if (array[middleIndx] < key) {
				firstIndx = middleIndx + 1;
			} else if (array[middleIndx] == key) {

				System.out.println("the key is found at location " + (middleIndx + 1));
				break;
			} else
				lastIndx = middleIndx - 1;

			middleIndx = (firstIndx + lastIndx) / 2;

		} // end loop
		if (firstIndx > lastIndx) {
			System.out.println("the key not found in an arry");
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 8, 12, 34, 56 };

		search(array, 12);
	}
}
