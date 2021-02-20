package com.vikash.datastructure.singleLinkedList;

import java.util.Scanner;

public class DriverClass01 {
	public static void main(String[] args) {
		boolean status= true;
		SingleLinkedList list  = new SingleLinkedList();
		Scanner sc = new Scanner(System.in);
		while(status) {
			System.out.println("******");
			System.out.println("0 Create Single Linked List With Some Values.");
			System.out.println("1 Insert at First of the list. ");
			System.out.println("2 Insert at End   of the list. ");
			System.out.println("3 Insert at Given postion of the list.");
			System.out.println("4 Delete at First.");
			System.out.println("5 Delete at Last.");
			System.out.println("6 Delete at Given position.");
			System.out.println("7 View List.");
			System.out.println("8 Get list Size.");
			System.out.println("9 Value Check Present or not!!");
			System.out.println("10 Reverse LinkedList!!");
			System.out.println("11 Exit.");
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
				Util.displayList(list.head);
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
				status=false;
				break;
			default:
				System.out.println("Envalid Entry!!");
				break;
			}
		}
		System.out.println("Bye Bye Bye!!!!");
	}
}
