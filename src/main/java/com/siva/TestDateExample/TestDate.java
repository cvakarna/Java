package com.siva.TestDateExample;

import java.util.Date;

import org.apache.log4j.Logger;

public class TestDate {
	Logger logger = Logger.getLogger(TestDate.class);
	
	public void dateexample()
	{
		Date d1 = new Date(1_000_000_000l);
		logger.info("first date:"+d1.toString());
		d1.setTime(d1.getTime()+3_600_000);
		logger.info("new date:"+d1.toString());
		
	}
 public static void main(String[] args) {
	TestDate testDate = new TestDate();
	testDate.dateexample();
	
}
}
