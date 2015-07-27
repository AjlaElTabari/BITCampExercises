package predavanja1;

public class BinarySearchTree <T extends Comparable<T>> {
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}
	
	public void add(T value) {
		if (root == null) {
			root = new Node(value);
			return;
		} else {
			add(root, value);
		}
	}
	
	private void add(Node subRoot, T value) {
		if (value.compareTo(subRoot.value) <= 0) {
			if (subRoot.left == null) {
				subRoot.left = new Node(value);
				return;
			}
			add(subRoot.left, value);
		} else {
			if (subRoot.right == null) {
				subRoot.right = new Node(value);
				return;
			}
			add(subRoot.right, value);
		}
	}
	
	public void printTree() {
		printTree(root);
	}
	
	public void printTree(Node subRoot) {
		if (subRoot == null) {
			return;	
		}
			printTree(subRoot.left);
			System.out.println(subRoot.value);
			printTree(subRoot.right);
	}
	
	public String toString() {
		
	}
	
	private String toString(Node subRoot, String str) {
		if()
	}
	
	private class Node {
		public T value;
		public Node left;
		public Node right;
		
		public Node(T value) {
			this.value = value;
		}
		
		public String toString() {
			return this.value + "";
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(5);
		bst.add(8);
		bst.add(3);
		bst.add(98);
		bst.add(-6);

		bst.printTree();
	}
}
