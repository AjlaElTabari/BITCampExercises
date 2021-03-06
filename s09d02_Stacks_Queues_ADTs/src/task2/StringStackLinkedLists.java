package task2;

import java.util.EmptyStackException;

/**
 * Represents a stack of String objects using linked lists Implements few
 * standard methods for stack manipulation
 * 
 * @author ajla.eltabari
 *
 */
public class StringStackLinkedLists {
	private Node head;

	/**
	 * Empty constructor Initialize head node to null (stack is empty)
	 */
	public StringStackLinkedLists() {
		head = null;
	}

	/**
	 * Checks if an head node is null (if stack is empty)
	 * 
	 * @returns true if an array is empty, and false if it is not
	 */
	public boolean empty() {
		return head == null;
	}

	/**
	 * Inserts new value at the end of the list
	 * 
	 * @param value
	 *            that needs to be added
	 * @returns added value
	 */
	public String push(String value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node tmp = new Node(value);
			tmp.setNext(head);
			head = tmp;
		}
		return value;
	}

	/**
	 * Returns last value on the stack
	 * 
	 * @return
	 * @throws EmptyStackException
	 *             in case that stack is empty
	 */
	public String peek() {
		return head.getValue();
	}

	/**
	 * Deletes last value from the stack
	 * 
	 * @returns deleted value
	 * @throws EmptyStackException
	 *             in case that stack is empty
	 */
	public String pop() {
		if (head == null) {
			throw new EmptyStackException();
		}

		String tmp = head.getValue();
		head = head.getNext();
		return tmp;
	}
	
	/**
	 * Returns the 1-based position where an object is on this stack. If the
	 * object o occurs as an item in this stack, this method returns the
	 * distance from the top of the stack of the occurrence nearest the top of
	 * the stack; 
	 * the topmost item on the stack is considered to be at distance 1.
	 */
//	public int search(String value) {
//		Node temp = head;
//		int position = 0;
//		while (temp.next != null) {
//			if (temp.value.equals(value)) {
//				return 
//			}
//		}
//		return -1;
//	}

	/**
	 * Prints out head node value
	 */
	public String toString() {
		if (head == null) {
			return "Stack is empty!";
		} else {
			return head.toString();
		}
	}

	/**
	 * Inner class that represents a node of linked list
	 * 
	 * @author ajla.eltabari
	 *
	 */
	private class Node {
		private String value;
		private Node next;

		/**
		 * Constructor that makes new node with received value and null pointer
		 * 
		 * @param value
		 */
		public Node(String value) {
			this.value = value;
			next = null;
		}

		// Getters and Setters
		/**
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next
		 *            the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		/**
		 * Prints out stack values, recursively
		 */
		public String toString() {
			// Base case
			if (next == null) {
				return value + "";
			}
			// recursive call
			return value + " " + next.toString();
		}

	}

}
