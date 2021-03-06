package predavanja;

//import java.util.Scanner;

public class PrintHelloWorld {
	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("What is your name?"); String name =
		 * input.nextLine(); sayHello(name);
		 */
		System.out.println("Enter names?");
		if (args.length == 0) {
			System.out
					.println("This method needs to receive at least one argument.");
		} else {
			int res = convertStringsToIntAndReturnSum(args);
			System.out.println(res);
		}

	}

	/**
	 * <b>Prints Hello World to the screen</b>
	 * <p>
	 * Sends string "Hello World" to the standard output
	 */
	public static void sayHello() {
		System.out.println("Hello World!");
	}

	/**
	 * <b>Greets a user by name</b>
	 * 
	 * @param name
	 *            of a user to greet
	 */
	public static void sayHello(String name) {
		System.out.printf("Hello, %s\n", name);
	}

	/**
	 * Return sum of received strings
	 * 
	 * @param names
	 * @return
	 */
	public static int convertStringsToIntAndReturnSum(String[] names) {
		int sum = 0;
		for (String arg : names) {
			sum += Integer.parseInt(arg);
		}
		return sum;
	}
}
