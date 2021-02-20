//Write a program to reverse an array or string
package com.vikash.datastructure.StringDS;

import java.util.Arrays;

public class WReverseAnArrayOrString {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3,4,5};
		//System.out.println(Arrays.toString(arr));
		//reverseArray(arr);
		reverseUsingRecurison(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverseArray(int[] arr) {
		int sIndex = 0, eIndex = arr.length - 1, temp;
		while (sIndex < eIndex) {
			temp = arr[sIndex];
			arr[sIndex]=arr[eIndex];
			arr[eIndex]=temp;
			sIndex++;
			eIndex--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//Using Recursion
	public static void reverseUsingRecurison(int[] arr, int sIndex, int eIndex) {
		if (sIndex >= eIndex) {
			return ;
		}
		int temp;
		temp = arr[sIndex];
		arr[sIndex] = arr[eIndex];
		arr[eIndex] = temp;
		reverseUsingRecurison(arr, sIndex + 1, eIndex - 1);
	}
}
