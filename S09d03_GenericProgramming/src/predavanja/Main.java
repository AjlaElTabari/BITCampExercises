package predavanja;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Short[] arr = {1, 2, 13, 5, 4, 0, 9, 140};
		System.out.println(NumberUtils.getMax(arr));
		
		int[] objArr = {1, 2, 13, 5, 4, 0, 9, 140};
		System.out.println(NumberUtils.getMax(objArr));
		
		Integer[] objInt = {1, 2, 13, 5, 4, 0, 9, 140};
		System.out.println(NumberUtils.getMax(objInt));
		
		Number[] objNum = {1, 2, 13, 5, 4, 0, 9, 140, 260.6};
		System.out.println(NumberUtils.getMax(objNum));
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("abc");
		arrList.add("cde");
		arrList.add("fde");
		CollectionUtils.printString(arrList);
		
		System.out.println(CollectionUtils.max(arrList));
	}

}
