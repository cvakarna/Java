package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class TimeBomb implements Runnable {
	static Logger logger = Logger.getLogger(MyThread1.class);
	String[] str = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 9; i >= 0; i--) {
			try {
				Thread.sleep(1000);
				logger.info(str[i]);

			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new TimeBomb());
		logger.info("count down starting!!!");
		t.start();
		t.join();
		logger.info("boom!!!!!");
	}

}
