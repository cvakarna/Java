package com.siva.ListExamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class SearchObjArray {
	Logger logger = Logger.getLogger(getClass());

	public void search() {
		String[] s = { "one", "two", "three", "four" };
		Arrays.sort(s);
		logger.info(s);
		for (String string : s) {
			logger.info(string);

		}
		logger.info("search:" + Arrays.binarySearch(s, "one"));
		Resorting r = new Resorting();
		Arrays.sort(s, r);
		for (String string : s) {
			logger.info(string);

		}
		List<String> list = Arrays.asList(s);
		logger.info(list);

		// iterate the list obj
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {

			logger.info(it.next());

		}

	}

	public static void main(String[] args) {
		SearchObjArray soa = new SearchObjArray();
		soa.search();
	}

}
