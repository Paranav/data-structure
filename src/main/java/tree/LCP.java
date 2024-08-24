package tree;

import java.util.Stack;

public class LCP {

	static class Node {
		int data;
		Node right;
		Node left;
	}

	public Integer findLCP(Node root, int data1, int data2, Stack<Integer> data1Container,
			Stack<Integer> data2Container) {

		findPathToNode(root, data1, data1Container);
		findPathToNode(root, data2, data2Container);

		Integer result = null;

		while (!data1Container.isEmpty() && !data2Container.isEmpty()) {
			Integer tempResult = data1Container.pop();
			if (result != data2Container.pop()) {
				break;
			}
			result = tempResult;
		}
		return result;
	}

	public boolean findPathToNode(Node root, int data, Stack<Integer> container) {

		if (root == null) {
			return false;
		}

		if (root.data == data || findPathToNode(root.left, data, container)
				|| findPathToNode(root.right, data, container)) {
			container.push(Integer.valueOf(root.data));
			return true;
		}

		return false;
	}

}
