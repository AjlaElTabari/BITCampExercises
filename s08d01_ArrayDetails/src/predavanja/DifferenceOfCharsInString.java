package predavanja;

public class DifferenceOfCharsInString {

	public static void main(String[] args) {
		System.out.println(areAllCharsDifferent("gordan"));
		System.out.println(areAllCharsDifferent("ajla"));
		System.out.println(areAllCharsDifferent1("edvin"));
		
		System.out.println(areTwoStringsContainSameCharacters("ajla", "aajl"));
	}

	private static boolean areAllCharsDifferent(String string) {
		for (int i = 0; i < string.length(); i++) {
			String substring = string.substring(i+1);
			for (int j = 0; j < substring.length(); j++) {
				if(string.charAt(i) == substring.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean areAllCharsDifferent1(String string) {
		int[] signs = new int[255];
		System.out.println((int)signs[0]);
		for (int i = 0; i < string.length(); i++) {
			signs[string.charAt(i)]++;
			if(signs[i] != 1)
				return false;
		}
		return true;
	}
	
	private static boolean areTwoStringsContainSameCharacters(String string1, String string2) {
		int length = 255;
		int[] signs = new int[length];
		
		if(string1.length() != string2.length()) {
			return false;
		} 
		
		for (int i = 0; i < string1.length(); i++) {
			signs[string1.charAt(i)]++;
			signs[string2.charAt(i)]--;
		}
		
		for (int i = 0; i < length; i++) {
			if (signs[i] != 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isSubstringOfNonShatroWord(String shatroWord, String substring) {
		String nonShatroWord = "";
		return true;
	}
}
