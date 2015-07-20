package vjezbe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList <T> {
	private Node head;
	
	public void add(T value) {
		if (head == null) {
			head = new Node(value);
		} else {
			getLastNode().setNextNode(new Node(value));
		}
	}
	
	public T get(int index) {
		Node temp = head;
		
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		return temp.getValue();
	}
	
	private Node getLastNode() {
		if (head == null) {
			return null;
		}
		
		Node temp = head;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	public void remove(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.getNextNode();
		}
		
		Node previous = getPreviousNode(temp);
		
		previous.setNextNode(temp.getNextNode());
	}
	
	public void remove(T elem) {
		Node temp = head;
		while (temp.getNextNode() != null) {
			if (temp.next.getValue().equals(elem)) {
				temp.setNextNode(temp.next.next);
				break;
			} else {
				temp = temp.next;
			}
		}
	}
	
	public Node getPreviousNode(Node n) {
		if (n == head) {
			return null;
		}
		
		Node temp = head;
		while (temp.getNextNode() != n) {
			temp = temp.getNextNode();
		}
		
		return temp;
	}
	
	public void addAll(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while(it.hasNext()) {
			add(it.next());
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		if (head == null) {
			result += head.getValue(); 
		}
		Node tmp = head;
		while (tmp != null) {
			result += tmp.getValue() + " ";
			tmp = tmp.next;
		}
		
		return result;
	}
	
	private class Node {
		private T value;
		private Node next;
		
		public Node(T value) {
			this.value = value;
		}
		
		public T getValue() {
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
			return head.getValue() + "";
		}
	}
	
	public static void main(String[] args) {
		
		MyLinkedList<String> strings = new MyLinkedList<>();
		
		strings.add("Gordan");
		strings.add("Zaid");
		strings.add("Amra");
		strings.add("Edvin");
		System.out.println("1: " + strings);
		
		strings.remove("Amra");
		System.out.println("2: " + strings);
		
		ArrayList<String> newStrings = new ArrayList<>();
		newStrings.add("Kristina");
		newStrings.add("Mladen");
		newStrings.add("Kerim");
		newStrings.add("Adis");
		
		strings.addAll(newStrings);
		System.out.println("3: " + strings);
	}

}
