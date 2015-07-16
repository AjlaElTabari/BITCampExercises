

public class DoWhile {

	public static void main(String[] args) {
		int numNo = 100;
		int brojac = 1;
		int sum = 0;

		do {
			sum += brojac;
			brojac++;
		}
		while (brojac <= numNo);
		
		System.out.println(sum);		

	}

}
