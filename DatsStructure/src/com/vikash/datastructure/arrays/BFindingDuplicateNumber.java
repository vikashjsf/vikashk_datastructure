//How to find duplicate number on Integer array in Java
package com.vikash.datastructure.arrays;

import java.util.HashSet;
import java.util.Set;

public class BFindingDuplicateNumber {
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("***  Using two for loop ***");
		firstWay(arr);
		System.out.println("SecondWay Using Set Interface ");
		secondWay(arr);
		System.out.println("Third Way Using sum formula");
		thirdWay(new int[]{1,2,3,5});
	}
	
	//Using two for loop
	public static void firstWay(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Number is : "+arr[i]);
				}
			}
		}
	}
	
	//Using Set interface
	public static void secondWay(int[]arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer n : arr) {
			if(!set.add(n)){
				System.out.println("Duplicate Number is : "+n);
			}
		}
	}
	//Using sum formula - application for 1 2 3 -- N - it will find only one duplicate number
	public static void thirdWay(int[] arr) {
		int n = arr.length,sum=0, total;
		for (int i : arr) {
			sum = sum+i;
		}
		total = ((n+1)*(n+2))/2;
		System.out.println("Missing Number is : "+(total-sum));
	}
}
