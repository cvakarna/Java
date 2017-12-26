package com.siva.Conditional;

import org.apache.log4j.Logger;
/*
 * check given number is odd or even
 * */
public class CheckOddOrEven {
	static Logger logger = Logger.getLogger(CheckOddOrEven.class);
	static void oddEven()
	{
		//set the vlue num here
		int number = 49;
		logger.info("the number is :"+number);
		//check condition on given number is odd or even
		if(number%2==0)
		{
			logger.info("given num is even");
		}
		else
			logger.info("given num is odd");
		logger.info("BYE");
	}
		public static void main(String[] args) {
			//program starts from here
			//call the oddEven ()
			oddEven();

		}
}
 