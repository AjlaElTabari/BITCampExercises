package vjezbe;

import java.util.Arrays;

public class YReorderingAnArray {

	public static void main(String[] args) {
		int[] arr = {1, 1, 9, 9, 1, 5, 2, 4};
		System.out.println(Arrays.toString(reorderAnArray(arr)));
	}

	public static int[] reorderAnArray(int[] arr) {
		int[] tempArr = new int[arr.length];
		int counter0 = 0;
		int counter1 = 0;
		int counter2 = (arr.length / 2);
		System.out.println(counter2);
		for (int i : arr) {
			if (counter0 % 2 == 0) {
				tempArr[counter1] = i;
				counter1++;
			} else if (counter0 % 2 != 0 && counter2 < arr.length) {
				tempArr[counter2] = i;
				System.out.println("index " + counter2 + " value " + i);
				counter2++;
			}
			counter0++;
		}
		return tempArr;
	}
}
