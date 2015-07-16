
public class Task8OsmocifreniSavrseniBrojevi {

	public static void main(String[] args) {
		

		// Finding and calculating sum of dividers for every number from 1 to n
		for (long i = 10000; i <= 99999; i++) {
			long sum = 0;
			for (long j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			// Checking if number is perfect
			if (i == sum) {
				System.out.println(i);
			} 
		}
	}

}
