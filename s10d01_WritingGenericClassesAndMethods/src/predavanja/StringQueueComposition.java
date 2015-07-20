package predavanja;

import java.util.LinkedList;

public class StringQueueComposition {
	private LinkedList<String> values;
	
	public StringQueueComposition() {
		values = new LinkedList<String>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue(String val) {
		values.add(0, val);
	}
	
	public String dequeue() {
		return values.remove(values.size() - 1);
	}

	public static void main(String[] args) {
		StringQueueComposition values = new StringQueueComposition();
		values.enqueue("A");
		values.enqueue("B");
		values.enqueue("C");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(values.dequeue());
			System.out.println(values.size());
		}
	}
}
