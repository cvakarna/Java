package com.siva.AdvancedOOExamples;

import org.apache.log4j.Logger;

public class GiftBox implements Box {
 // Logger logger=  Logger.getLogger(GiftBox.class);
  
	@Override
	public void pack() {
		// TODO Auto-generated method stub
		logger.info("pack box");
		
	}

	@Override
	public void seal() {
		// TODO Auto-generated method stub
		logger.info("seal box");
		
	}

}
