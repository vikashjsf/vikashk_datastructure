package com.vikash.datastructure.singleLinkedList;

import java.util.Random;

public class BMiddleNode {
	
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new  SingleLinkedList();
		BMiddleNode bMiddleNode = new BMiddleNode();
		Random random = new Random();
		for (int i = 1; i <=10; i++) {
			singleLinkedList.addFirst(random.nextInt(100));
		}
		Util.displayList(singleLinkedList.head);
		Node middle= bMiddleNode.getMiddleNode1(singleLinkedList.head);
		System.out.print("Middle Element : "+middle.data);
		bMiddleNode.deleteMiddleNode(singleLinkedList.head);
		System.out.println("After Deletion of middle Elements:");
		Util.displayList(singleLinkedList.head);
	}
	 
	// other Way to Get the middle Node/data in the linked list if the size has not provided
    public Node getMiddleNode1(Node head) {
          if(head==null){
                System.out.println("Linked List is empty!!");
                return head;
          }
          Node slow_prt = head;
          Node first_prt = head;
          while(first_prt!=null && first_prt.next!=null){
                first_prt=first_prt.next.next;
                slow_prt=slow_prt.next;
          }
          return slow_prt;
    }
	
	// Delete the middle Node/Data in the linked List
	public Node deleteMiddleNode(Node head) {
		// Base cases
		if (head == null)
			return null;
		if (head.next == null) {
			return null;
		}
		Node slow_prt = head;
		Node first_prt = head;
		Node prev = null;
		while (first_prt != null && first_prt.next != null) {
			first_prt = first_prt.next.next;
			prev = slow_prt;
			slow_prt = slow_prt.next;
		}
		System.out.println("Mid Elements :" + slow_prt.data + " and it is deleted!!");
		prev.next = slow_prt.next;
		return slow_prt;
	}
}
