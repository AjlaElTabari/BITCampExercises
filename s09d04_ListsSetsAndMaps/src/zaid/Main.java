package zaid;

import java.util.PriorityQueue;


public class Main {

	public static void main(String[] args) {
		PriorityQueue<Employee> pq = new PriorityQueue<>();
		pq.add(new Employee("Hajrudin", 5000, -1));
		pq.add(new Employee("Ognjen", 347, 189));
		pq.add(new Employee("Enver", 4500, 170));
		pq.add(new Employee("Nidal", 10000, 192));
		pq.add(new Employee("Kristina", 4000, 175));
		
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
	}

}
