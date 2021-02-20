//Swapping two numbers without using temp variable in Java with bitwise operator
package com.vikash.datastructure.Swapping;

public class CSwap {
	public static void main(String[] args) {
		int firstNumber = 2, secondNumber = 4;
		System.out.println("Before swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
		firstNumber = firstNumber^secondNumber; //now fn is 6 and sn is 4
		secondNumber =firstNumber^secondNumber; //now fn is 6 but sn is 2 (original value of a)
		firstNumber = firstNumber^secondNumber; //now fn is 4 and sn is 2, numbers are swapped
		System.out.println("After  swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
	}
}
/*

A       B       A^B (A XOR B)
0       0       0 (zero because operands are same)
0       1       1
1       0       1 (one because operands are different)
1       1       0

int a = 2; //0010 in binary
int b = 4; //0100 in binary

*/
