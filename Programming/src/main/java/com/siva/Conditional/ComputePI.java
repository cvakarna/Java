package com.siva.Conditional;

/*
 *  program called ComputePI to compute the value of π
 * 
 */
import org.apache.log4j.Logger;

public class ComputePI {//save as ComputePI.java
	static Logger logger = Logger.getLogger(ComputePI.class);
	//method to calculate the pi
	static private void piCalculator()
	{
		//set the sum initial
		double sum = 0.0;
		int maxDenominator= 5;
		for (int denominator = 1; denominator <= maxDenominator; denominator += 2)
		{
			if(denominator%4==1)
			{
				sum = sum+(double)1/denominator;
			}
			else if(denominator%4==3)
			{
				sum = sum+(double)1/denominator;
			}
		    
		else
			logger.info("computer gone crazyyy.........");
	    }//end loop
		//print the result
		logger.info("the pi value series :"+(double)4*sum);
		logger.info(Math.PI);

	}//end method
	
	public static void main(String[] args) {//programs starts from here
		//call method to get pi value of series
		piCalculator();
		
	}
}