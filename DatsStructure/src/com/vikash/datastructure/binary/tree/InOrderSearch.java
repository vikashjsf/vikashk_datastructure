//Find n-th node of inorder traversal
package com.vikash.datastructure.binary.tree;

public class InOrderSearch {
	static int count = 0;
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
		System.out.println("In Order Traversal");
		binaryTree.inOrder(binaryTree.root);
		System.out.println();
		inOrderTraversal(binaryTree.root,4);
	}
	
	public static void inOrderTraversal(TreeNode root,int nNode) {
		 if(root==null) {
			 return ;
		 }else {
			 if(count <= nNode) {
				 inOrderTraversal(root.left, nNode);
				 count++;
				 if(count==nNode)
					 System.out.println(nNode+" Node value is :"+root.data);
				 inOrderTraversal(root.right, nNode);
			 }
		 }
	}
	
	
	
}
