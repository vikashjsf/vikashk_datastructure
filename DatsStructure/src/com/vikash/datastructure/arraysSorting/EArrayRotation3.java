//Program for array rotation using reversal Algorithm
package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class EArrayRotation3 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int noOfRotaiton = 2;
		usingReversalAlgorithm(arr, noOfRotaiton-1);
		
	}
	
	public static void usingReversalAlgorithm(int [] arr,int d) {
		System.out.println("Given Arrays : "+Arrays.toString(arr));
		 revers(arr, 0, d);
		 System.out.println("Left elements revers : "+Arrays.toString(arr));
		 revers(arr, d+1, arr.length-1);
		 System.out.println("Righ elements revers : "+Arrays.toString(arr));
		 revers(arr, 0, arr.length-1);
		 System.out.println("Required elements : "+Arrays.toString(arr));
	}
	
	public static void revers(int [] arr, int start,int end) {
		int temp ;
		while(start<end) {
			temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
