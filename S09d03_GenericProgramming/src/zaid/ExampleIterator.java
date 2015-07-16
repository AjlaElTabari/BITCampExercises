package zaid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ExampleIterator {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		// Adding
		for (int i = 0; i < 100; i++) {
			list.add((2 * i) + "");
		}
		
		ArrayList<String> newList = new ArrayList<>();		
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
		
			if (s.length() == 2) {
				newList.add(s);
			}
		}
		
		System.out.println(newList);
	}

}
