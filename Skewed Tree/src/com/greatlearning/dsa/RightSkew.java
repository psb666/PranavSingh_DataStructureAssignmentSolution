package com.greatlearning.dsa;

class RightSkew {

	static Node node;
	static int order = 0;

	public static void main(String[] args) {

		RightSkew.node = new Node(50);
		RightSkew.node.left = new Node(30);
		RightSkew.node.right = new Node(60);
		RightSkew.node.left.left = new Node(10);
		RightSkew.node.right.left = new Node(40);
	NodeEx.skewedBT(node, order);

	System.out.println("Right Skewed Binary Tree inOrder traversal : ");
	NodeEx.travRightSkewed(NodeEx.headNode);
	System.out.println("");
	System.out.println("Right Skewed Binary Tree in ascending order : ");
	NodeEx.travRightSkew_asc(NodeEx.headNode);
		
	}
}