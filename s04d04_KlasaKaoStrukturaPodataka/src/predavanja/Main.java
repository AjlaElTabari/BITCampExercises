package predavanja;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Ajla", "Tabari", 1984, "MM 13", "Af56L9", "ajla@tabari.me", 159, true, "Cheesecake", "Water");
		Person p2 = new Person("Amra", "Sabic", 1989, "AA 19", "H7J0lYY", "amra@gmail.com", 185, true, "Snickers", "Orange juice");
		
		getOlderPersonObject(p1, p2);
		
	}
	
	public static void getOlderPersonObject(Person p1, Person p2) {
		if (p1.yearOfBirth > p2.yearOfBirth) {
			System.out.println(p2.toString());
		} else {
			System.out.println(p1.toString());
		}
	}

}
