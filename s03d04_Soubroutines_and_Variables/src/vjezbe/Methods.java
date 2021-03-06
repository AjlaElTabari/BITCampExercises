package vjezbe;

public class Methods {

	public static void main(String[] args) {
		// Task 1
		System.out.println(getMax(5, 7));
		// Task 2
		System.out.println(getExtension("Documents/Ajla/Workspace/index.io"));
		// Task 3
		System.out.println(canBeBinary(10001));
		// Task 4
		System.out.println(getRandomNumber(-4, 2));
		// Task 5
		System.out.println(getType("c"));
		// Task 6
		System.out.println(fixSentence("sky is blue"));

	}

	// Task 1
	public static int getMax(int num1, int num2) {
		int max = (num1 >= num2) ? num1 : num2;
		return max;
	}

	// Task 2
	public static String getExtension(String fileName) {
		String extRev = "", ext = ".";
		boolean hasExtension = false;

		for (int i = fileName.length() - 1; i >= 0; i--) {
			if (fileName.charAt(i) == '.') {
				hasExtension = true;
			}
		}

		if (hasExtension) {
			for (int i = fileName.length() - 1; i >= 0; i--) {
				if (fileName.charAt(i) != '.') {
					extRev += fileName.charAt(i);
				} else {
					break;
				}
			}

			for (int i = extRev.length() - 1; i >= 0; i--) {
				ext += extRev.charAt(i);
			}

			return ext;
		} else
			return null;
	}

	// Task 3
	@SuppressWarnings("static-access")
	public static boolean canBeBinary(int num) {
		try {
			Integer n = num;
			n.parseInt(num + "", 2);
			return true;
		} catch (NumberFormatException e) {
			return false;

		}
	}

	// Task 4
	public static int getRandomNumber(int min, int max) {
		int randomNum = min + (int) (Math.random() * ((max - min) + 1));
		return (min > max) ? -1 : randomNum;
	}

	// Task 5
	public static String getType(String value) {
		String str = " ";
		try {
			Double.parseDouble(value);
			str = "double";
			return str;
		} catch (NumberFormatException e) {
		}
		try {
			Integer.parseInt(value);
			str = "int";
			return str;
		} catch (NumberFormatException e) {
		}
		try {
			Boolean.parseBoolean(value);
			str = "boolean";
			return str;
		} catch (NumberFormatException e) {

		}

		int counter = 0;
		for (int i = 0; i < value.length(); i++) {
			@SuppressWarnings("unused")
			Character ch = value.charAt(i);
			counter++;
		}

		str = (counter > 1) ? "string" : "char";

		return str;
	}
	
	public static String fixSentence (String sentence) {
		char c1 = sentence.charAt(0);
		c1 = Character.toUpperCase(c1);
		
		char c = sentence.charAt(sentence.length()-1);
		sentence += (c != '.') ? '.' : ' ';
	
		sentence = sentence.substring(1, sentence.length());
		return c1 + sentence;
		
	}

}
