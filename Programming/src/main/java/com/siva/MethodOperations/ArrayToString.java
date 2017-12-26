package com.siva.MethodOperations;
/*
 * 
 * program for get string from integer array 
 */
public class ArrayToString {
	public String getString(int[] array)
	{
		int i=0;
		String string="";
		for ( i = 0; i < array.length; i++) {
			string = string+array[i];
			if(i<array.length-1)
			{
				string = string+",";
				
			}
		}
		return string;
	}
	public static void main(String[] args) {//program starts from here
		//create object
		ArrayToString as = new ArrayToString();
		int []array= {1,5,7,4,7,8};
		//invoke the method to get result and print the result
		System.out.println(as.getString(array));
		
	}

}
