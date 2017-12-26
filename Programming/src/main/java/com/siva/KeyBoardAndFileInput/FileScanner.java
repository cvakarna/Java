package com.siva.KeyBoardAndFileInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * program for getting input data from file and produce output
 * 
 */
public class FileScanner {
	public static void fileRead() throws FileNotFoundException {
		// create object for scanner to get input data from file
		Scanner sc = new Scanner(new File("in.txt"));
		int num1;
		double num2;
		String name;
		double sum;
		num1 = sc.nextInt();// read integer
		num2 = sc.nextDouble();// read double
		name = sc.next();// read name
		// cal sum
		sum = num2 + num1;
		// dispaly result
		System.out.println("Hey!!" + "  " + name + " , out put for your data is:" + sum);

	}

	public static void main(String[] args) throws FileNotFoundException {// program
																			// starts
																			// from
																			// here
		// call method to operation
		fileRead();

	}
}
