package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class ThreadA {
	static Logger logger = Logger.getLogger(ThreadA.class);

	public static void waiting() {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			try {
				logger.info("waiting for b to complete:");
				b.wait();
				b.sleep(1000);
				logger.info("b total value:" + b.total);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		waiting();
	}

}
