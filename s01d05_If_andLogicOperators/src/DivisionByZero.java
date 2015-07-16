

public class DivisionByZero {

	public static void main(String[] args) {
		
		int a = 10, b = 0;		
		
		boolean division = b != 0 && a%b == 0;
		System.out.println(division);

	}

}
