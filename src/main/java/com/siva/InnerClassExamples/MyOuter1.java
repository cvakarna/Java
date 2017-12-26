package com.siva.InnerClassExamples;

import org.apache.log4j.Logger;

public class MyOuter1 {
	Logger logger = Logger.getLogger(getClass());
	private String x = "hello";

	void doStuff() {
		final String y = "method variable";
		class MyInner1 {

			public void seeOuter() {
				logger.info(x);
				logger.info(y);
			}
		}
		MyInner1 m = new MyInner1();
		m.seeOuter();
	}

	public static void main(String[] args) {
		MyOuter1 my = new MyOuter1();
		my.doStuff();

	}

}
