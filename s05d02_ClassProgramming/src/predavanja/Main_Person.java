package predavanja;

public class Main_Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("Amra", "Sabic", 26);
		Person p2 = new Person("Ajla", "ElTabari");
		System.out.println(p1.getName() + " " + p1.getId());
		System.out.println(p2.getName() + " " + p2.getId());
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
