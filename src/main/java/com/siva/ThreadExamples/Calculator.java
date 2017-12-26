package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class Calculator implements Runnable {

	int total;
	static Logger logger = Logger.getLogger(Calculator.class);

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				total = total + i;

			}
			// after completion of addition notify the waiting threads
			notifyAll();

		}

	}

}
