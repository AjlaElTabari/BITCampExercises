package zaid;

import java.util.EnumSet;

public class Enumerations {

	public enum FontDetails {
		BOLD, ITALIC, UNDERLINE, SHADOW
	};

	public static void main(String[] args) {
		FontDetails f1 = FontDetails.BOLD;
		FontDetails f2 = FontDetails.SHADOW;
		
		EnumSet<FontDetails> set = EnumSet.of(FontDetails.BOLD, FontDetails.UNDERLINE);
		
		changeFont(f1);
	}
	
	private static void changeFont(FontDetails f) {
		if (f == FontDetails.BOLD) {
			System.out.println("Boldirano");
		} else if (f == FontDetails.SHADOW) {
			System.out.println("Ima sjenu");
		}
	}

}
