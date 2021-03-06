package vjezbe;

import java.util.Arrays;

public class VjezbeRekurzija {
	public static long[] fibonnaciNos = new long[50];
	public static void main(String[] args) {
		
//		// Task 1
//		print("Myao", 9);
//		
//		// Task 2
//		printEverySecondNo(11);
//		
//		// Task 3
//		System.out.println(getSum(100));
		
		// Task 4
//		System.out.println(getFibonacciNumberWithLoops(46));
		System.out.println(getFibonnaciNumberWithArray(46));
		System.out.println(getFibonnaciNumber(46));
		
//		// Task 5
//		int[] arr = new int[10];
//		FillArray(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		// Task 6
//		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(isInArray(arr1, 2));
//		
//		// Task 7
//		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 6, 10};
//		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(areTheSame(arr2, arr3));
//		
//		// Task 8
//		int[] arr4 = new int[10];
//		fillArray2(arr4, 3);
//		System.out.println(Arrays.toString(arr4));

	}

	// Task 1
	public static void print (String name, int n) {
		if(n == 0) {
			return;
		}
		System.out.println(name);
		print(name, n - 1);
	}

	// Task  2
	public static void printEverySecondNo(int n) {
		if (n <= 1) {
			return;
		}
		System.out.println(n);
		printEverySecondNo (n - 2);
	}
	
	// Task 3
	public static int getSum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + getSum(n - 1);
	}
	
	// Task 4
	public static int getFibonnaciNumber(int number) {
		if (number == 1 || number == 2) {
			return 1;
		} 
		return getFibonnaciNumber(number - 1) + getFibonnaciNumber(number - 2);
	}
	
	// Task 5
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
	
	// Task 6
	public static boolean isInArray(int[] arr, int n) {
		return isInArray(arr, n, 0);
	}
	
	public static boolean isInArray(int[] arr, int n, int index) {
		if (index == arr.length) {
			return false;
		} else if (n == arr[index]) {
			return true;
		}
		return isInArray(arr, n, index + 1);
		
	}
	
	// Task 7
	public static boolean areTheSame(int[] a1, int[] a2) {
		return areTheSame(a1, a2, 0);
	}
	
	public static boolean areTheSame(int[] a1, int[] a2, int index) {
		if (index == a1.length) {
			return true;
		} else if (a1[index] != a2 [index]) {
			return false;
		} 
		
		return areTheSame(a1, a2, index + 1);
	}
	
	// Task 8
	public static void fillArray2(int[] arr, int n) {
		arr[n] = n;
		fillArray2(arr, n - 1, n - 1, true);
		fillArray2(arr, n + 1, n - 1, false);
	}
	
	public static void fillArray2(int[] arr, int index, int n, boolean b) {
		if (b) {
			if (index == -1) {
				return;
			} else {
				arr[index] = n;
				fillArray2(arr, index - 1, n - 1, true);
			}

		} else {
			if (index == arr.length) {
				return;
			} else {
				arr[index] = n;
				fillArray2(arr, index + 1, n - 1, false);
			}

		}
	}
	public static long getFibonacciNumberWithLoops(int n) {
		if (n <= 2) {
			return 1;
		}
		long fib1 = 1, fib2 = 1, fib3 = 0; 
		for (int i = 3; i <= n; i++) {
			 fib3 = fib1 + fib2; 
			 fib1 = fib2;
			 fib2 = fib3;     
		}
	return fib3;
	}

	public static long getFibonnaciNumberWithArray(int number) {
		if (number == 1 || number == 2) {
			return 1;
		} 
		if (fibonnaciNos[number] != 0) {
			return fibonnaciNos[number];
		} else {
			fibonnaciNos[number] = getFibonnaciNumberWithArray(number - 1) + getFibonnaciNumberWithArray(number - 2);
		}
		return fibonnaciNos[number];
	}
}
