package vjezbe;

public class CitanjeIzFileova {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/s02d04/vjezbe/text.txt");
		
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		System.out.println(a + b);
	}

}
