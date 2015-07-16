package vjebe;

public class Test {

	public static void main(String[] args) {
		System.out.printf("%.2f\n", getPercentage(25, 100));
		System.out.printf("%.2f\n", getPercentage(10, 20));
		System.out.printf("%.2f\n", getPercentage(30, 35));
		System.out.printf("%.2f\n", getPercentage(3, 10));

	}

	// getPercentage(int. int) method i sreceivent two int parameters
	// first one is number  of points scored on exam
	// second one is maximum points that could be scored on that exam
	// method is returning scored percentage 
	public static double getPercentage(int n, int m) {
		double res =  n * 100.0 / m;
		return res;

	}

}
