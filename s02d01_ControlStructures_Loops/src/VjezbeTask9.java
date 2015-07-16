

public class VjezbeTask9 {

	public static void main(String[] args) {
		//int minNo = 10001, maxNo = 99999, palindrome = minNo, reverse = 0, counter = 3;
		//boolean isFreeNum = true;
		

		//Initializing variables
		int limit = 100000;
		int num = 10000;
		int counter = num;
		int extraNum = 0;

		//Cheking which numbers from 10000 to 99999 are palyndroms and prime numbers
		while (counter < limit) {
			// Making reversed number
			num = counter;
			extraNum = 0;
			while (num / 10 > 0) {
				extraNum = extraNum * 10 + num % 10;
				num /= 10;
			}

			// Adding last digit
			extraNum = extraNum * 10 + num % 10;

			// Checking if number is palyndrom
			if (counter == extraNum) {
				//Checking if palyndrom is prime number
				int counter2 = 2;
				while(counter % counter2 != 0){
					counter2++;
				}
				if (counter2 == counter){		
					System.out.println("Number " + counter + " is prime number and palyndrom.");
				}		
			}
			
			counter++;
		}
	}

}
