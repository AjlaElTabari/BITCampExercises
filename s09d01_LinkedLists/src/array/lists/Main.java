package array.lists;

public class Main {

	public static void main(String[] args) {
		ArrayListInt list = new ArrayListInt();
		System.out.println(list); // {}
		
		list.add(5); // {5}
		list.add(2); // {5, 2}
		System.out.println(list.get(1)); // Printa 2
		System.out.println(list); // {5, 2}
		
		list.remove(1); // {2}
		System.out.println(list); // {2}
	}
}
