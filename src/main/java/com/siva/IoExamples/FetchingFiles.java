package com.siva.IoExamples;

import java.io.File;

import org.apache.log4j.Logger;

public class FetchingFiles 
{ 
	Logger logger = Logger.getLogger(DirectoryExample.class);
    public void fetch()
    {
    	String[] files = new String[10];
    	File search = new File("<Path>");
    	 // create the list
    	files = search.list(); 
    	// iterate through it
    	for(String fn : files) 
    		logger.info("found " + fn);
    	
    }
    public static void main(String[] args)
    {
		FetchingFiles f = new FetchingFiles();
		f.fetch();
    	
	}
}
