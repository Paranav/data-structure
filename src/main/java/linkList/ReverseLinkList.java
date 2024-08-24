package linkList;

public class ReverseLinkList {
	
	public static Node reverseLinkList(Node currentNode, Node prvNode) {
		
		
		if(currentNode.nextNode ==  null) {
			currentNode.nextNode = prvNode;
			return currentNode;
		}
		
		Node tempNode = currentNode.nextNode;
		currentNode.nextNode = prvNode;
		return reverseLinkList(tempNode, currentNode);
	}

	public static void main(String[] args) {
		
		Node root = new Node(new Node(new Node(2),1),0);
		
		root.printLinkedNode();
		
		Node reversedRoot = reverseLinkList(root, null);
		
		System.out.println();
		reversedRoot.printLinkedNode();

	}

}
