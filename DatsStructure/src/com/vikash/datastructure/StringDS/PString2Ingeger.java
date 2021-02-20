//How to Convert String to Integer to String in Java with Example
package com.vikash.datastructure.StringDS;

public class PString2Ingeger {
	public static void main(String[] args) {
		String str = "123";
		int number = Integer.parseInt(str);
		int number1 = Integer.valueOf(str);
		int num = 1236;
		String num2 = String.valueOf(num);
		String num3 = Integer.toString(num);
		String num4 = String.format ("%d", num);
		String num5 = ""+num;
		// new StringBuilder().append( "" ).append(1236).toString();
		System.out.println("done");

	}
}

/*
String to integer
1) By using Intger.parseInt(String string-to-be-converted) method
2) Integer.valueOf() method
Integer to String
	String.valueOf(num);
	Integer.toString(num);
	String.format ("%d", num);
	""+num;
*/
