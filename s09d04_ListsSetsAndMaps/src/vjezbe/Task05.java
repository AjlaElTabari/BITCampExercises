package vjezbe;

import java.util.Arrays;

public class Task05 {

	private Double[] array;

	public Task05() {

		array = new Double[0];
	}

	/**
	 * adding elements to an array
	 * 
	 * @param element
	 * @return
	 */
	public boolean add(Double element) {

		array = Arrays.copyOf(array, array.length + 1);

		array[array.length - 1] = element;

		return true;

	}

	/**
	 * returning a head of queue
	 * 
	 * @return
	 */

	public Double peek() {

		if (array.length > 0) {
			return array[array.length - 1];

		} else
			return null;
	}

	/**
	 * removing a head of queue and returning a value of head
	 * 
	 * @return
	 */
	public Double poll() {
		Double tmp = null;

		if (array.length > 0) {

			for (int i = 0; i < array.length; i++) {
				tmp = array[array.length - 1];
			}
			array = Arrays.copyOf(array, array.length - 1);
		}
		return tmp;

	}

	public String toString() {

		if (array.length == 0) {
			return "Queue is empty";

		} else {
			return Arrays.toString(array);
		}
	}

	public static void main(String[] args) {

		Task05 queue = new Task05();
		long start = System.currentTimeMillis();

		queue.add(5.7);
		queue.add(3.3);
		queue.add(9.9);

		System.out.println("Time to add elements in miliseconds "
				+ (System.currentTimeMillis() - start));
		System.out.println("***************************");

		System.out.println("Printing queue");
		System.out.println(queue);
		System.out.println("***************************");

		System.out.println("Peek");
		System.out.println(queue.peek());
		System.out.println("***************************");

		System.out.println("Poll");
		queue.poll();
		System.out.println(queue);
		System.out.println("***************************");

	}
}