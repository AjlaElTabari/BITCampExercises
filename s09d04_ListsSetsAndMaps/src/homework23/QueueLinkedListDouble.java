package homework23;

/**
 * Represents an implementation of queue of doubles, using linked lists.
 * 
 * @author ajla.eltabari
 *
 */

	public class QueueLinkedListDouble {
		private Node head;

		/**
		 * Empty constructor.
		 * Initialize head node to null.
		 */
		public QueueLinkedListDouble() {
			head = null;
		}

		/**
		 * Adds element at the end of the queue.
		 * @param value
		 * @return
		 */
		public Double add(Double value) {
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
		 * Returns last added element from the queue.
		 * Does'n do anything with that element.
		 */
		public Double peek() {
			return head.getValue();
		}
		
		/**
		 * Removes last added element from the queue.
		 * Returns null if queue is empty.
		 * @return
		 */
		public Double poll()	 {
			if(head == null){
				return null;
			} else {
				Double tmp = head.getValue();
				head = head.getNext();
				return tmp;
			}
		}
		
		/**
		 * Prints out information about queue elements.
		 */
		public String toString() {
			if(head == null) {
				return "Stack is empty!";
			} else {
				return head.toString();
			}
		}

		/**
		 * Inner class that represents node of linked list.
		 * Node contains Double value and pointer the next node.
		 * 
		 * @author ajla.eltabari
		 *
		 */
		private class Node {

			private Double value;
			private Node next;

			public Node(Double value) {
				this.value = value;
				next = null;
			}

			/**
			 * @return the value
			 */
			public Double getValue() {
				return value;
			}

			/**
			 * @param value
			 *            the value to set
			 */
			public void setValue(Double value) {
				this.value = value;
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

			public String toString() {
				if (next == null) {
					return value + "";
				}
				return value + " " + next.toString();
			}
		}

	}
