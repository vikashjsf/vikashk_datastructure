package com.vikash.datastructure.bitmanupulation.bitwiseoperation;

public class ELeftShift1 {
	public static void main(String[] args) {
		int number=1;
		System.out.println(number<<1);
		System.out.println(number<<2);
	}
}
/*

The left shift operator << shifts a bit pattern to the left by certain number of specified bits, 
	and zero bits are shifted into the low-order positions.

Shift Operators: 
	These operators are used to shift the bits of a number left or right thereby 
	multiplying or dividing the number by two respectively. 
	They can be used when we have to multiply or divide a number by two.
	Left shift operator (<<) –
Shifts the bits of the number to the left and fills 0 on voids left as a result. 
Similar effect as of multiplying the number with some power of two.
For example,

a = 5 = 0000 0101

a << 1 = 0000 1010 = 10
a << 2 = 0001 0100 = 20 

Left Shift ( << ): Left shift operator is a binary operator which shift the some number of bits, 
	in the given bit pattern, to the left and append 0 at the end. 
	Left shift is equivalent to multiplying the bit pattern with 2k ( if we are shifting k bits ).

1 << 1 = 2 = 2 power of 1
1 << 2 = 4 = 2 power of 2
1 << 3 = 8 = 2 power of 3
1 << 4 = 16 =2 power of 4
…
1 << n = 2 power of n 
*/