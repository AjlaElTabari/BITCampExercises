import java.util.Scanner;


public class MojaTestiranja {
	
	public static void main(String[] args) {
		int a, b;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("a = " + a);
		a++;
		System.out.println("a++ = " + a);
		System.out.println("b = " + b);
		System.out.println("a + b = " + (a+b));
		System.out.println("a / b = " + (a/b));
		if (a > b) {
			System.out.println("a je vece od b");	
		}
		else {
			System.out.println("a nije vece od b");
		}
		input.close();
	}
	
}
