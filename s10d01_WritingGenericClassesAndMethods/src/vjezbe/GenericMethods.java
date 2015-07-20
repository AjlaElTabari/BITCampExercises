package vjezbe;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JComponent;

public class GenericMethods {

	public static void main(String[] args) {

	}

	public <T> void printAll(Collection<T> col) {
		System.out.println(col);
	}

	public <T> int countOccurences(Collection<T> col, T elem) {
		int occurences = 0;
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			if (it.next().equals(elem)) {
				occurences++;
			}
		}
		return occurences;
	}

	public <T extends JComponent> void printComponent(T component) {
		System.out.println("Width: " + component.getWidth() + "\nHeight: "
				+ component.getHeight() + "\n(X, Y): (" + component.getX()
				+ ", " + component.getY() + ")");
	}
	
	public <T> void printType(Collection<T> col) {
		if (col instanceof Map) {
			System.out.println("Collection is a map.");
		} else if (col instanceof Set) {
			System.out.println("Collection is a set.");			
		} else if (col instanceof List) {
			System.out.println("Collection is a list.");			
		}
	}
}
