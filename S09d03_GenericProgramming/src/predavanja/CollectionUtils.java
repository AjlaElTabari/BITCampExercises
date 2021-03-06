package predavanja;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtils {

	public static void printString(Collection <String> strings) {
		Iterator<String> i = strings.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static String max(Collection <String> strings) {
		Iterator<String> i = strings.iterator();
		String max = null;
		while (i.hasNext()) {
			String current = i.next();
			if (max == null || max.compareTo(current) < 0) {
				max = current;
			} 
		}
		return max;
	}

	public static Collection<String> getCollectionWithoutNulls(Collection <String> strings) {
		Collection <String> newCollection = null;
		Iterator<String> i = strings.iterator();
		while (i.hasNext()) {
			if(!i.equals(null)) {
				String s = i.next();
				newCollection.add(s);
			}
		}
		return newCollection;
	}
}
