package com.siva.ThreadExamples;

public class Counselling {
	public static void doCounsilling() {
		College c = new College(1);
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.setName("student1");
		t2.setName("student2");
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		doCounsilling();
	}
}
