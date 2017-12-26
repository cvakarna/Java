package com.siva.Algorithms;

import java.util.Arrays;

public class MergeSort {
	public static Comparable[] mergerSort(Comparable[] list) {
		// if the list is empty then no need to do anything
		if (list.length <= 1)
			return list;
		// split the array into halfs
		Comparable[] first = new Comparable[list.length / 2];
		Comparable[] second = new Comparable[list.length - first.length];
		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);
		// sort each half recursively
		mergerSort(first);
		mergerSort(second);
		// merge both halfs together,overwriting to original array
		merge(first, second, list);
		return list;

	}

	private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
		// Index Position in first array - starting with first element
		int iFirst = 0;
		// Index Position in second array - starting with first element
		int iSecond = 0;

		// Index Position in merged array - starting with first position
		int iMerged = 0;
		// Compare elements at iFirst and iSecond,
		// and move smaller element at iMerged
		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst].compareTo(second[iSecond]) < 0) {
				result[iMerged] = first[iFirst];
				iFirst++;
			} else
				result[iMerged] = second[iSecond];
			iSecond++;
		}
		iMerged++;
		// copy remaining elements from both halves - each half will have
		// already sorted elements

		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);

	}

	public static void main(String[] args) {
		// unsorted array
		Integer[] a = { 2, 5, 7, 3, 1 };
		// cal merge sort
		mergerSort(a);
		// output
		System.out.println(Arrays.toString(a));
	}
}
