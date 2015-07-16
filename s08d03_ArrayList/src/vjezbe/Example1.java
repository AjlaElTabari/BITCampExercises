package vjezbe;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		int[] array = {1, 2, 5, -1, 0, 2};
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(Arrays.binarySearch(array, 2));
		
		// ************************
		
		int[] array2 = new int[5];
		System.out.println(Arrays.toString(array2));
		array2[2] = 2;
		Arrays.fill(array2, 5);
		System.out.println(Arrays.toString(array2));
		
		Arrays.fill(array2, 2, 4, 3);
		System.out.println(Arrays.toString(array2));
		
		// ************************
		
		int[] array3 = new int[2];
		System.out.println(Arrays.toString(array3));
		array3 = Arrays.copyOf(array3, 4);
		System.out.println(Arrays.toString(array3));
	}

}
