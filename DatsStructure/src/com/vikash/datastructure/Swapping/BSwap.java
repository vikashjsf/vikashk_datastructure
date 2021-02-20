//Swapping without using third variable - using +
package com.vikash.datastructure.Swapping;

public class BSwap {
	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200;
		System.out.println("Before swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
		firstNumber = firstNumber+secondNumber; //fn = 100+200=300;
		secondNumber =firstNumber-secondNumber; //sn = 300-200=100
		firstNumber = firstNumber-secondNumber; //fn = 300-100=200
		System.out.println("After  swapping FirstNumber : " + firstNumber + " SecondNumber : " + secondNumber);
	}
}	
