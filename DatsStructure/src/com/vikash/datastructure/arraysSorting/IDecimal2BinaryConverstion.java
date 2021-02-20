//Decimal number to binary number conversion
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;
import java.util.Stack;

public class IDecimal2BinaryConverstion {
	public static void main(String[] args) {
		int dec = 16;
		decimal2Binary(dec);
		System.out.println("-----------------");
		decimal2Binary(dec);
		System.out.println("------------------");
		decimal2Binary2(dec);
	}
	
	//Using predefined method
	public static void decimal2Binary(int num) {
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary : "+ binary);
	}
	
	//Simple way 
	public static void decimal2Binary1(int num) {
		int [] by = new int[40];
		int index =0;
		while(num>0) {
			by[index++] =  num%2;
			num = num/2;
		}
		System.out.println(Arrays.toString(by));
	}
	
	//Using stack
	public static void decimal2Binary2(int num) {
		Stack<Integer> stack = new Stack<>();
		int index =0;
		while(num>0) {
			stack.push(num%2);
			num = num/2;
		}
		System.out.print("Binary : ");
	    while (!(stack.isEmpty() ))
	    {
	      System.out.print(stack.pop());
	    }
	}
}
