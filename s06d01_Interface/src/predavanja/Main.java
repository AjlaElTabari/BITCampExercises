package predavanja;

public class Main {

	public static void main(String[] args) {
		
		Foo f = new Foo(12);
		Foo f1 = new Foo(-12);
		Foo f2 = new Foo(0);
		Foo f3 = new Foo(122);
		
		Foo[] foos = {f, f1, f2, f3};
		
		System.out.println(getMax(foos));
		
		Bar b = new Bar("Ime");
		Bar b1 = new Bar("Neko ime");
		Bar b2 = new Bar("Neko drugo ime");
		Bar b3 = new Bar("Neko pravo dugo ime");
		
		Bar[] bars = {b, b1, b2, b3};
		
		System.out.println(getMax(bars));
		
	}
	
	private static Compare getMax(Compare[] array) {
		Compare max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max.compare(array[i]) == -1){
				max = array[i];
			}
		}
		return max;
	}
}
