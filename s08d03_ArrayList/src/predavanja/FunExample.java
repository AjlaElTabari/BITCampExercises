package predavanja;

import java.util.ArrayList;
import java.util.Arrays;

public class FunExample {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "java", "programmer"));
		ArrayList<String> b = new ArrayList<String>();
			
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i).length() == 4) {
				b.add("****");
			} 
			b.add(a.get(i));
		}
		
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
