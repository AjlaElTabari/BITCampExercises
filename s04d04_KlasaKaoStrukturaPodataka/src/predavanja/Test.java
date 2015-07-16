package predavanja;

public class Test {

	public static void main(String[] args) {
		String[] p1 = {"Ajla", "Tabari", "1984", "MM 13", "A4B2dd"};
		String[] p2 = {"Amra", "Sabic", "1989", "AA 19", "BG43kS"};
		
		Test.getOlderPerson(p1, p2);
		}

	public static void getOlderPerson (String[] p1, String[] p2) {
		if (Integer.parseInt(p1[2]) > Integer.parseInt(p2[2])) {
			System.out.println("Older person is: " + p2[2]);
		} else {
			System.out.println("Older person is: " + p1[2]);
		}
	}
}
