package com.vikash.datastructure.hashing.closedHashing.linearProbing;

import java.util.Arrays;
import java.util.Random;

public class CLinearProbingDeletion {
	static int arrSize = 5;
	static int[] arr = new int[arrSize];
	
	static {
		// Initializing with -1 the hash table
		for (int i = 0; i < arrSize; i++) {
			arr[i] = -1;
		}
		System.out.println("Initial Arrays :" + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		linearProbingInsertion(50);
		linearProbingInsertion(700);
		linearProbingInsertion(76);
		linearProbingInsertion(85);
		linearProbingInsertion(92);
		
		System.out.println("After Insertion Using Linear Probing::" + Arrays.toString(arr));
		linearProbingDeletion(50);
		linearProbingDeletion(76);
		linearProbingDeletion(100);
		System.out.println("After Deletion Using Linear Probing::" + Arrays.toString(arr));
	}
	
	public static void linearProbingDeletion(int value) {
		int key = value % arrSize;
		int index = key;
		int i = 1;
		// if the value not found then check in the next index
		while (arr[index] != value) {
			index = (key + i) % arrSize;
			if (index == key) {
				System.out.println(value + " Value not found!!");
				return;
			}
			i++;
		}
		// if the value found then simply assign at that index as zero or -1
		System.out.println(value +" deleted at index :"+index);
		arr[index] = -1;
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
		arr[index] = value;
	}
}
