

//import java.util.Scanner;

public class IsPositive {
	
	public static void main(String[] args) {
		
		/*int broj;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj");
		broj = input.nextInt();*/
		
		String brojStr = args[0];
		
		int broj = Integer.parseInt(brojStr);
		
		boolean positive = (broj >= 0);
		
		System.out.println(positive);

	}

}
