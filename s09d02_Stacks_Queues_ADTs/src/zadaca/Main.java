package zadaca;

public class Main {

	public static void main(String[] args) {
		LinkedListDouble list = new LinkedListDouble();
		System.out.println(list);
		double value = 2.5;
		list.add(value);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
	}

}
