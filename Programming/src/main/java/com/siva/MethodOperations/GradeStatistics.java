package com.siva.MethodOperations;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * 
 * program to calculate statistics of the grades such as average, minimum,
 * maximum, median and standard deviation.
 * 
 */
public class GradeStatistics {
	static Logger logger = Logger.getLogger(GradeStatistics.class);
	public static int[] grades; // Declare an int[], to be allocated later.this
								// array
	// is accessed bt all methods

	// method to read the student grades
	public static void readGrades() {
		Scanner sc = new Scanner(System.in);
		logger.info("enter the no of students:");
		int noOfStu = sc.nextInt();
		for (int i = 0; i < noOfStu; i++) {
			logger.info("enter the grade of student " + (i + 1));

			grades[i] = sc.nextInt();

		}
		printGrades();
	}// end method

	// print grades

	public static void printGrades() {
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i]);
			if (grades[i] < grades.length - 1) {
				System.out.print(",");
			}

		}
	}// method end

	public static void main(String[] args) {
		readGrades();
	}
}
