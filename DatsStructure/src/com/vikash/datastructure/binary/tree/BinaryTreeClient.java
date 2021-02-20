package com.vikash.datastructure.binary.tree;

public class BinaryTreeClient {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(50);
		binaryTree.insert(17);
		binaryTree.insert(12);
		binaryTree.insert(23);
		binaryTree.insert(9);
		binaryTree.insert(14);
		binaryTree.insert(72);
		binaryTree.insert(54);
		binaryTree.insert(76);
		binaryTree.insert(67);
		
		TreeNode node=binaryTree.find(50);
		//System.out.println(node);
		
		//binaryTree.createBinaryTree();
		binaryTree.levelOrderTraversal(binaryTree.root);
		//binaryTree.inOrder(binaryTree.root);
		//binaryTree.postOrder(binaryTree.root);
		//binaryTree.preeOrder(binaryTree.root);
	}
}
