package vjezbe;

public class Drink {
	String name;
	boolean isSparkling;
	int expirationYear;
	String color;
	/**
	 * @param name
	 * @param isSparkling
	 * @param expirationYear
	 * @param color
	 */
	public Drink(String name, boolean isSparkling, int expirationYear,
			String color) {
		super();
		this.name = name;
		this.isSparkling = isSparkling;
		this.expirationYear = expirationYear;
		this.color = color;
	}
	
	public String toString() {
		String s = "";
		s = s + "Name is " + name + "\n";
		s = s + "Expiration year is " + expirationYear + "\n";
		s = s + "Is sparkling " + isSparkling + "\n";
		s = s + "Color is " + color + "\n";
		return (s);
	}
	
	
}
