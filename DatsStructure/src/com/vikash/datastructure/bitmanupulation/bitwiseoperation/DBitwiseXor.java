package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class DBitwiseXor {
	public static void main(String[] args) {

		int number1 = 12, number2 = 25, result;
		result = number1 ^ number2;
		System.out.println(result);
		System.out.println(number1^number2);
		System.out.println(12^25);
	}
}

/*

Bitwise XOR is a binary operator (operates on two operands). It's denoted by ^.

The ^ operator compares corresponding bits of two operands. 
	If corresponding bits are different, it gives 1. 
	If corresponding bits are same, it gives 0. For example,

12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bitwise XOR Operation of 12 and 25
  00001100
| 00011001
  ________
  00010101  = 21 (In decimal)

*/
