package com.siva.Matrix;

import java.util.Scanner;

public class MatrixAddition {
	public static void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the size of the row & column of matrix A:");
		int rowA = sc.nextInt();
		int columnA = sc.nextInt();
		System.out.println("enter the the size of the row & column of matrix B:");
		int rowB = sc.nextInt();
		int columnB = sc.nextInt();
		if ((rowA != rowB) && (columnA != columnB)) {
			System.out.println("cant perform addition ,please enter the same size of matrices..");
		} else {
			int MatrixA[][] = new int[rowA][columnA];
			int MatrixB[][] = new int[rowB][columnB];
			System.out.println("enter the elements of Matrix A");
			for (int i = 0; i < rowA; i++) {
				for (int j = 0; j < columnA; j++) {
					MatrixA[i][j] = sc.nextInt();
				}

			}

		}

	}

	public static void addition() {
		read();
	}

	public static void main(String[] args) {
		read();
	}
}
