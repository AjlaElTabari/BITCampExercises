package vjezbe;

import java.util.Arrays;

public class FillArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fillArray(10, 3, 2, 6)));

	}

	public static int[] fillArray(int size, int value, int startingIndex, int endingIndex) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			if (i < startingIndex || i > endingIndex) {
				arr[i] = -1;
			} else {
				arr[i] = value;
			}
		}
		
		return arr;
	}
}
