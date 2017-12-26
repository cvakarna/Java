package com.siva.MethodOperations;

public class ArrayCopy {
 public int[] copyOf(int[] array)
 {
	 return array;
 }
 public static void main(String[] args) {
	 //object creation
	ArrayCopy ac = new ArrayCopy();
	//initialize array
	int[] array = {1,2,3,5,6};
	//invoke method to get array
	int[] copy = ac.copyOf(array);
	
}
}
