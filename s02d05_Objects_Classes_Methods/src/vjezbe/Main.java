package vjezbe;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Task1
		/*System.out.println("Enter first number ");
		int a = input.nextInt();
		System.out.println("Enter second number ");
		int b = input.nextInt();
		System.out.println("Enter third number ");
		int c = input.nextInt();
		int sum = 0;
		sum = getSum(a) + getSum(b) + getSum(c);
		System.out.println(sum); */
		
		// Task2
		/*int holesNo = 85126;
		System.out.println(getNumberOfHoles(holesNo));*/

		input.close();
	}

	// Task1
	public static int getSum (int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++){
			sum += i;
		}
		return sum;
	}
	
	//Task2
	public static int getNumberOfHoles (int num) {
		int counter = 0;
		int number = num;
		while (number > 0) {
			int remembered = 0;
			remembered = number % 10;
			
			if(remembered == 0 || remembered == 4 || remembered == 6 || remembered == 9) {
				counter++;
			}
			else if (remembered == 8) {
				counter += 2;
			}
			
			number /= 10;			
		}
		
		return counter;
	}
	
	
}
