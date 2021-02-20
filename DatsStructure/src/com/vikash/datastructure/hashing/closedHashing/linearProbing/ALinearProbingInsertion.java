package com.vikash.datastructure.hashing.closedHashing.linearProbing;

import java.util.Arrays;
import java.util.Random;

public class ALinearProbingInsertion {
	
	static int arrSize = 5;
	static int[] arr = new int[arrSize];
	static int noOfElement = 0;
	public static void main(String[] args) {
		linearProbingInsertion(50);
		linearProbingInsertion(70);
		linearProbingInsertion(76);
		linearProbingInsertion(85);
		linearProbingInsertion(92);
		
		System.out.println("After Insertion Using Linear Probing::" + Arrays.toString(arr));
		System.out.println("Total Number of Elements :" + getSize());
		clear();
		System.out.println("Afte Clear Given array ::"+Arrays.toString(arr));
	}
	
	static {
		// Initializing with -1 the hash table
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
		System.out.println("Initial Arrays :" + Arrays.toString(arr));
	}
	
	public static void linearProbingInsertion(int value) {
		int key = value % arrSize;
		int index = key;
		int i = 1;
		while (arr[index] != -1) {
			index = (key + i) % arrSize;
			if (index == key) {
				System.out.println("Hash table is full!!!");
				return;
			}
			i++;
		}
		//System.out.println("i::"+i +" value:: "+value);
		arr[index] = value;
		noOfElement = noOfElement + 1;
	}
	
	public static void clear() {
		arr = new int[arrSize];
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
	}
	
	public static int getSize() {
		return noOfElement;
	}
	
}
/*
	The main disadvantage of primary clustering (linear probing) is cluster formation, 
	more number of elements form a group for which it takes time to search and find a free slot in the table.
	If we see in the big picture it will slow down our application.
	To overcome this issue secondary clustering (quadratic probing) is used.

*/