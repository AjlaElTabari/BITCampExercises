package vjezbe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<T> {
	private Node head;

	public T push(T value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node tmp = new Node(value);
			tmp.setNextNode(head);
			head = tmp;
		}
		return value;
	}
	
	public boolean empty() {
		return head == null;
	}

	public T peek() {
		return head.getValue();
	}
	
	public void addAll(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while(it.hasNext()) {
			this.push(it.next());
		}
	}

	public T pop() {
		if(head == null){
			throw new EmptyStackException();
		}
		
		T tmp = head.getValue();
		head = head.getNextNode();
		return tmp;
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
				
		ArrayList<String> newStrings = new ArrayList<>();
		newStrings.add("Kristina");
		newStrings.add("Mladen");
		newStrings.add("Kerim");
		newStrings.add("Adis");
		
		strings.addAll(newStrings);
		System.out.println("3: " + strings);
	}

}
