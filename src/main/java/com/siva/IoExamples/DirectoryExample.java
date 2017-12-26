package com.siva.IoExamples;

import java.io.File;

import org.apache.log4j.Logger;

public class DirectoryExample {
	Logger logger = Logger.getLogger(DirectoryExample.class);

	public void directorypath() {
		File dir = new File("/home/workspace");
		logger.info(dir.isDirectory());
		// File file = new
		// File("/home/bizruntime-10/workspace","/home/bizruntime-10/test.txt");
		File file = new File("workspace", "/home/test.txt");
		logger.info(file.isFile());
	}

	public static void main(String[] args) {
		DirectoryExample d = new DirectoryExample();
		d.directorypath();
	}
}
