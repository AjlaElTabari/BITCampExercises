package vjezbe;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(getType("c"));

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
				System.out.println("55");
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

			System.out.println("66");

			return str;
		}
}
