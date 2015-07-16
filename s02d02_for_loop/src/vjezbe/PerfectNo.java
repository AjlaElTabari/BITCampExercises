package vjezbe;

public class PerfectNo {

	public static void main(String[] args) {
		int n = 8128, sum = 0;

		// Finding if entered number is perfect
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			System.out.println("Entered number is perfect! " + sum);
		} else {
			System.out.println("Entered number is not perfect! " + sum);
		}

	}

}
