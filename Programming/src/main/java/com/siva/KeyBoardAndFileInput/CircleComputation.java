package com.siva.KeyBoardAndFileInput;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * 
 * program called CircleComputation, which prompts user for a radius (in double)
 * and compute the area and circumference of the circle rounded to 2 decimal
 * places.
 * 
 * 
 */
public class CircleComputation {

	static Logger logger = Logger.getLogger(CircleComputation.class);

	// method for to read input data from user
	public static double readData() {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		// declare input variables;
		double radius = 0.0;
		while (radius != -1)
			logger.info("enter the radius of the circle.....:" + " or -1 to exit");
		radius = sc.nextDouble();
		// close resource
		sc.close();
		return radius;// return the value
	}

	// method to cal area
	public static void area() {
		// declare variable
		double area;
		double radius = readData();// get the input radius
		// calculate area
		area = Math.PI * radius * radius;
		logger.info("area of a circle is :" + area);
	}

	// method to cal circumference
	public static void circumference() {
		// declare vriable
		double circum;
		double radius = readData();// get the input radius
		// cal circumference
		circum = 2 * Math.PI * radius;
		// print the result
		logger.info("the circumference of the circle is :" + circum);
	}

	public static void main(String[] args) {// program starts from here
		// call area() to get area of circle
		area();
		// call circumference() to getcircumference of circle
		circumference();

	}
}
