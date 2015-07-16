package linked.lists;

public class LinkedListInt {
	private Node start;
	
	public LinkedListInt() {
		start = null;
	}
	
	public void add(int element) {
		if (start == null) {
			start = new Node(element);
		} else {
			Node last = getLastNode();
			
			last.setNextNode(new Node(element));
		}
	}
	
	public int get(int index) {
		Node temp = start;
		
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		
		return temp.getValue();
	}
	
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNextNode(temp.getNextNode());
	}
	
	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		
		return start.toString();
	}
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public Node getNextNode() {
			return next;
		}
		
		public void setNextNode(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			if (next == null) {
				return value + ""; 
			}
			
			return value + " " + next.toString();
		}
	}
}
