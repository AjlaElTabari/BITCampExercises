package predavanja;
import java.util.Scanner;

public class Stringovi {

	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		String ime = ulaz.next();
		String prezime = ulaz.next();
		
		System.out.printf( "Your first name is %s, which has %d characters.%n", ime, ime.length() );
		System.out.printf( "Your last name is %s, which has %d characters.%n", prezime, prezime.length() );
		System.out.printf( "Your initials are %s%s", ime.charAt(0), prezime.charAt(0) );
		
		ulaz.close();
	}

}
