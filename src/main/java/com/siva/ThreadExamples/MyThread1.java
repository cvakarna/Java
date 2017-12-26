package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class MyThread1 implements Runnable {
	static Logger logger = Logger.getLogger(MyThread1.class);

	@Override
	public void run() {

		try {
			Thread.sleep(100);

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		logger.info("name of user thread :" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		Thread t = new Thread(m1);
		t.start();

	}
}
