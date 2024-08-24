package tree;

import java.util.Arrays;

public class Tree {

	private Node rootNode;

	public static class Node {
		public int data;
		public Node left;
		public Node right;

		public Node() {

		}

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public Node getTree() {
		return rootNode;
	}

	private Node insert(int data, Node rootNode) {
		
		if (rootNode == null) {
			Node node = new Node(data);
			System.out.print(node.data+" ");
			return node;
		}
		if (data > rootNode.data) {
			System.out.print(rootNode.data+"(RIGHT)---> ");
			rootNode.right = insert(data, rootNode.right);
		} else if (data < rootNode.data) {
			System.out.print(rootNode.data+"(LEFT)---> ");
			rootNode.left = insert(data, rootNode.left);
		}
		
		return rootNode;
	}

	public void insert(int data) {
		this.rootNode = insert(data, rootNode);
		System.out.println("");
	}

	public static Tree createBinarySearchTree(int[] arr) {
		Tree tree = new Tree();
		Arrays.stream(arr).boxed().forEach(e -> tree.insert(e));
		return tree;
	}

	public void inorderTraversal(Node rootNode) {

		if (rootNode == null) {
			return;
		}
		inorderTraversal(rootNode.left);
		System.out.print(rootNode.data+" --> ");
		inorderTraversal(rootNode.right);
	}

	public void inorderTraversal() {
		inorderTraversal(rootNode);
	}
	
	public void preorderTraversal() {
		preorderTraversal(rootNode);
	}
	
	public void postorderTraversal() {
		postorderTraversal(rootNode);
	}
	
	public void preorderTraversal(Node rootNode) {
		
		if(rootNode == null) {
			return;
		}
		System.out.print(rootNode.data+" --> ");
		preorderTraversal(rootNode.left);
		preorderTraversal(rootNode.right);
	}
	
	public void postorderTraversal(Node rootNode) {
		
		if(rootNode == null) {
			return;
		}
		preorderTraversal(rootNode.left);
		preorderTraversal(rootNode.right);
		System.out.print(rootNode.data+" --> ");
	}

}
