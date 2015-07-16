package vjezbe;

public class RandomFunckija {

	public static void main(String[] args) {
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
		int counter = 0;
		
		do {
			counter++;
			c1 = 0; c2 = 0; c3 = 0; c4 = 0; c5 = 0;
			for (int i = 1; i <= 1000; i++) {
				int d = (int) (Math.random() * 5) + 1;
				//System.out.println(d);
				if (d == 1) {
					c1++;
				} else if (d == 2) {
					c2++;
				} else if (d == 3) {
					c3++;
				} else if (d == 4) {
					c4++;
				} else if (d == 5) {
					c5++;
				}
			}
		}
		while (c1 != c2 || c2 != c3 || c3 != c4 || c4 != c5 || c1 != c5);
		
		
		
		System.out
				.printf(" Jedinica je %d \n Dvica je %d \n Trica je %d \n Cetvorki je %d \n Petica je %d \n",
						c1, c2, c3, c4, c5);
		
		System.out.println(counter);
	}

}
