package com.siva.FileAttributesExamples;


import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

import org.apache.log4j.Logger;


public class BasicAttributes {
	Logger logger = Logger.getLogger(BasicAttributes.class);
	public void test() throws IOException
	{
		Path file = Paths.get("/home/bizruntime-10/siva@Bizruntime/docs/file1.txt");
		BasicFileAttributes ba = java.nio.file.Files.readAttributes(file,BasicFileAttributes.class);
		logger.info("creation time:"+ba.creationTime());
		logger.info("is directory:"+ba.isDirectory());
		logger.info("last accestime:"+ba.lastAccessTime());
		logger.info("is symbolliclink:"+ba.isSymbolicLink());
		//set the time in millisec
		long currenttime = System.currentTimeMillis();
		FileTime ft = FileTime.fromMillis(currenttime);
		Files.setLastModifiedTime(file, ft);
		logger.info("creation time:"+ba.creationTime());
		//file store atrributes
		FileStore store = Files.getFileStore(file);
		long total = store.getTotalSpace();
		logger.info(total);
		long avail = store.getUsableSpace();
		logger.info(avail);
		//to know about file permissions
		
	   logger.info(Files.isReadable(file));
		
	}
 public static void main(String[] args) {
	
	 BasicAttributes b = new BasicAttributes();
	 try {
		b.test();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
