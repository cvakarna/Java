package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class ThreadB extends Thread {
	int total;
	static Logger logger = Logger.getLogger(ThreadB.class);

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				total = total + i;
			}
			notify();
		}

	}

}
