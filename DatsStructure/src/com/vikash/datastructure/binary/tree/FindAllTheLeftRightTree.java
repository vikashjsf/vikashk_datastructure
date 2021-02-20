package com.vikash.datastructure.binary.tree;

public class FindAllTheLeftRightTree {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(25);
		binaryTree.insert(20);
		binaryTree.insert(36);
		binaryTree.insert(10);
		binaryTree.insert(22);
		binaryTree.insert(30);
		binaryTree.insert(40);
		binaryTree.insert(5);
		binaryTree.insert(12);
		binaryTree.insert(28);
		binaryTree.insert(38);
		binaryTree.insert(48);
		System.out.println("In Order Traversal");
		//inOrderPrintLeftNode(binaryTree.root);
		inOrderPrintRightNode(binaryTree.root);
		System.out.println();
	}
	
	public static void inOrderPrintLeftNode(TreeNode root) {
		if(root!=null) {
			inOrderPrintLeftNode(root.left);
			System.out.print(root.data +"-->");
			//inOrder(root.right);
		}
	}
	
	public static void inOrderPrintRightNode(TreeNode root) {
		if(root!=null) {
			//inOrderPrintLeftNode(root.left);
			inOrderPrintRightNode(root.right);
				System.out.print(root.data +"-->");
		}
	}
}
