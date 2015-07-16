package predavanja;

public class Currency {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/s04d02/predavanja/Currency.txt");
		String a = TextIO.getlnString();

		String b = TextIO.getlnString();
		System.out.println(a);
		System.out.println(b);
		String[] parts = a.split(" ");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		System.out.println(part1);
		System.out.println(part2);
		
		 
		

	}

}
