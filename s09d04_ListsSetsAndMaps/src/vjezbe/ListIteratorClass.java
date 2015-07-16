package vjezbe;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorClass {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Random rand = new Random();
		int range = 51;
		int randomNum =  rand.nextInt(range) + 50;
		
		for(int i = 0; i < 20; i++) {
			randomNum =  rand.nextInt(range) + 50;
			list.add(randomNum);
		}
		
		System.out.println(list);
		
		LinkedList<Integer> newList = new LinkedList<>();
		
		ListIterator<Integer> it = list.listIterator();
		
		while (it.hasNext()) {
			newList.add(it.next());
		}

		System.out.println(newList);
		
		while (it.hasPrevious()) {
			newList.add(it.previous());
		}

		System.out.println(newList);

	}

}
