package com.siva.IoExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Test {
	Logger logger = Logger.getLogger(Test.class);

	public void filetest() {
		try {
			File file = new File("file.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line = br.readLine();
			logger.info(line);
			FileWriter fileWriter = new FileWriter(file);

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.filetest();
	}

}
