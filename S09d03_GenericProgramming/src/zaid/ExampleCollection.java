package zaid;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleCollection {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 100; i > 0; i -= 3) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		System.out.println(list);
	}

}
