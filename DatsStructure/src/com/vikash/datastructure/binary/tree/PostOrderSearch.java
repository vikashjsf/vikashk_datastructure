//Find n-th node of post-order traversal
package com.vikash.datastructure.binary.tree;

public class PostOrderSearch {
	static int count=0;
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
		System.out.println("Pre Order Traversal");
		binaryTree.postOrder(binaryTree.root);
		System.out.println();
		postOrderSearch(binaryTree.root, 5);
	}
	
	public static void postOrderSearch(TreeNode root,int nNode) {
		if(root==null) {
			return;
		}else {
			if(count <= nNode) {
				postOrderSearch(root.left, nNode);
				postOrderSearch(root.right, nNode);
				count++;
				if(count==nNode)
					 System.out.println(nNode+" Node value is : "+root.data);
			}
		}
	}
}
