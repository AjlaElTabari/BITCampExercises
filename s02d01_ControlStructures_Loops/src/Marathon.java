

public class Marathon {

	public static void main(String[] args) {
		// Math.random() vraca randome num od 0 - 1
		int distance = 41150;
		double ranDistance = 0;
		int brojac = 1;
		long startMillis = System.currentTimeMillis();
		int rankm = 0;

		do {
			ranDistance += Math.random();
			if((int)ranDistance / 1000 > rankm) {
				rankm++;
				System.out.print(". ");
			}
			//System.out.println(ranDistance);
			brojac++;
		} while (ranDistance <= distance);

		System.out.println(brojac);
		long duration = (System.currentTimeMillis() - startMillis) / 1000;
		System.out.println(duration + "s");

	}

}
