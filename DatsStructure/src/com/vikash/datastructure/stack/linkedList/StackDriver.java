package com.vikash.datastructure.stack.linkedList;

import java.util.Scanner;

public class StackDriver {
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("----------------------");
			System.out.println("1 Check Stack is empty!!");
			System.out.println("2 Stack Size!");
			System.out.println("3 Push the Element into the Stack");
			System.out.println("4 Pop the top Elements!");
			System.out.println("5 Peek the top Element of the Stack");
			System.out.println("6 Display");
			System.out.println("7 Exit");
			System.out.println("Enter the Choice:");
			switch (sc.nextInt()) {
			case 1:
				String st = stack.isEmpty() == true ? "Stack is Empty" : "Stack is not Empty!";
				System.out.println(st);
				break;
			case 2:
				System.out.println("Size of the Stack is :" + stack.getLength());
				break;
			case 3:
				System.out.println("Enter the Element to push into the Stack:");
				int data = sc.nextInt();
				stack.push(data);
				break;
			case 4:
				System.out.println("Pop Element :" + stack.pop());
				break;
			case 5:
				System.out.println("Top Element :" + stack.peek());
				break;
			case 6:
				stack.display();
				break;
			case 7:
				status = false;
				break;
			default:
				System.out.println("Invalid Entry!!");
				break;
			}
		}
	}
}
