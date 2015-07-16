package zaid;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<>();
		
		tset.add("A");
		tset.add("D");
		tset.add("B");
		tset.add("C");
		tset.add("B");
		
		Iterator<String> it = tset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(tset);
		
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("Ajla");
		hset.add("Amina");
		hset.add("Amra");
		hset.add("Armin");
		hset.add("Becir");
		hset.add("Bea");
		hset.add("Ajla");
		
		Iterator<String> it2 = hset.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}

}
