package vjezbe;

public class GUpperCaseLetters {

	public static void main(String[] args) {
		char[]  characters = {'a', 'R', 'f', 'm', 'U'};
		
		for (char character : characters) {
			if (Character.isUpperCase(character)) {
				System.out.print(character);
			}
		}
	}
}
