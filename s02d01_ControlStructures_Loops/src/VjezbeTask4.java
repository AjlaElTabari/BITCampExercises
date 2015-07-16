

public class VjezbeTask4 {

	public static void main(String[] args) {
		int n = 5, nF = n;
		
		while (n > 1) {
			nF *= (n-1);
			n--;
		}
		System.out.println(nF);
	}

}
