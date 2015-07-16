package vjezbe;

import java.util.Arrays;

public class Main_vjezbe {


	public static void main(String[] args) {
		//Factorial
		//System.out.println(Factorial(5));
		
		//FillArray
		int[] arr = new int[5];
		FillArray(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} 
		return n * factorial(n - 1);
	}
	
	public static void FillArray(int[] arr) {
		FillArray(arr, 0);
	}
	
	public static void FillArray(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		arr[index] = index + 1;
		FillArray(arr, index + 1);
	}
}
