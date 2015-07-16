

public class Main {

	public static void main(String[] args) {
		
		int crazyNumber = 3;
		crazyNumber += crazyNumber++ + ++crazyNumber;
		
		System.out.println(crazyNumber);
		
		int binary = 0b101;
		int hex = 0xF;
		double bigNo = 100_000_000_000.0;
		double longNo = 10.0/3;
		

		System.out.println(binary);
		System.out.println(hex);
		System.out.println(bigNo);
		System.out.println(longNo);

		System.out.printf("Ovdje je broj %d, ovdje je broj %d, a ovdje je broj %d", crazyNumber, binary, hex);


	}

}
