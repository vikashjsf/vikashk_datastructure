package dcom.doubl.circularLinkedList;

public class Node {
	int data;
	Node previous;
	Node next;

	public Node() {
	}

	public Node(int data) {
		this.data = data;
		previous = null;
		next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", previous=" + previous.data + ", next=" + next.data + "]";
	}
}
