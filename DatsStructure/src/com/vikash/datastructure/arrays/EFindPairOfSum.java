//How to find all pairs on integer array whose sum is equal to given number?
package com.vikash.datastructure.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class EFindPairOfSum {
	public static void main(String[] args) {
		Integer[] numbers = { 1,2, 4, 3, 5,6,7, 8, 9 };
		int targetSum = 10;
		checkPariOfSum(numbers, targetSum);
		System.out.println("******* Other method******");
		checkPariOfSum1(numbers, targetSum);
		System.out.println("******** Using Hashing ********");
		checkPariOfSum2(numbers, targetSum);
	}
	
	//Simple Approach - my logic time complexity = big Oh n squre
	public static void checkPariOfSum(Integer[] arr, int sumValue) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int res = arr[i]+arr[j];
				if(res==sumValue) {
					System.out.println(arr[i] +","+arr[j] +"->"+sumValue);
				}
			}
		}
	}
	
	//Other approach n(logn)
	//[1, 2, 3, 4, 5, 6, 7, 8, 9]
	public static void checkPariOfSum1(Integer[] arr, int targetValue) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int start=0, high = arr.length-1,sum=0;
		while(start<high) {
			sum = arr[start]+arr[high];
			if(sum==targetValue) {
				System.out.println(arr[start] +","+arr[high] +"->"+targetValue);
				start++;
				high--;
			}else if(sum > targetValue)
				high--;
			else // sum < targetValue
				start++;
		}
	}
	
	//Using Java implementation using Hashing big oh n
	public static void checkPariOfSum2(Integer[] arr, int targetValue) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		int temp;
		for (int i=0;i<arr.length;i++) {
			temp = targetValue-arr[i];
			if(temp>=0 && hashSet.contains(temp)) {
				System.out.println(arr[i] +","+temp +"->"+targetValue);
			}
			hashSet.add(arr[i]);
		}
	}
}
