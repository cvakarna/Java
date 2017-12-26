package com.siva.TryWithResourceExample;

import org.apache.log4j.Logger;

public class OneAutoCloseable implements AutoCloseable {
	static Logger logger = Logger.getLogger(OneAutoCloseable.class);

	public void doIt() {
		logger.info("my do it!!");
	}

	@Override
	public void close() throws Exception {
		logger.info("close oneautocloseable");

	}

}
