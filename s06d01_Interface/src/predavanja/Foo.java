package predavanja;

public class Foo implements Compare, Comparable {
	private int fooness;

	/**
	 * @param fooness
	 */
	public Foo(int fooness) {
		super();
		this.fooness = fooness;
	}
	
	
	
	/**
	 * @return the fooness
	 */
	public int getFoones() {
		return fooness;
	}



	/**
	 * @param foones the fooness to set
	 */
	public void setFoones(int foones) {
		this.fooness = foones;
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Foo) {
			Foo f = (Foo)o;
			if (this.fooness < f.fooness) {
				return -1;
			} else if (this.fooness > f.fooness) {
				return 1;
			} else {
				return 0;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}


	
	public String toString() {
		return "Foones: " + fooness;
	}



	@Override
	public int compareTo(Object o) {
		return compare(o);
	}
}
