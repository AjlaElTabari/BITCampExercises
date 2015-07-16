import java.util.Scanner;


public class Zadaca2Zadatak3Code {
	public static void main(String[] args) {
		int a, b, c;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a>5) {
			System.out.println("a = " + a);
			if(b<=c) {
				System.out.println("c = " + c);
			}
			else {
				System.out.println("b = " + b);	
			}
		}
		else if (a<5) {
			System.out.println("b = " + b);
			if(a<=c) {
				System.out.println("c = " + c);	
			}
			else {
				System.out.println("a = " + a);	
			}
		}
		else if(a==5) {
			System.out.println("c = " + c);
		}
			input.close();
	}
}
