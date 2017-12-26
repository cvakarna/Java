package com.siva.Conditional;

import org.apache.log4j.Logger;

/*
 * 
 * Write a program called CozaLozaWoza which prints the numbers 1 to 110, 
 * 11 numbers per line. The program shall print "Coza" in place of the numbers 
 * which are multiples of 3, "Loza" for multiples of 5, "Woza" for multiples of 7,
 * "CozaLoza" for multiples of 3 and 5, and so on.
 * 
 */
public class CozaLozaWoza {

	static Logger logger = Logger.getLogger(CozaLozaWoza.class);
	private static void print()
	{
		//set the lower and upper bound
		int lowerBound = 1,upperBound=110;
		//set boolean for num is processed or not
		boolean printed = false;
		//loop for processing results
		for (int number = 0; number <=upperBound; number++) {
		// Print "Coza" if number is divisible by 3
			if(number%3==0)
			{
				//logger.info("Coza");
				System.out.print("Coza");
				printed = true;
			}
			 // Print "Loza" if number is divisible by 5
			if(number%5==0)
			{
				//logger.info("Loza");
				System.out.print("Loza");
				printed = true;
			}
			 // Print "Woza" if number is divisible by 7
			if(number%7==0)
			{
				//logger.info("Woza");
				System.out.print("woza");
				printed = true;
			}
			//print num if its not divisible by 3,5,7
			if((number%3&number%5&number%7)!=0)
			{
				//logger.info(number);
				System.out.print(number);
			}
			/*if(!printed)
			{
				System.out.print(number);
			}*/
			
			  // After processing the number, print a newline if number is divisible by 11; 
	         // else print a space
		   if(number%11==0)
		   {
			   System.out.println();
		   }
		   else
			   System.out.print("");
		
		}//emd loop
		
		
	}//end method
	
	public static void main(String[] args) {//program starts from here
		//call method to print
		print();
	}
}
