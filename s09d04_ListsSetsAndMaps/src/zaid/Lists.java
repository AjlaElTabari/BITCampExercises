package zaid;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lists {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for (int i = 10; i < 20; i++) {
			list.add(i);
		}
		
//		System.out.println(list.peekFirst());
//		System.out.println(list.peekLast());
//		
//		System.out.println(list.pollFirst());
//		System.out.println(list.pollLast());
		
		System.out.println(list);
		ListIterator<Integer> it = list.listIterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.previous());
		System.out.println(it.previous());
		
	}

}