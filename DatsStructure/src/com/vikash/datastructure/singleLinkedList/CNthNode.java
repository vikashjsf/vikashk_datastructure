package com.vikash.datastructure.singleLinkedList;

import java.util.Random;

public class CNthNode {
	
	public static void main(String[] args) {
		SingleLinkedList list = new  SingleLinkedList();
		Random random = new Random();
		for (int i = 1; i <=10; i++) {
			list.addFirst(random.nextInt(100));
		}
		Util.displayList(list.head);
		nthNodeFromTheEnd(6, list.size,list.head);
	}
	
	// Nth Node from the end
	public static void nthNodeFromTheEnd(int n,int size,Node head) {
		// check if value of n is not more than length of the linked list
		if (size < n)
			return;

		int nThNode = size - n + 1;
		Node temp = head;
		for (int i = 1; i < nThNode; i++) {
			temp = temp.next;
		}
		System.out.println( n+ "th Node from the end is :" + temp.data);
	}
}
