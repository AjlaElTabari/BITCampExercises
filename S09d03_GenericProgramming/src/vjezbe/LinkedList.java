package vjezbe;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection {
	private Node head;

	class Node {
		Object value;
		Node next;  
		
		public Node(Object o) {
			value = o;
		}
		
		public Node getNextNode() {
			return next;
		}
		
		public void setNextNode(Node next) {
			this.next = next;
		}
	}
	
	@Override
	public int size() {
		Node temp = head;
		int size = 0;
		while (temp.next != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (head.next == null);
	}

	@Override
	public boolean contains(Object o) {
		Node temp = head;
		while (temp != null) {
			if (temp.value.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		if (head == null) {
			head = new Node(e);
		} else {
			Node last = getLastNode();
			
			last.setNextNode(new Node(e));
		}
		return false;
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
	

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
