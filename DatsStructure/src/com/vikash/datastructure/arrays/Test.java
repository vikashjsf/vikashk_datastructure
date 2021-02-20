package com.vikash.datastructure.arrays;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		int targetNumber = 10;
		int temp;
		//System.out.println(factorial(5));
		Integer[] numbers = { 1,2, 4, 3, 5,6,7, 8, 9 };
		for(int i=0;i< numbers.length;i++) {
			
			temp = targetNumber-numbers[i];
			
			if(temp >= 0 && set.contains(temp)) {
				System.out.println(numbers[i] +" "+temp);
			}
			set.add(numbers[i]);
		}
		System.out.println("done");
	}
	
	public static int factorial(int x) {
		if(x==1 || x==0)
			return 1;
		System.out.println("x-:"+x);
		return x * factorial(x-1);
	}
}
