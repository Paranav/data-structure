package tree;

public class InorderTraversal {

	public static void main(String[] args) {
		
		Tree tree = Tree.createBinarySearchTree(new int[] {5,2,6,4,1,3});
		
		System.out.println("\nInorder Traversal");
		tree.inorderTraversal();
		System.out.println("\nPost order traversal");
		tree.postorderTraversal();
		System.out.println("\nPre order traversal");
		tree.preorderTraversal();

	}

}
