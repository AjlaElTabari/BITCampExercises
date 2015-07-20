package predavanja;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueInheritance<E> extends LinkedList<E> {
	private static final long serialVersionUID = -3037969498447139443L;

	public void enqueue(E val) {
		this.add(0, val);
	}

	public void enqueueAll(Collection<E>elements) {
		Iterator <E> iter = elements.iterator();
		
		while (iter.hasNext()) {
			enqueue(iter.next());
		}
	}
	
	public E dequeue() {
		return this.remove(this.size() - 1);
	}
	
	public void dequeuTo(QueueInheritance<E> target) {
		
		while (size() > 0) {
			target.enqueue(dequeue());
		}
	}

	public static void main(String[] args) {
		QueueInheritance<String> strings = new QueueInheritance<String>();
		strings.enqueue("A");
		strings.enqueue("G");
		strings.enqueue("C");

		for (int i = 0; i < 3; i++) {
			System.out.println(strings.dequeue());
			System.out.println(strings.size());
		}
		
		System.out.println();
		
		QueueInheritance<Integer> integers = new QueueInheritance<Integer>();
		integers.enqueue(100);
		integers.enqueue(200);
		integers.enqueue(300);

		for (int i = 0; i < 3; i++) {
			System.out.println(integers.dequeue());
			System.out.println(integers.size());
		}
		
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(10);
		nums.add(11);
		integers.enqueueAll(nums);
		System.out.println("After adding collection " + integers.size());
		
		// Test Number Queue
		QueueInheritance<Number> numbers = new QueueInheritance<>();
		numbers.enqueue(1);
		numbers.enqueue(100);
		numbers.enqueue(10L);
		numbers.enqueue(12.12);
		
		System.out.println("\nMixed queue: " + numbers);
		

	}

}
