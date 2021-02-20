//Swapping two numbers without using temp variable in Java with division and multiplication
package com.vikash.datastructure.Swapping;

public class DSwap {
	public static void main(String[] args) {
		int firstNumber = 2, secondNumber = 4;
		System.out.println("Before swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
		firstNumber = firstNumber*secondNumber; //now fn is 6 and sn is 4
		secondNumber =firstNumber/secondNumber; //now fn is 6 but sn is 2 (original value of a)
		firstNumber = firstNumber/secondNumber; //now fn is 4 and sn is 2, numbers are swapped
		System.out.println("After  swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
	}
}
