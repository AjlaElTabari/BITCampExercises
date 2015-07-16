package vjezbe;

import java.util.Arrays;

public class Nizovi7 {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr2 = {11, 12, 13, 14, 15,};
		
		int [] arrCom = new int [arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arrCom[i] = arr1[i];
		}
		int j = 0;
		for (int i = arr1.length; i < arrCom.length; i++) {
			if(j < arr2.length) {
				arrCom[i] = arr2[j];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arrCom));


	}

}
