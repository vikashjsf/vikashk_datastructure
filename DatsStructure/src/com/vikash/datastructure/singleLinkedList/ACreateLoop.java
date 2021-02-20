package com.vikash.datastructure.singleLinkedList;

public class ACreateLoop {
	
	static Node head=null;
	public static void main(String[] args) {
		createLoop();
		boolean loopStatus = detectLoop();
		System.out.println("Loop Status : "+loopStatus);
		Util.displayList(head);
		System.out.println("=================");
		removeLoop();
		Util.displayList(head);
	}
	
	//Used to create the loop in linked List
		public static void createLoop() {
			Node first = new Node(1);
			Node second = new Node(2);
			Node third = new Node(3);
			Node fourth = new Node(4);
			Node fifth = new Node(5);
			Node sixth = new Node(6);
			
			head = first;
			first.next = second;
			second.next = third;
			third.next = fourth;
			fourth.next = fifth;
			fifth.next = sixth;
			sixth.next=third;
		}
		
		public static boolean detectLoop() {
			// If list is empty or has only one node without loop
			if (head == null || head.next == null) {
				return false;
			}
			Node slowPtr =	head;
			Node fastPtr = 	head;
			while(fastPtr!=null && fastPtr.next!=null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
				if(slowPtr==fastPtr)
					return true;
			}
			return false;
		}
		
		// Remove the loop
		public static void removeLoop() {
			// If list is empty or has only one node without loop
			if (head == null || head.next == null) {
				return;
			}
			Node slowPtr = head;
			Node fastPtr = head;
			
			while(fastPtr!=null && fastPtr.next!=null) {
				
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
				
				if(slowPtr==fastPtr) {
					removeLoop(slowPtr, head);
					break;
				}
			}
			
			/* since fast->next is the looping point !! so it will remove the loop */
			//fastPtr.next = null;
		}
		
		// Function to remove loop 
	   public static void removeLoop(Node loop, Node head) 
	    { 
	        Node ptr1 = loop; 
	        Node ptr2 = loop; 
	  
	        // Count the number of nodes in loop 
	        int k = 1, i; 
	        while (ptr1.next != ptr2) { 
	        	ptr1 = ptr1.next; 
	            k++; 
	        } 
	        System.out.println("Total Number of Nodes in the loop :" + k);
	        // Fix one pointer to head 
	        ptr1 = head; 
	  
	        // And the other pointer to k nodes after head 
	        ptr2 = head; 
	        for (i = 0; i < k; i++) { 
	            ptr2 = ptr2.next; 
	        } 
	  
	        /*  Move both pointers at the same pace, 
	         they will meet at loop starting node */
	        while (ptr2 != ptr1) { 
	            ptr1 = ptr1.next; 
	            ptr2 = ptr2.next; 
	        } 
	  
	        // Get pointer to the last node 
	        while (ptr2.next != ptr1) { 
	            ptr2 = ptr2.next; 
	        } 
	  
	        /* Set the next node of the loop ending node 
	         to fix the loop */
	        ptr2.next = null; 
	    } 
}
