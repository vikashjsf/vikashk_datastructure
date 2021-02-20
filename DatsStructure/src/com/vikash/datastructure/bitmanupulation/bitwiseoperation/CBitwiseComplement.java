package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class CBitwiseComplement {
	public static void main(String[] args) {
		int number = 2, result;
		result = ~number;
		System.out.println(result);
		System.out.println(~50);
	}
}

/*

Bitwise complement of any number N is -(N+1). Here's how:

	bitwise complement of N = ~N (represented in 2's complement form)
		2'complement of ~N= -(~(~N)+1) = -(N+1)

N = 2 = -2+1 = -3

This operator is unary operator, denoted by ‘~’. 
	It returns the one’s compliment representation of the input value, 
	i.e, with all bits inverse, means it makes every 0 to 1, and every 1 to 0.

a = 5 = 0101 (In Binary)
b = 7 = 00011001 (In Binary)

Bitwise Compliment Operation of 5 and 7

~ 0101
 ________
  1010  = 10 (In decimal) 

Note – Compiler will give 2’s complement of that number, 
i.e., 2’s compliment of 10 will be -6.
1010 - 10
0101
   1
----------
0110
*/