package com.greatlearning.dsa;

class Node {

	int val;
	Node left, right;

	public Node(int item) {
		val = item;
		left = right = null;
	}

}

public class NodeEx {


	static public Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void skewedBT(Node root, int order) {


		if (root == null) {
			return;
		}


		if (order > 0) {
			skewedBT(root.right, order);
		} else {
			skewedBT(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			skewedBT(leftNode, order);
		} else {
			skewedBT(rightNode, order);
		}
	}

	static void travRightSkew_asc(Node root) {
		if (root == null) {
			return;
		}
		if (root.right != null && root.val > root.right.val) {
			int temp;
			temp = root.val;
			root.val = root.right.val;
			root.right.val = temp;

		}
		System.out.print(root.val + " ");
		travRightSkew_asc(root.right);
	}
	
	static void travRightSkewed(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.val + " ");
		travRightSkewed(root.right);
	}

}