package com.vikash.datastructure.binary.tree;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public int data;

	public TreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TreeNode [left=" + left + ", right=" + right + ", data=" + data + "]";
	}
}
