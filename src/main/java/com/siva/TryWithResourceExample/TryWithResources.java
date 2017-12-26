package com.siva.TryWithResourceExample;

public class TryWithResources {
	public static void closeResources() throws Exception {
		try (OneAutoCloseable one = new OneAutoCloseable()) {

			one.doIt();
		}

	}

	public static void main(String[] args) throws Exception {
		closeResources();
	}

}
