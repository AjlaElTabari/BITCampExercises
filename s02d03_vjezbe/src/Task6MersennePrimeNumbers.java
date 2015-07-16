
public class Task6MersennePrimeNumbers {

	public static void main(String[] args) {
		for (int i = 131071; i <= 999999; i++) {
			boolean isMersennePrime = false;
			for (int j = 1; j <= 20; j++) {
				if (i == (Math.pow(2, j) - 1)) {
					boolean isExpPrime = true;
					for (int k = 2; k <= j/2; k++) {
						if ( j % k == 0) {
							isExpPrime = false;
							break;
						}
					}
					if (isExpPrime) {
						isMersennePrime = true;
					}
				}				
			}
			if (isMersennePrime) {
				System.out.println(i);
			}
		}

	}

}
