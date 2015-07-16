package vjezbe;


public class Zadatak7 {

	public static void main(String[] args) {

		int d = 1, m = 1, y = 2015;

		boolean leapY;

		// calculating if year is leap
		if (y % 100 == 0) {
			if (y % 400 == 0) {
				leapY = true;
			} else {
				leapY = false;
			}
		} else if (y % 4 == 0) {
			leapY = true;
		} else {
			leapY = false;
		}

		//if (!leapY) {
			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10
					|| m == 12) {
				if (d > 31) {
					System.out.println("Datum nije ispravan");
					System.exit(0);
				}
				if (d <= 30) {
					System.out.println(++d + ". " + m + ". " + y + ".");
				} else if (m < 12) {
					System.out.println("1. " + ++m + ". " + y + ".");
				} else {
					System.out.println("1. 1. " + ++y + ".");
				}
			}
			if (m == 4 || m == 6 || m == 9 || m == 11) {
				if (d > 30) {
					System.out.println("Datum nije ispravan");
					System.exit(0);
				}
				if (d < 30) {
					System.out.println(++d + ". " + m + ". " + y + ".");
				} else if (m < 12) {
					System.out.println("1. " + ++m + ". " + y + ".");
				} else {
					System.out.println("1. 1. " + ++y + ".");
				}
			}
			if (m == 2 && leapY == true) {
				if (d > 29) {
					System.out.println("Datum nije ispravan");
					System.exit(0);
				}
				if (m == 2 && d <= 28) {
					System.out.println((d + 1) + ". " + m + ". " + y + ".");
				} else {
					System.out.println("1. " + ++m + ". " + y + ".");
				}
			} else {
				if (m == 2 && d > 28) {
					System.out.println("Datum nije ispravan");
					System.exit(0);
				}
				if (m == 2 && d <= 27) {
					System.out.println((d + 1) + ". " + m + ". " + y + ".");
				} else if (m == 2){
					System.out.println("1. " + ++m + ". " + y + ".");
				}

			}
	}

}
