package com.vikash.datastructure.singleLinkedList;

public class Util {
	public static void displayList(Node head) {
		int count = 0;
		if (head == null) {
			return;
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
			count++;
			if (count > 37)
				break;
		}
		System.out.print("Null\n");
	}
}
