package task2;

public class Main {

	public static void main(String[] args) {
		
		StringStackLinkedLists stack = new StringStackLinkedLists();
		System.out.println(stack.empty());
		System.out.println(stack.push("Ajla"));
		System.out.println(stack.push("Amra"));
		System.out.println(stack);
		stack.push("Gordan");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());

	}

}
