/*
Given an array of integers, find two numbers such that they add up to a specific target
number.
The function twoSum should return indices of the two numbers such that they add
up to the target, where index1 must be less than index2. Please note that your returned
answers (both index1 and index2) are not zero-based.
For example:
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=0, index2=1
*/
package com.vikash.datastructure.arraysSorting;

import java.util.HashMap;

public class Hf {
	public static void main(String[] args) {
		
	}
	
	public static int[] returnIndex(int[]arr,int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				result[0]=arr[i];
				result[1]=i;
			}else {
				map.put(target-arr[i], i);
			}
			
		}
		return null;
	}
}
