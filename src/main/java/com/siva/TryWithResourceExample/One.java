package com.siva.TryWithResourceExample;

import org.apache.log4j.Logger;

public class One implements AutoCloseable {
	Logger logger = Logger.getLogger(One.class);

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		logger.info("close one");

	}

}
