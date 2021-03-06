package vjezbe;


public class GetMaxVariations {

	public static void main(String[] args) {
		// getMax(double num1, double num2)
		try {
			System.out.println(getMax(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
		} catch (NumberFormatException e) {
			System.out.println("Wrong input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This method needs to receive two parameters.");
		}
		
		// getMax(int[] arr)
		try {
			int[] arr = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				arr[i] = (int)Double.parseDouble(args[i]);
			}
			System.out.println(getMax(arr));
		} catch (NumberFormatException e) {
			System.out.println("Wrong input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot reach desired array index.");
		}
		
		
		// getMax(double[] arr)
		try {
			double[] arr = new double[args.length];
			for (int i = 0; i < args.length; i++) {
				arr[i] = Double.parseDouble(args[i]);
		}
			System.out.println(getMax(arr));
		} catch (NumberFormatException e) {
			System.out.println("Wrong input.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cannot reach desired array index.");
		}
		
	}
	
	/**
	 * Returns larger of two forwarded double numbers
	 * @param num1 double
	 * @param num2 double
	 * @return larger then two forwarded doubles as double
	 * @exception NumberFormatException when user enter invalid character </br> 
	 * @exception ArrayIndexOutOfBoundsException when user enters less then two parameters
	 */
	public static double getMax(double num1, double num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	/**
	 * Finds the largest number in int array
	 * @param arr Array of integers
	 * @return largest of arrays members
	 * @exception NumberFormatException when user enters invalid character </br> 
	 * @exception ArrayIndexOutOfBoundsException when tries to reach index that does not exist
	 */
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	/**
	 * Finds the largest number in double array
	 * @param arr Array of doubles
	 * @return largest of arrays members
	 * @exception NumberFormatException when user enters invalid character </br> 
	 * @exception ArrayIndexOutOfBoundsException when tries to reach index that does not exist
	 */
	public static double getMax(double[] arr) {
		double max = 0;
		for(double i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
