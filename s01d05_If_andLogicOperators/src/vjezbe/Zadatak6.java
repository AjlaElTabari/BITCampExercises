package vjezbe;


public class Zadatak6 {

	public static void main(String[] args) {

		int year = 2300;
		
		if (year % 100 == 0){
			if (year % 400 == 0) {
				System.out.println("Godina je prestupna");
			}
			else {
				System.out.println("Godina nije prestupna");
			}
		}
		else if (year % 4 == 0) {
			System.out.println("Godina je prestupna");
		}
		else {
			System.out.println("Godina nije prestupna");
		}
	}

}
