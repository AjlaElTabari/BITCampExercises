package ajla.vjezbe;

public class Main {

	public static void main(String[] args) {
		
		University u = new University("Hrasnicka cesta 17", 1000, 2500.00, 150, "IUS", false, 6);
		System.out.println(u);		
		Hospital h = new Hospital("Hrasnicka cesta 17", 1000, 2500.00, 1500, true, true, 2600);
		System.out.println(h);		
		Jail j = new Jail("Hrasnicka cesta 17", 1000, 2500.00, 900, 2, true);
		System.out.println(j);
	}

}
