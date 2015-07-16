package task1;

public class Main {

	public static void main(String[] args) {
		StringStackArrays stack = new StringStackArrays();
		stack.push("Ajla");
		stack.push("Amra");
		stack.push("Gordan");
		stack.push("Zaid");
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.empty());
		
		System.out.println(stack.search("Ajla"));
		System.out.println(stack.search("Ajl"));

	}

}
