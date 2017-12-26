package com.siva.ExerciseOnArray;
/**
 * program for find the avg of the students grades
 */

import java.util.Scanner;

import org.apache.log4j.Logger;

public class GradesAverage {
	static Logger logger = Logger.getLogger(GradesAverage.class);

	// method to cal avg
	public static void getAvg() { // declare sum variable
		int sum = 0;
		// declare the avg var
		double avg = 0.0;
		// scanner obj
		Scanner sc = new Scanner(System.in);
		logger.info("enter the no of students:");
		int noOfStu = sc.nextInt();// read no of stu
		// check the condition

		// take grade array
		int[] grade = new int[noOfStu];
		// loop for taking grades from the students
		for (int i = 0; i < noOfStu; i++) {
			logger.info("enter the grade for the student " + (i + 1));
			int gra = sc.nextInt();

			// store grades into array
			grade[i] = gra;
			// condition for checking wheather the enter grade is valind or not
			if (grade[i] > 100 | grade[i] < 0) {
				logger.info("invalid data please try again");
				i--;
			}

		} // end loop
			// loop for sum the grades
		for (int i = 0; i < grade.length; i++) {

			sum = sum + grade[i];

		} // end loop
			// cal avg
		avg = (double) sum / grade.length;
		// print the result
		logger.info("the avg is:" + avg);

	}

	public static void main(String[] args) {
		getAvg();
	}
}
