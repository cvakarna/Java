package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class College extends Thread {
	static Logger logger = Logger.getLogger(College.class);
	int seats;

	public College(int seats) {
		// TODO Auto-generated constructor stub
		this.seats = seats;
	}

	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		logger.info("welcome" + name);
		logger.info("no of seats before councelling:" + seats);
		if (seats > 0) {
			try {
				logger.info("seat is alloted to " + name);
				seats = seats - 1;
				Thread.sleep(100);

			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		} else
			logger.info("seat not alloted to :" + name);
		logger.info("no of seats available after the counselling:" + seats);

	}

}
