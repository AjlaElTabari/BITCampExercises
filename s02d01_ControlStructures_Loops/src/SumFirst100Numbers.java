

public class SumFirst100Numbers {

	public static void main(String[] args) {
		int numNo = 100;
		int brojac = 1;
		int sum = 0;

		while (brojac <= numNo) {
			sum += brojac;
			brojac++;
		}
		System.out.println(sum);
	}

}
