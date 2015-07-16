
public class Task9DevetocifreniFibonacijeviProstiBrojevi {

	public static void main(String[] args) {

		for (int i = 100000000; i <= 999999999; i++) {
			int a=0, b=1 ,c=0; 
	         /* 'a' is the 1st term, 'b' is the 2nd term and 'c' is the 3rd term
	          * 'c' stores the last generated term of the Fibonacci series */
	         while(c<i) // Loop goes on till the 3rd term is less than the given number
	          {
	              c = a + b; // Generating the terms of Fibonacci Series
	              a = b;
	              b = c;
	          }	      
	          /* When the control comes out of the while loop, either the 
	           * 3rd term is equal to the number or greater than it */
	         
	           if(c==i) // If the last term = number, then it belongs to Fibonacci Series
	              System.out.println(i);
	   }	

	}

}
