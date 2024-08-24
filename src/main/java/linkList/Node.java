package linkList;

public class Node {
	
	public Node nextNode;
	public int data;
	
	
	public Node(Node node, int data) {
		nextNode = node;
		this.data = data;
	}
	
	public Node(int data) {
		this.data = data;
		nextNode = null;
	}
	
	
	public void printLinkedNode() {
		Node node = this;
		do {
			System.out.print(node.data + " --> ");
			node = node.nextNode;
		} while (node != null);
	}

}
