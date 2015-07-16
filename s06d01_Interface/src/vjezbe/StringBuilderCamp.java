package vjezbe;

public class StringBuilderCamp {
	private char[] characters;

	/**
	 * Constructor
	 * @param characters
	 */
	public StringBuilderCamp(char[] characters) {
		super();
		this.characters = characters;
	}
	
	/**
	 * empty constructor
	 */
	public StringBuilderCamp() {
		super();
		this.characters = new char [16];
	}
	
	/**
	 * Adds object.toString() to the end of char array
	 */
	public void append(Object o) {
		if (o instanceof String) {
			String s = (String)o; 
			char[] newCharacters = CharManipulation.extendArray(characters, s.length());
			CharManipulation.addStringToTheCarArray(characters, newCharacters, s, 0);
			
			// changing pointer of original array to new array
			characters = newCharacters;
		} else {
			System.out.println("Cannot append non String object.");
		}
	}
	
	/**
	 * Adds object.toString() to the beginning of char array
	 */
	public void prepend(Object o) {
		if (o instanceof String) {
			String s = (String)o; 
			char[] newCharacters = CharManipulation.extendArray(characters, s.length());
			CharManipulation.addStringToTheCarArray(characters, newCharacters, s, s.length() - 1);
			
			// changing pointer of original array to new array
			characters = newCharacters;
		} else {
			System.out.println("Cannot append non String object.");
		}
	}
	
	/**
	 * Converts array of chars to String
	 * Override toString method
	 */
	public String toString() {
		return CharManipulation.printArray(characters);
	}
	
	static public class CharManipulation {
		
		public static char[] extendArray(char[] arr, int size) {
			return new char[arr.length + size];
		}
		
		public static void addStringToTheCarArray(char[] origArr, char[] newArr, String s, int offset) {
			if (offset == 0) {
				for (int i = 0; i < newArr.length; i++) {
					if(i < origArr.length) {
						newArr[i] = origArr[i];
					} else {
						newArr[i] = s.charAt(offset);
						offset++;
					}
				}
			} else {
				offset = 0;
				for (int i = 0; i < newArr.length; i++) {
					if(i < s.length()) {
						newArr[i] = s.charAt(i);
					} else {
						newArr[i] = origArr[offset];
						offset++;
					}
				}
			}
		}
		
		public static String printArray(char[] arr) {
			String s = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != '\u0000') {
					s += arr[i];
				}
			}
			return s;
		}
	}
}
