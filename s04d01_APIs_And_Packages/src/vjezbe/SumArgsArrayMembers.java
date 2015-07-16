package vjezbe;

public class SumArgsArrayMembers {

	public static void main(String[] args) {
		try {
			System.out.println(getSumOfArraysMembers(args));
		} catch (NumberFormatException e) {
			System.out.println("Wrong input");
		}

	}

	/**
	 * <b> Calculates and returns sum of array members </b>
	 * <p>
	 * @param arr - Array of number values, received as array of Strings
	 * @return sum of array members as int
	 * @exception NumberFormatException - if user enters some other value then int
	 */
	public static int getSumOfArraysMembers (String[] arr) {
		int sum = 0;
		for (String i : arr) {
			sum += Integer.parseInt(i);
		}
		return sum;
	}
}
