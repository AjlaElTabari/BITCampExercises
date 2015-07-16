

public class FizzBuzzWhile {

	public static void main(String[] args) {
		int numNo = 100;
		int brojac = 1;
		
		while (brojac <= numNo ) {
			if(brojac % 3 == 0 && brojac % 5 ==0) {
				System.out.println("FizzBuzz");			
			}
			else if (brojac % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (brojac % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(brojac);
			}

			brojac++;
		}

	}

}
