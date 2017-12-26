package com.siva.Conditional;

import org.apache.log4j.Logger;

/*
 * check pass or fail
 * */
public class CheckPassFail {
static Logger logger = Logger.getLogger(CheckPassFail.class);

	public static void passOrFail()
	{
		//set the mark
		int mark= 49;
		logger.info("the mark is:"+mark);
		//checking the condition whether pass or fail
		if(mark>50)
		{
			logger.info("PASS");
		}
		else
		{
			logger.info("FAIL");
		}
		
			
	}
	public static void main(String[] args) {//program  start from amin
		//calling the method
		passOrFail();
	}

}
