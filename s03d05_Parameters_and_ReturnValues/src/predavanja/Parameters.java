package predavanja;

public class Parameters {

	public static void main(String[] args) {
		int n = 99;

		System.out.println(threeNPlusOne(n));
	}

	public static String threeNPlusOne (int n) {
		String str = "";
		@SuppressWarnings("unused")
		int count = 0;
		while (n > 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1;
			} else {
				n /= 2;
			}
			count++;
		str += (n + " ");
		}
		return str;
	}
}
