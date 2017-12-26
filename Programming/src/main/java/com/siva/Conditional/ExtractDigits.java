package com.siva.Conditional;
/*
 * program to extract the digits and print in reverse order of given number
 * 
 */

import org.apache.log4j.Logger;

public class ExtractDigits {//save as ExtractDigits.java
	static Logger logger = Logger.getLogger(ExtractDigits.class);
	//method for stuff
     static public void doCompute()
     {
    	 //set the num you wish to do
    	 int number = 1234;
    	 //print given num
    	 logger.info("the given num is:"+number);
    	 //take string to hold digits
    	 String hold="";
    	 //logic for extract digits
    	 while(number!=0)
    	 {
    		 int d = number%10;
    		 hold = hold+" "+d;
    		 number = number/10;	 
    	 }
    	 //print output
    	 logger.info("the out put is:"+hold);
     }
     public static void main(String[] args) {//program starts from here
    	 //call method to get output
    	 doCompute();
		
	}
}
