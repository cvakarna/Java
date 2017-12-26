package com.siva.ListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

public class ArrayListExample {
	Logger logger = Logger.getLogger(ArrayListExample.class);

	public void acces() {
		List<String> list = new ArrayList<>();
		list.add("sony");
		list.add("Apple");
		list.add("samsung");
		list.add("lenovo");
		list.add("Apple");
		list.add("mi");
		logger.info("the list:" + list);
		list.remove(3);
		list.remove("samsung");
		logger.info(list);
		logger.info("size :" + list.size());
		Collections.sort(list);
		logger.info(list);

	}

	public static void main(String[] args) {
		ArrayListExample ae = new ArrayListExample();
		ae.acces();

	}

}
