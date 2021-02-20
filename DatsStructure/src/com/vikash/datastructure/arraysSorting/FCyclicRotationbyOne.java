package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class FCyclicRotationbyOne {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		cyclicRotationByOne(arr);
	}
	
	public static void cyclicRotationByOne(int[]arr) {
		int temp = arr[arr.length-1];
		System.out.println("Befor : "+Arrays.toString(arr));
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]=temp;
		System.out.println("After : "+Arrays.toString(arr));
		
	}
}
/*

Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.

Time Complexity: O(n) As we need to iterate through all the elements
Auxiliary Space: O(1)

*/