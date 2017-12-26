package com.siva.TestDateExample;

import java.text.DateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class DateFormatExample {
	static Logger logger = Logger.getLogger(DateFormatExample.class);
	public void dateproccessing()
	{
		Date d1 = new Date(1_000_000_000_000l);
		DateFormat[] df = new DateFormat[6];
		df[0] = DateFormat.getDateInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for (DateFormat dateFormat : df)
		{
			logger.info(dateFormat.format(d1));
			
		}
	}

	public static void main(String[] args) {
		DateFormatExample dfe = new DateFormatExample();
		dfe.dateproccessing();
		
	}
}
