package vjezbe;

import java.util.Arrays;

public class Nizovi8 {

	public static void main(String[] args) {
		
		int[] arr1 = {9, 5, 2, 3};
		int[] arr2 = {4, 8, 7};
		
		String s1 = "", s2 = "";
		
		for (int i = 0; i < arr1.length; i++) {
			s1 += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			s2 += arr2[i];
		}
		
		Integer res = Integer.parseInt(s1) + Integer.parseInt(s2);
		String ress =   res.toString();
		
		char[] arrRes = new char [ress.length()];
		
		for (int i = 0; i < arrRes.length; i++) {
			arrRes[i] = ress.charAt(i);
		}
		
		System.out.println(Arrays.toString(arrRes));

	}

}
