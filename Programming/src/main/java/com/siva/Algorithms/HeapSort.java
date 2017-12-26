package com.siva.Algorithms;

import java.util.Scanner;

public class HeapSort {
	private static int N;

	public static void sort(int[] arr) {
		heapify(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N = N - 1;
			maxHeap(arr, 0);

		}
	}

	// method to build heap
	public static void heapify(int[] arr) {
		N = arr.length - 1;
		for (int i = N / 2; i >= 0; i++) {
			maxHeap(arr, i);

		}
	}

	// method to swap largest element in heap
	public static void maxHeap(int[] arr, int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;
		if (left <= N && arr[left] > arr[i])
			max = left;
		if (right <= N && arr[right] > arr[max])
			max = right;
		if (max != i) {
			swap(arr, i, max);
			maxHeap(arr, max);

		}
	}

	// method to swap to numbers in an array
	public static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of input elements");
		int n = sc.nextInt();
		// make array of n elements
		int[] arr = new int[n];
		// accept integer elements
		System.out.println("enter n integer elements...");
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();
			sort(arr);

		}
	}

	// main
	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 2, 7 };
		sort(arr);

	}
}
