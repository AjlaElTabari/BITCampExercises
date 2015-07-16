package predavanja;

public class PerfectNosFrom1Ton {

	public static void main(String[] args) {
		int n = 8128;

		for (int i = 1; i <= n; i++) {
			//Ovu sumu je uvijek trebalo vracati na nulu, zato nije radilo dok je bila deklarisana izvan for petlje.
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.println(i);
			} 
		}
	}

}
