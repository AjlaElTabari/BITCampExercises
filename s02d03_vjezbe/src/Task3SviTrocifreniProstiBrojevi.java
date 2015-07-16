
public class Task3SviTrocifreniProstiBrojevi {

	public static void main(String[] args) {
		for(int i = 101; i < 1000; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++){
				if(i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
			}
		}

	}

}
