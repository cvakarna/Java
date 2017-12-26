package com.siva.TryWithResourceExample;

import org.apache.log4j.Logger;

public class TryResources {
	Logger logger = Logger.getLogger(TryResources.class);

	private void resourcescheck() {
		try (One one = new One(); Two two = new Two()) {
			logger.info("Try block");
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			logger.info("finally");
		}
	}

	public static void main(String[] args) {
		TryResources tr = new TryResources();
		tr.resourcescheck();
	}

}
