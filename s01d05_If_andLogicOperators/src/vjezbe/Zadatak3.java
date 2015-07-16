package vjezbe;


public class Zadatak3 {

	public static void main(String[] args) {
		int a = 45, b = 5, c = 5;

		if (a == b) {
			if (a == c) {
				System.out.println("Svi brojevi su jednaki");
			} else if (a > c) {
				System.out.println("A i B su jednaki, a C je manji.");
			} else {
				System.out.println("A i B su jednaki, a C je veci.");
			}
		} else if (a > b) {
			if (a > c) {
				System.out.println("A je najveci.");
			} else if (a == c) {
				System.out.println("A i C su jednaki i veci su od B.");
			} else {
				System.out.println("A je najveci.");
			}
		} else if (b > c) {
			System.out.println("B je najveci.");
		} else if (b == c) {
			System.out.println("B i C su jednaki i veci su od A.");
		} 

	}

}
