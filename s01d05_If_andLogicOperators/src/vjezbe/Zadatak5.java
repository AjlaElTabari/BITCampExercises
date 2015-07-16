package vjezbe;


public class Zadatak5 {

	public static void main(String[] args) {
		int day = 21, month = 5;
		
		int currDay = 22, currMonth = 5;
		
		if (currDay - day == 0 && currMonth - month == 0) {
			System.out.println("Sretan rodjendan!");
		}
		else if (currMonth - month < 0) {
			System.out.println("Polako, ima jos do tvog rodjendana");
		}
		else if (currMonth - month > 0) {
			System.out.println("Pihhh, prosao ti je rodjendan");
		}
		else if (currDay - day < 0) {
			System.out.println("Jeeejjj, rodjendan ti je uskoro");
		}
		else {
			System.out.println("Pihhh, prosao ti je rodjendan");
		}
	}

}
