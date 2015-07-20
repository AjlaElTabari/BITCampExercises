package predavanja;

import java.util.LinkedList;

public class StringQueueInheritance extends LinkedList<String> {
	private static final long serialVersionUID = -3037969498447139443L;

	public void enqueue(String val) {
		this.add(0, val);
	}

	public String dequeue() {
		return this.remove(this.size() - 1);
	}

	public static void main(String[] args) {
		StringQueueInheritance values = new StringQueueInheritance();
		values.enqueue("A");
		values.enqueue("G");
		values.enqueue("C");

		for (int i = 0; i < 3; i++) {
			System.out.println(values.dequeue());
			System.out.println(values.size());
		}

	}

}
