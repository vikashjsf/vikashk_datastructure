package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class ABitwiseOR {
	public static void main(String[] args) {
		int number1 = 12, number2 = 25, result;
		result = number1 | number2;
		
		System.out.println(result);
		System.out.println(number1|number2);
		System.out.println(12|25);
	}
}

/*

OR bitwise operation will return 1 if any of operand is 1 and zero only if both operands are zeros.

Bitwise OR is a binary operator (operates on two operands). It's denoted by |.

The | operator compares corresponding bits of two operands. 
	If either of the bits is 1, it gives 1. If not, it gives 0. For example,

12 = 00001100 (In Binary)
25 = 00011001 (In Binary)

Bitwise OR Operation of 12 and 25
  00001100
| 00011001
  ________
  00011101  = 29 (In decimal)

*/
