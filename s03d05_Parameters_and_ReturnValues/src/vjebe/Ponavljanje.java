package vjebe;

import java.util.Arrays;

public class Ponavljanje {

	public static void main(String[] args) {
		// Task 1
		System.out.println("Task 1");
		System.out.println(merge ("Java", "Srce"));
		// Task 2
		System.out.println("Task 2");
		System.out.println(getFirst ("ajla", "Amra", "zaid"));
		// Task 3
		System.out.println("Task 3");
		System.out.println(getTheRest ("BITCamp", "Ca"));
		System.out.println(getTheRest ("Boolean", "ole"));
		System.out.println(getTheRest ("String", "int"));
		// Task 4
		System.out.println("Task 4");
		writeToFile("src/ba/BITCamp/ajla/s03d05/vjeze/text.txt", "BITCamp <3");
		/*Scanner input = new Scanner(System.in);
		String fn = input.nextLine();
		String msg = input.nextLine();
		writeToFile(fn, msg);*/
		// Task 5
		
		//Task 6
		System.out.println("Task 6");
		System.out.println(Arrays.toString(getArray(2, 1)));
		System.out.println(Arrays.toString(getArray(0, 5)));
		System.out.println(Arrays.toString(getArray(10, 2)));
		System.out.println(Arrays.toString(getArray(-1, 3)));
		
		// Task 7
		System.out.println("Task 7");
		System.out.println(Arrays.toString(getArray2(9, 5)));
		System.out.println(Arrays.toString(getArray2(11, 3)));
		System.out.println(Arrays.toString(getArray2(5, 1)));
		System.out.println(Arrays.toString(getArray2(-7, 100)));
		
		// Task 8
		System.out.println("Task 8");
		System.out.println(Arrays.toString(getArray3("src/ba/BITCamp/ajla/s03d05/vjezbe/data.in")));
		System.out.println(Arrays.toString(getArray3("src/ba/BITCamp/ajla/s03d05/vjezbe/ata.in")));

	}

	// Task 1
	public static String merge(String s1, String s2) {
		String c = "";
		int l = s2.length()/2;
		c = s2.substring(0, l).concat(s1).concat(s2.substring(l));
		return c;
	}
	
	// Task 2
	public static String getFirst (String s1, String s2, String s3) {
		if (s1.compareToIgnoreCase(s2) >= 0) {
			if (s1.compareToIgnoreCase(s3) >= 0) {
				return s1;
			} else {
				return s2;
			} 
		} else  {
			return s3;
		}
	}
	
	// Task 3
	public static String getTheRest (String s1, String s2) {
		try {
			return s1.substring(s1.indexOf(s2));
		} catch (StringIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	// Task 4
	public static void writeToFile (String fileName, String msg) {
		try {
			TextIO.writeFile(fileName);
		TextIO.put(msg);
		} catch (IllegalArgumentException e) {
			System.out.println("OOoops! Something went wrong :(");
		}
	}
	
	// Task 5
	
	// Task 6
	public static int[] getArray (int m, int n) {
		int[] arr = new int [10];
		try {
			if (m > 9) {
				throw new IndexOutOfBoundsException();
			}
			for (int i = m; i < 10; i++) {
				arr[i] = n;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dude, your index is out of range!");
			return null;
		}
		return arr;
	}
	
	// Task 7
	public static int[] getArray2 (int n, int k) {
		int[] arr;
		try {
			arr =  new int [n];
			int j = 1;
			for (int i = 0; i < n; i++) {
				if (j > k) {
					j = 1;
				}
				arr[i] = j;
				j++;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Dude, your index is out of range!");
			return null;
		} catch (NegativeArraySizeException e) {
			System.out.println("Dude, array size cannot be a negative value!");
			return null;
		}
		return arr;
	}
	
	// Task 8
	public static int[] getArray3 (String fileName) {
		int[] arr = null;
		try {
			TextIO.readFile(fileName);
			int size = 0;
			while (!TextIO.eof()) {
				@SuppressWarnings("unused")
				int a = Integer.parseInt(TextIO.getln());
				size++;
			}

			arr =  new int [size];
			TextIO.readFile(fileName);
			int index = 0;			
			while (!TextIO.eof()) {
				arr[index] = Integer.parseInt(TextIO.getln());
				index++;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("FileNotFoundException: There is no file with that name");
		} 
		
		return arr;
	}
		
}
