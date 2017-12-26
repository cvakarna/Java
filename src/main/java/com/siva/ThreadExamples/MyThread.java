package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class MyThread extends Thread {
	static Logger logger = Logger.getLogger(MyThread.class);

	@Override
	public void run() {
		try {
			// suspend execution of thread for sometime
			sleep(122);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		logger.info("in run method name of thread:" + getName());
	}

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		// set the name of userdefined thread
		t.setName("my first thread");
		// getting current executing thread
		logger.info("main thread name:" + currentThread().getName());
	}

}
