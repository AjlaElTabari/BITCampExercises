package predavanja;

public class Main {

	public static void main(String[] args) {
		LinkedListInts list = new LinkedListInts();
		
		list.addFront(5);
		list.addFront(7);
		list.addFront(2);
		
		list.printList();

		list.removeFront();
		System.out.println();
		list.printList();
	}

}
