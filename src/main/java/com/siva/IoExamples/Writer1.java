package com.siva.IoExamples;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Writer1 {
	static Logger logger = Logger.getLogger(Writer1.class);

	private void fileExample() {
		try {

			File file = new File("file.txt");// creating file object
			logger.info(file.exists());// returns true or false based on file
										// exists or not
			logger.info(file.createNewFile());
			logger.info(file.exists());

		} catch (IOException fe) {
			fe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Writer1 w = new Writer1();
		w.fileExample();
	}

}
