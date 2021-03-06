package vjezbe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class IteratorTesting {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		for (int i = 0; i < 100000; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt((100 - 1) + 1) + 1;
			list.add(randomNum);
		}

		System.out.println(list);

		System.out.println("Enter the number");
		int num = input.nextInt();
		Iterator<Integer> it = list.iterator();
		Long startIterator = System.currentTimeMillis();
		while (it.hasNext()) {
			if (it.next() % num == 0) {
				it.remove();
			}
		}
		System.out.println("Iterator: " + (System.currentTimeMillis() - startIterator));
		
		//System.out.println(list);
		
		Long startFor = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % num == 0) {
				list.remove(i);
			}
		}
		System.out.println("Iterator: " + (System.currentTimeMillis() - startFor));

		input.close();

	}

}
