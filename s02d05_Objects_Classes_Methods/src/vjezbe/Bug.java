package vjezbe;

public class Bug {
	private String type;
	private boolean looksNice;
	private boolean isPoison;
	private int sizeMM;
	private String color;

	/**
	 * @param type
	 * @param looksNice
	 * @param isPoison
	 * @param sizeMM
	 * @param color
	 */
	public Bug(String type, boolean looksNice, boolean isPoison, int sizeMM,
			String color) {
		super();
		this.type = type;
		this.looksNice = looksNice;
		this.isPoison = isPoison;
		this.sizeMM = sizeMM;
		this.color = color;
	}

	public String toString() {
		String s = "";
		s = s + "Bug type is: " + type + "\n";
		String isNice = "";
		if (looksNice) {
			isNice = "Yes";
		} else
			isNice = "No";
		s = s + "Does this bug look nice? " + isNice + "\n";
		String isDangerous = "";
		if (isPoison) {
			isDangerous = "Yes";
		} else
			isDangerous = "No";
		s = s + "Is this bug dangerous? " + isDangerous + "\n";
		s = s + "Size of the bug in mm: " + sizeMM + "\n";
		s = s + "Color of the bug is: " + color + "\n";
		return (s);
	}

}
