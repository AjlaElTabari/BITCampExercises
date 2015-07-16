package zadaca;
import java.util.Scanner;

public class Task5EliminateZerosFromEnteredNo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Asking user to enter the number
		System.out
				.println("Unesite broj iz kojeg zelite odstraniti nule");
		long num = input.nextLong();
		long tempNum = num, newNumrev = 0;
		while (tempNum != 0) {
            long remainder = tempNum % 10;
            if (remainder != 0) {
            	newNumrev = newNumrev * 10 + remainder;
            }            
            tempNum /= 10;
        }
		
		long newNumTemp = newNumrev, newNum = 0;
		
		while (newNumTemp != 0) {
            long remainder = newNumTemp % 10;
            if (remainder != 0) {
            	newNum = newNum * 10 + remainder;
            }            
            newNumTemp /= 10;
        }
		
		System.out.println(newNum);
		input.close();

	}

}
