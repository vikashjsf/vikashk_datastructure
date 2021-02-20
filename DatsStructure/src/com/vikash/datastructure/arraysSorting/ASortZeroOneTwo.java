/*
Sort an array of 0s, 1s and 2s (Simple Counting)
Input :  {0, 1, 2, 0, 1, 2}
Output : {0, 0, 1, 1, 2, 2}*/

package com.vikash.datastructure.arraysSorting;

import java.util.Arrays;

public class ASortZeroOneTwo {
	public static void main(String[] args) {
		int [] arr = {0, 1, 2, 0, 1, 2,0,0,0,1,2,2};
		//sortMyLogic1(arr);
		//sortMyLogic2(arr);
		//sortArrays(arr);
		usingDautchNationFlagAlgorithm(arr);
		System.out.println(Arrays.toString(arr));
	}
	// Dutch national flag algorithm and time complexity is order of n
	// https://java2blog.com/sort-array-of-0s-1s-and-2s/
	private static void usingDautchNationFlagAlgorithm(int[] arr) {
		int low=0,mid=0,high = arr.length-1;
		int temp;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high]=temp;
				high--;
				break;
			default:
				break;
			}
		}
	}
	
	public  static void swap(int first, int second) {
		int temp = first;
		first = second;
		second=temp;
	}

	public static void sortMyLogic1(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>=arr[j]) {
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//n square time complexity
	public static void sortMyLogic2(int[]arr) {
		int [] frq = new int[3];
		int count=0;
		for (int num : arr) {
			frq[num]++;
		}
		System.out.println("Arrays:"+Arrays.toString(frq));
		for (int i = 0; i < frq.length; i++) {
			while(frq[i]-->0) {
				System.out.println(frq[i]-->0);
				arr[count]=i;
				count++;
			}
		}
		
	}
	
	//Time complexity is : theta n square
	public static void sortArrays(int[] arr) {
		int count0 = 0, count1 = 0, count2 = 0;
		for (int i : arr) {
			switch (i) {
			case 0:
				count0++;
				break;
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			default:
				break;
			}
		}
		System.out.println("Count0:"+count0 +" Count1:"+count1 +" Count2:"+count2);
		
		for (int i = 0; i < count0; i++) {
			arr[i]=0;
		}
		for (int i = count0; i < (count0+count1); i++) {
			arr[i]=1;
		}
		for (int i = (count0+count1); i < arr.length-1; i++) {
			arr[i]=2;
		}
	}
	// We traverse the array two times. Time complexity will be O(n).
}
