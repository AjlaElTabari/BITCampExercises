package vjezbe;


public class Zadatak4 {

	public static void main(String[] args) {
		int a = -50;
		
		if (a >= 0 && a <= 25) {
			System.out.println("Broj se nalazi u opsegu od 0 - 25.");	
		}
		else if (a > 25 && a <= 50) {
			System.out.println("Broj se nalazi u opsegu od 25 - 50.");
		}
		else {
			System.out.println("Broj se nalazi izvan zadatih opsega.");				
		}

	}
}
