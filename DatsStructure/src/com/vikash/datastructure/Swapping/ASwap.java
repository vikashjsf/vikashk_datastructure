//Swapping by using third variable.
package com.vikash.datastructure.Swapping;

public class ASwap {
	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200, temp;
		System.out.println("Before swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("After  swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
	}
}
