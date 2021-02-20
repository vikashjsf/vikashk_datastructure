package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class BBitwiseAND {
	public static void main(String[] args) {
		int number1 = 12, number2 = 25, result;
		result = number1 & number2;
		
		System.out.println(result);
		System.out.println(number1&number2);
		System.out.println(12&25);
	}
}

/*

Bitwise AND is a binary operator (operates on two operands). It's denoted by &.

The & operator compares corresponding bits of two operands. 
	If both bits are 1, it gives 1. If either of the bits is not 1, it gives 0. For example,

12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bit Operation of 12 and 25
  00001100
& 00011001
  ________
  00001000  = 8 (In decimal)

*/
