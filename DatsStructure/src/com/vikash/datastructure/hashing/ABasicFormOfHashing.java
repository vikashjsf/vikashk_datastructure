package com.vikash.datastructure.hashing;

import java.util.Random;
public class ABasicFormOfHashing {
	static int[] arr = new int[50];
	
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			int value = random.nextInt(40) + 10;
			System.out.println("Value::" + value);
			insertion(value);
		}
	}
	
	public static void insertion(int value) {
		if(arr[value] !=value) {
			arr[value] = value;
		}else {
			System.out.println("index :"+value +" is already occupied!! and collision happen!!");
		}
	}
}
/*
Note
1.  f(x) = x  || x is the integer value where x >=0 
	so we will store arr[x] =x
2. In this approach, Suppose I want to store  only 99 then 100 size of array required
	and to place 99 it will occupy 99th index.
	and rest of the index/array will be unoccupied so its kind of waste of a-lots of byte of 
	Memory.
3. In case of collision either it will simply replace the older value since we are not handling
	it.
4. To resolve the above two problem below technique will be used.
	Open Addressing (Closed Hashing)
		Linear Probing
		Quadratic Probing
		Double Hashing
	Separate Chaining (Open Hashing)
	
*/

