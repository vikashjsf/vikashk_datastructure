package com.vikash.datastructure.singleLinkedList;

import java.util.Stack;

public class DPalindromCheck {
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(0);
		list.addFirst(2);
		list.addFirst(1);
		Util.displayList(list.head);
		palindormCheck(list.head);
		System.out.println("Main Finished!!");
	}
	public static void palindormCheck(Node head) {
		Stack<Integer> stack = new Stack<>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		System.out.println("Stack : " + stack);
		boolean isPalindrom = false;
		while (head != null) {
			int data = stack.pop();
			System.out.println("Data: " + data + " head.data: " + head.data);
			if (data == head.data) {
				isPalindrom = true;
			} else {
				isPalindrom = false;
				break;
			}
			head = head.next;
		}
		if (isPalindrom)
			System.out.println("Given data is palindrom!!");
		else
			System.out.println("Given data is not palnidrom!!!");
	}
}
