

public class LocalVarialbles {

	public static void main(String[] args) {
		int mainInt = 10;
		{
			mainInt -= 2;
			int ifInt = 2;
			System.out.println("ifInt from if: " + ifInt);
			System.out.println("mainInt from if: " + mainInt);
		}
		int ifInt = 55;
		System.out.println("ifInt from main: " + ifInt);
		System.out.println("mainInt from main: " + mainInt);

	}

}
