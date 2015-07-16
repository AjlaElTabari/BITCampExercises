package predavanja;

public class LinkedListInts {
	private Node start;
	
	public void addFront(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = start;
		start = newNode;
	}
	
	public int removeFront() throws ArrayIndexOutOfBoundsException {
		int value = 0;
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			value = start.value;
			start = start.next;
		}
		return value;
	}
	
	private boolean isEmpty() {
	return (start == null) ? true : false;
	}
	
	public void printList() {
		Node temp = start;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	class Node {
		int value;
		Node next;  
	}
}
