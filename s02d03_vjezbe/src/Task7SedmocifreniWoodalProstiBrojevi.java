
public class Task7SedmocifreniWoodalProstiBrojevi {

	public static void main(String[] args) {
		for (int i = 1000000; i <= 9999999; i++) {
			boolean isWoodallPrime = false;
			for (int j = 1; j <= 20; j++) {
				if (i == (j * Math.pow(2, j) - 1)) {
					isWoodallPrime = true;
				}				
			}
			if (isWoodallPrime) {
				System.out.println(i);
			}
		}

	}

}
