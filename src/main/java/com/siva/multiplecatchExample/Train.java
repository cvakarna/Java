package com.siva.multiplecatchExample;

import org.apache.log4j.Logger;

public class Train {
	static Logger logger = Logger.getLogger(Train.class);
	public static void test()
	{
		Train t = new Train();
		try{
			t.drive();
			
		}
		catch(AnotherTrainComing|RunOutOfTrack e)
		{
			//throw e;
			e.printStackTrace();
			logger.info("error driving");
			throw e;
		}
		
	}

	public void drive() throws RunOutOfTrack,AnotherTrainComing
	{
		throw new RunOutOfTrack("run out of track");
		
	}
	public static void main(String[] args) {
		test();
		
	}
}
