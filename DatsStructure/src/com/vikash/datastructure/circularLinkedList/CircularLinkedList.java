package com.vikash.datastructure.circularLinkedList;
public class CircularLinkedList implements NodeInterface {
	public Node head; // Points to the first node of the linked List
	public Node tail;//points to last node of the linked Linked List
	int length;
	
	@Override
	public boolean isEmpty() {
		if (length == 0 || head == null)
			return true;
		return false;
	}

	@Override
	public int getSize() {
		return length;
	}

	@Override
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else {
			Node temp = head;
			newNode.next=temp;
			head = newNode;
			tail.next=head;
		}
		length++;
	}

	@Override
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(isEmpty()) {
			addFirst(val);
		}else {
			Node temp = head;
			tail.next=newNode;
			tail = newNode;
			tail.next=temp;
			length++;
		}
	}

	@Override
	public void addGivenPosition(int val, int position) {
		if (position < 0 || position > length) {
			throw new IllegalArgumentException("Position is Invalid");
		}else if(head==null || position==1) {// adding at first position
			addFirst(val);
		}else if(length==position) {// adding at last
			addLast(val);
		} else {
			Node newNode = new Node(val);
			Node temp = head;
			Node prev = head;
			for (int i = 1; i < position; i++) {
				prev=temp;
				temp = temp.next;
			}
			newNode.next = temp;
			prev.next = newNode;
			length++;
		}
	}

	@Override
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("Deletion is not possible!!");
		}else {
			Node temp  = head;
			head=temp.next;
			tail.next=head;
			System.out.println("Deleted Node value :"+temp.data);
			temp=null;
			length--;
		}
	}

	@Override
	public void deleteLast() {
		if(isEmpty()) {
			System.out.println("Deletion is not possible!!");
		}else {
			Node prev = head;
			Node temp = tail;
			for (int i = 1; i <= getSize() ; i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next=temp.next;
			System.out.println("Deleted Node value :"+temp.data);
			temp=null;
			length--;
		}
	}

	@Override
	public void deleteAtGivenPosition(int position) {
		if(isEmpty()) {
			System.out.println("Deletion is not possible!!");
		}else if(position==getSize()) {
			deleteLast();
		} else {
			Node prev = head;
			Node temp = head;
			for (int i = 1; i < position ; i++) {
				prev = temp;
				temp = temp.next;
			}
			prev.next=temp.next;
			System.out.println("Deleted Node value :"+temp.data);
			temp=null;
			length--;
		}

	}
	
	// Method to display the circular linked list
	@Override
	public void displayList() {
		if(isEmpty()) {
			System.out.println("List is Empty !!");
		}else {
			Node temp = head;
			while(temp.next!=head) {
				System.out.print(temp.data+"==>");
				temp = temp.next;
			}
			System.out.print(temp.data +"\n");
		}
		System.out.println("Displaying required data done!!!");
	}

	@Override
	public void createList() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth= new Node(50);
		Node sixth= new Node(60);
		
		head = first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
		tail = sixth;
		tail.next=head;
		length=6;
		System.out.println("Circular Linked List has been created with some values!!!!");
	}

	@Override
	public boolean contains(int key) {
		Node temp = head;
		while(temp.next!=head) {
			if(temp.data==key) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}

	@Override
	public void reverseLinkedList() {
		if (head == null) {
			return;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		
		//will iterate length -1 times
		while (current.next!=current) { 
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			tail.next=current;
		}
		//for the last node of the circular linked list
		current.next = previous;
		previous = current;
		
		// Print reverse element
		if (isEmpty()) {
			return;
		}
		Node temp = previous;
		while (temp != null) {
			System.out.print(temp.data + "==>");
			temp = temp.next;
		}
		System.out.print("Null\n");
	}

	@Override
	public Node getMiddleNode() {
		int size = getSize();
		int requiredPos =size/2;
		System.out.println("Required Position : "+requiredPos);
		Node node = searchByIndex(requiredPos);
		return node;
	}
	@Override
	public Node searchByIndex(int index) {
		if (index < 0 || index > length) {
			throw new IndexOutOfBoundsException("Index is Invalid");
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
//https://github.com/deepak-malik/Data-Structures-In-Java/blob/master/src/com/deepak/data/structures/LinkedList/CircularLinkedList.java
//https://github.com/deepak-malik/Data-Structures-In-Java/tree/master/src/com/deepak/data/structures
}
