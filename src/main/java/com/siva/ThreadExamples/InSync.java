package com.siva.ThreadExamples;

import org.apache.log4j.Logger;

public class InSync extends Thread {
	Logger logger = Logger.getLogger(getClass());
	StringBuffer letter;

	public InSync(StringBuffer letter) {
		this.letter = letter;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		synchronized (letter) {
			// logger.info(letter);
			for (int i = 0; i < 3; i++) {
				logger.info(letter);
			}
			char temp = letter.charAt(0);
			// increment the letter at string buffer
			++temp;
			letter.setCharAt(0, temp);
		}
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new InSync(sb).start();
		new InSync(sb).start();
		new InSync(sb).start();

	}
}
