

public class VjezbeTask10 {

	public static void main(String[] args) {
		long counter = 0, fib1 = 1, fib2 = 1, fib3 = 0;
		System.out.print(fib1 + ", " + fib2);
		do {
			fib3 = fib1 + fib2;
			System.out.print(", " + fib3);
			fib1 = fib2;
			fib2 = fib3;
			counter++;
		} while (counter <= 50);

	}
}
