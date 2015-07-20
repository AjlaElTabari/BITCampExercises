package predavanja;

import java.util.LinkedList;

public class QueueComposition<E> {
private LinkedList<E> values;
	
	public QueueComposition() {
		values = new LinkedList<E>();
	}
	
	public int size() {
		return values.size();
	}
	
	public void enqueue(E val) {
		values.add(0, val);
	}
	
	public E dequeue() {
		return values.remove(values.size() - 1);
	}

	public static void main(String[] args) {
		QueueComposition<String> strings = new QueueComposition<String>();
		strings.enqueue("A");
		strings.enqueue("B");
		strings.enqueue("C");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(strings.dequeue());
			System.out.println(strings.size());
		}
		
		System.out.println();
		
		QueueComposition<Integer> integers = new QueueComposition<Integer>();
		integers.enqueue(100);
		integers.enqueue(200);
		integers.enqueue(300);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(integers.dequeue());
			System.out.println(integers.size());
		}
	}
}
