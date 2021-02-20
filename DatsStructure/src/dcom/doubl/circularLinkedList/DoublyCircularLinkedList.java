package dcom.doubl.circularLinkedList;

public class DoublyCircularLinkedList implements NodeInterface {
	public Node head;
	public Node tail;
	public int length;

	@Override
	public boolean isEmpty() {
		return length == 0;
	}

	@Override
	public int getSize() {
		return length;
	}

	// adds new element to the first of the list
	@Override
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			head.previous = tail;
			tail.next = head;
		} else {
			newNode.next = head;
			head.previous = newNode;

			head = newNode;
			head.previous = tail;
			tail.next = head;
		}
		length++;
	}

	// adds new element to the last of the list
	@Override
	public void addLast(int val) {
		if (isEmpty()) {
			addFirst(val);
		} else {
			Node newNode = new Node(val);
			newNode.previous = tail;
			tail.next = newNode;
			tail = newNode;

			tail.next = head;
			head.previous = newNode;
			length++;
		}
	}

	// adds new element to the specified position
	@Override
	public void addGivenPosition(int val, int position) {
		Node newNode = new Node(val);
		if (position == 1) {
			addFirst(val);
			return;
		} else if (position < 1 || position > getSize()) {
			throw new ArrayIndexOutOfBoundsException("Insertion of new Node not possible!!");
		} else {
			Node temp = head;
			Node current = head;
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			temp = current.previous;

			newNode.previous = temp;
			temp.next = newNode;
			newNode.next = current;
			current.previous = newNode;
		}
		length++;
	}

	// removes the first element in the list
	@Override
	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("Deletion not possible as List is empty!!!");
		} else if (getSize() == 1) {
			head = null;
			tail = null;
		} else {
			Node temp = head;
			head = temp.next;
			head.previous = tail;
			tail.next = head;
			System.out.println("Deleted Node value is : "+temp.data);
			temp = null;
		}
		length--;
	}

	// removes the last element in this list
	@Override
	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("Deletion not possible as List is empty!!!");
		} else if (head.next == head) {
			head = null;
			tail = null;
		} else {
			Node temp = tail;
			tail = temp.previous;
			tail.next = head;
			head.previous = tail;
			System.out.println("Deleted Node value is : "+temp.data);
			temp = null;
		}
		length--;
	}

	// removes the element in the specified position
	@Override
	public void deleteAtGivenPosition(int position) {
		if (position < 1 || position > getSize()) {
			System.out.println("Deletion is not possible!!");
			return;
		} else if (position == 1) {
			deleteFirst();
		} else if (position == getSize()) {
			deleteLast();
		} else {
			Node temp = head;
			for (int i = 2; i < getSize(); i++) {
				if (i == position) {
					Node current = temp.next;
					temp.next = current.next;
					current.next.previous = temp;
				}
				temp = temp.next;
			}
			length--;
		}
	}

	// prints the elements of the list in a nicely formated manner in forward order
	@Override
	public void displayList() {
		int count = 0;
		if (isEmpty()) {
			System.out.println("Display is not possible!! No elements in the linked list.");
		} else {
			Node temp = head;
			System.out.print("Head<==>");
			while (temp.next != tail.next) {
				System.out.print(temp.data + "<==>");
				temp = temp.next;
				count++;
				if (count >= 20)
					break;
			}
			System.out.print(temp.data + "<==>Tail");
		}
	}
	
	// Creating doubly circular linked list with the given values
	@Override
	public void createList() {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

		head = first;
		tail = first;

		first.next = second;
		second.previous = first;
		tail = second;

		second.next = third;
		third.previous = second;
		tail = third;

		third.next = fourth;
		fourth.previous = third;
		tail = fourth;

		fourth.next = fifth;
		fifth.previous = fourth;
		tail = fifth;

		head.previous = tail;
		tail.next = head;

		length = 5;

	}
	// Checking whether given value is available or not in the given circular linked list
	@Override
	public boolean contains(int key) {
		Node temp = head;
		for (int i = 1; i <= getSize(); i++) {
			if (temp.data == key) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	// prints the elements of the list in a nicely formated manner in reverse order
	@Override
	public void reverseLinkedList() {
		int count = 0;
		if (isEmpty()) {
			System.out.println("Display is not possible!! No elements in the linked list.");
		} else {
			Node temp = tail;
			System.out.print("Tail==>");
			while (temp.previous != head) {
				System.out.print(temp.data + "<==>");
				temp = temp.previous;
				count++;
				if (count >= 20)
					break;
			}
			System.out.print(temp.previous.data + "<==>Head");
		}

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
}
//https://github.com/mentesnot/Circular-Doubly-Linked-List/blob/master/src/circular/doubly/linkedlist/CDoublyLinkedList.java