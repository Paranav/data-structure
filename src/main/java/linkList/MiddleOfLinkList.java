package linkList;

public class MiddleOfLinkList {

	public static Node middleNode(Node rootNode) {

		Node slowNode = rootNode;
		Node fastNode = rootNode;

		while (fastNode != null && fastNode.nextNode != null) {
			slowNode = slowNode.nextNode;
			fastNode = fastNode.nextNode.nextNode;
		}

		return slowNode;
	}

	public static void main(String[] args) {

		Node root = new Node(new Node(new Node(new Node(new Node(new Node(5), 4), 3), 2), 1), 0);

		Node node = middleNode(root);
		System.out.println(node.data);

	}

}
