package com.vikash.datastructure.doublLinkedList;

import java.util.Scanner;

public class DLLDriverClass {
		public static void main(String[] args) {
		boolean status= true;
		DoubleLinkedList list  = new DoubleLinkedList();
		Scanner sc = new Scanner(System.in);
		while(status) {
			System.out.println("0 Create Double Linked List With Some default Values.");
			System.out.println("1 Insert at First of the list. ");
			System.out.println("2 Insert at End  of the list. ");
			System.out.println("3 Insert at Given postion of the list.");
			System.out.println("4 Delete at First.");
			System.out.println("5 Delete at Last.");
			System.out.println("6 Delete at Given position.");
			System.out.println("7 Display the Elements of double linked List.");
			System.out.println("8 Get list Size.");
			System.out.println("9 Check Whether given Value Present or not!!");
			System.out.println("10 Reverse LinkedList!!");
			System.out.println("11 Get the first elements of double linked list");
			System.out.println("12 Get the last elements of double linked list");
			System.out.println("13 Exit.");
			System.out.println("14 Get Middle Node.");
			System.out.println("15 Create the loop.");
			System.out.println("16 Detect the loop status.");
			System.out.println("Enter you Choice.");
			int choice = sc.nextInt();
			int positition,val;
			switch (choice) {
			case 0:
				list.createList();
				break;
			case 1:
				System.out.println("Enter the Value to add first!!");
				list.addFirst(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the Value to add last!!");
				list.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter the Value to add at given position:");
				val =sc.nextInt();
				System.out.println("Enter the postion.");
				positition=sc.nextInt();
				list.addGivenPosition(val, positition);
				break;
			case 4:
				list.deleteFirst();
				break;
			case 5:
				list.deleteLast();
				break;
			case 6:
				System.out.println("Enter the postion.");
				positition=sc.nextInt();
				list.deleteAtGivenPosition(positition);
				break;
			case 7:
				list.displayList();
				break;
			case 8:
				System.out.println("List Size is : "+list.getSize());
				break;
			case 9:
				System.out.println("Enter the Node value to check!!");
				System.out.println("Value Status : "+list.contains(sc.nextInt()));
				break;
			case 10:
				list.reverseLinkedList();
				break;
			case 11:
				System.out.println("Head/First Elements :"+list.head.data);
				break;
			case 12:
				System.out.println("Last/tail Elements :"+list.tail.data);
				break;
			case 13:
				status=false;
				break;
			case 14:
				System.out.println("Middle Element is :"+list.getMiddleNode().data);
				break;
			case 15:
				list.createLoop();
				System.out.println("Loop has been created!!");
				break;
			case 16:
				boolean flag=list.detectLoop();
				System.out.println("Loop status is :"+flag);
				break;
			default:
				System.out.println("Envalid Entry!!");
				break;
			}
			System.out.println("\n\n\n");
		}
		System.out.println("Bye Bye Bye!!!!");
	}

}
