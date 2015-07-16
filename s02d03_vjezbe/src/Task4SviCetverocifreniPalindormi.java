
public class Task4SviCetverocifreniPalindormi {

	public static void main(String[] args) {
		for (int i = 1001; i <= 9999; i++) {
			int palindrome = i;
			int reverse = 0;
			
		 while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome /= 10;
	        }
	        
	        if(reverse == i) {
	        	System.out.println(i);
	        }
		}

	}

}
