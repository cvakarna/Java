package com.siva.ThreadExamples;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ArrayListRunnable implements Runnable {
	static Logger logger = Logger.getLogger(ArrayListRunnable.class);
	private List<Integer> list = new ArrayList<>();

	public ArrayListRunnable() {
		// add some elements
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		logger.info(list);
	}

	@Override
	public void run() {
		// running concurrently
		String name = Thread.currentThread().getName();
		while (!list.isEmpty()) {
			logger.info(name + "  removed" + list.remove(0));
		}

	}

	public static void main(String[] args) {
		ArrayListRunnable arrayListRunnable = new ArrayListRunnable();
		Thread t = new Thread(arrayListRunnable);
		Thread t2 = new Thread(arrayListRunnable);
		t.start();
		t2.start();
		t.start();
		// logger.info(list);
	}
}
