package com.vikash.datastructure.doublLinkedList;

import java.util.NoSuchElementException;

public class DoubleLinkedList implements NodeInterface {
//https://www.sanfoundry.com/java-program-implement-doubly-linked-list/
	Node head;
	Node tail;
	private int lenth;
	
	 
	
	@Override
	public boolean isEmpty() {
		if(lenth==0)
			return true;
		return false;
	}

	@Override
	public int getSize() {
		return lenth;
	}

	@Override
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			//head=newNode;
			tail = newNode;
		}else {
			head.previous=newNode;
			newNode.next=head;
			//head=newNode;
		}
		head=newNode;
		lenth++;
	}

	@Override
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			addFirst(val);
		}else {
			newNode.previous=tail;
			tail.next=newNode;
		}
		tail = newNode;
		lenth++;
	}

	@Override
	public void addGivenPosition(int val, int position) {
		Node newNode = new Node(val);
		if (position == 1) {
			addFirst(val);
			return;
		}else if(position==getSize()) {
			addLast(val);
		}else if (position < 1 || position > getSize()) {
			throw new ArrayIndexOutOfBoundsException("Insertion of new Node not possible!!");
		} else {
			Node temp = head;
			for (int i = 2; i <= getSize(); i++) {
				if (i == position) {
					Node current = temp.next;
					newNode.previous = temp;
					temp.next = newNode;
					newNode.next = current;
					current.previous = newNode;
				}
				temp = temp.next;
			}
			lenth++;
		}
		
	}

	@Override
	public void deleteFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException("Deletion is not possible!!");
		}else if (head==tail){
			head=null;
			tail =null;
		}else {
			Node temp = head;
			head.next.previous=null;
			head = head.next;
			temp.next=null;
			System.out.println("Node with "+temp.data + " is deleted!!");
		}
		lenth--;
	}

	@Override
	public void deleteLast() {
		if(isEmpty()) {
			throw new NoSuchElementException("Deletion is not possible!!");
		}else if(tail==head) {
			tail = null;
			head=null;
		}else {
			Node temp = tail;
			tail.previous.next=null;
			tail = tail.previous;
			temp.previous=null;
			System.out.println("Node with "+temp.data + " is deleted!!");
		}
		lenth--;
	}

	@Override
	public void deleteAtGivenPosition(int position) {
		if(position < 1 || position > getSize()) {
			System.out.println("Deletion is not possible!!");
		}else if(position==1) {
			deleteFirst();
		}else if(position==getSize()) {
			deleteFirst();
		}else {
			Node temp = head;
			for (int i = 2; i < getSize() ; i++) {
				if(i==position) {
					Node current = temp.next;
					temp.next=current.next;
					current.next.previous=temp;
				}
				temp = temp.next;
			}
			lenth--;
		}
	}

	@Override
	public void displayList() {
		int count=0;
		if(isEmpty()) {
			System.out.println("Display is not possible!! No elements in the linked list.");
		}else {
			Node temp = head;
			System.out.print("Head==>");
			while (temp != null) {
				System.out.print(temp.data +"<==>");
				temp = temp.next;
				count++;
				if (count >= 20)
					break;
			}
			System.out.print("Null");
		}
	}
	

	@Override
	public void createList() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth= new Node(50);
		
		head=first;
		tail = first;
		
		first.next=second;
		second.previous=first;
		tail = second;
		
		second.next=third;
		third.previous=second;
		tail=third;
		
		third.next=fourth;
		fourth.previous=third;
		tail =fourth;
		
		fourth.next=fifth;
		fifth.previous=fourth;
		tail=fifth;
		lenth=5;
		
	}

	@Override
	public boolean contains(int key) {
		if(isEmpty()) {
			return false;
		}else {
			Node temp = head;
			for (int i = 1; i <= getSize() ; i++) {
				if(temp.data==key) {
					System.out.println("Value "+key +" is available in the double linked list!!!");
					return true;
				}
				temp=temp.next;
			}
		}
		return false;
	}

	@Override
	public void reverseLinkedList() {
		if(isEmpty()) {
			System.out.println("Printing of double linked list in reverse order is not possible!!");
		}else {
			Node temp = tail;
			while(temp.previous!=null) {
				System.out.print("<=" +temp.data);
				temp=temp.previous;
			}
			System.out.print("<="+temp.data);
		}
	}

	@Override
	public Node getMiddleNode() {
		int size = getSize();
		int requiredPos = size % 2;
		System.out.println("Required Position : "+requiredPos);
		Node temp = head;
		for (int i = 1; i <= size ; i++) {
			if(requiredPos==i) {
				return temp;
			}
			temp = temp.next;
		}
			
		return null;
	}

	@Override
	public void createLoop() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth= new Node(50);
		
		head=first;
		tail = first;
		
		first.next=second;
		second.previous=first;
		tail = second;
		second.next=third;
		third.previous=second;
		tail=third;
		
		third.next=fourth;
		fourth.previous=third;
		tail =fourth;
		
		fourth.next=fifth;
		fifth.previous=fourth;
		tail=fifth;
		
		// Creating loop
		head.previous=tail;
		tail.next=head;
		
		
		lenth=5;
	}

	@Override
	public boolean detectLoop() {
		// If list is empty or has only one node without loop
		if (head == null || head.next == null) {
			return false;
		}
		Node slowPtr = head;
		Node fastPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				return true;
		}
		return false;

	}
}

//https://www.codesdope.com/course/data-structures-doubly-linked-lists/
//https://github.com/deepak-malik/Data-Structures-In-Java/tree/master/src/com/deepak/data/structures/LinkedList
