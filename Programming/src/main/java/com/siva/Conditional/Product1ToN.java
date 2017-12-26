package com.siva.Conditional;

/**
 * 
 * program to calculate the product
 * 
 * */
import org.apache.log4j.Logger;

public class Product1ToN {// save as Product1ToN.java
	static Logger logger = Logger.getLogger(Product1ToN.class);

	// method to calculate product
	public static void calculateProduct() {
		// set the value for product variable
		long product = 1;
		for (int i = 1; i < 10; i++) {
			product = product * i;
		} // end for loop
			// print the obtained product
		logger.info("the product of the numbers range 1 to 10 is:" + product);
	}// end method

	public static void main(String[] args) {// program starts from here
		// call the method to get the product
		calculateProduct();

	}
}
