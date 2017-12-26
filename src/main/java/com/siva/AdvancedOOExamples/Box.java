package com.siva.AdvancedOOExamples;

import org.apache.log4j.Logger;

public interface Box {
	Logger logger = Logger.getLogger(Box.class);
	void pack();
	void seal();
	

}
