package com.siva.IoExamples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Writer2 {
	FileWriter fw = null;
	FileReader fr = null;
	Logger logger = Logger.getLogger(Writer2.class);

	private void fileWriteRead() {
		char[] ch = new char[50];
		int size = 0;
		try {
			File file = new File("file.txt");
			fw = new FileWriter(file);
			fw.write("hai jhon how are you");
			fr = new FileReader(file);
			size = fr.read(ch);
			logger.info(size + " ");
			for (char c : ch) {
				logger.info(c);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				;
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Writer2 w = new Writer2();
		w.fileWriteRead();
	}
}
