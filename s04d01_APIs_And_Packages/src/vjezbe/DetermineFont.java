package vjezbe;

import java.awt.Font;

public class DetermineFont {

	public static void main(String[] args) {
		Font f = new Font("Verdana", Font.BOLD, 24);
		try {
			printFontDetails(f);
		} catch (NullPointerException e) {
			System.out.println("Forwarded object cannot be null!");
		}
		

	}

	/**
	 * <b> prints font details </b> 
	 * <p>
	 * Collects forwarded font details and prints them on standard output as String
	 * @param f - Font f
	 * @return font details as String
	 * @exception NullPointerException - Forwarded object cannot be null
	 */
	public static void printFontDetails (Font f) {
		if(f == null) {
			throw new NullPointerException();
		}
		String str = f.getFontName() + " " + f.getSize();
		System.out.println(str);
	}
}
