package com.siva.TryWithResourceExample;

import org.apache.log4j.Logger;

public class Two implements AutoCloseable {
	Logger logger = Logger.getLogger(Two.class);

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		logger.info("close two");

	}

}
