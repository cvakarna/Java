package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class Reader extends Thread {
	Logger logger = Logger.getLogger(getClass());
	Calculator c;

	public Reader(Calculator c) {
		this.c = c;

	}

	@Override
	public void run() {
		String name = getName();
		synchronized (c) {
			try {
				logger.info("waiting for the calculation");
				c.wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			logger.info("total of calculator:" + c.total + " " + "  " + "received name :" + name);
		}
	}

	public static void mainDoStuff() {
		Calculator calculator = new Calculator();
		Thread t1 = new Reader(calculator);
		t1.setName("thread1");
		Thread t2 = new Reader(calculator);
		t2.setName("thread2");
		Thread t3 = new Reader(calculator);
		t3.setName("thread3");
		new Thread(calculator).start();
		t1.start();
		t2.start();
		t3.start();
	}

	public static void main(String[] args) {

		mainDoStuff();
	}
}
