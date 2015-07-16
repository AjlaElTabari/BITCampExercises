package predavanja;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {

			Random rand = new Random();

			a.add(rand.nextInt(5));

		}

		System.out.println(a.toString());
		
		switchPlaces(a);

		removeAll(2, a);

		System.out.println(a.toString());

	}

	public static void removeAll(int num, ArrayList<Integer> arrayList) {

		while (arrayList.indexOf(num) != -1) {

			arrayList.remove((Integer) num);

		}

	}
	
	public static void inverseList(ArrayList<Integer> arrayList) {
		int temp = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			
		}
	}
	
	public static void switchPlaces(ArrayList<Integer> arrayList) {
		int temp = 0;
		for (int i = 0; i < arrayList.size() - 1; i+=2) {
			temp = arrayList.get(i);
			arrayList.set(i, arrayList.get(i +  1));
			arrayList.set(i + 1, temp);
		}
		System.out.println(arrayList.toString());
	}

}
