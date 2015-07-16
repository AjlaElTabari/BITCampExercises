package vjezbe;

public class RastavljanjeBrojaNaProsteFaktore {

	public static void main(String[] args) {
		int num = 290472;
		
		for (int i = 2; i <= num; i++) {
			while(num % i == 0) {
				num /= i;
				System.out.print(i + " ");
			}
		}
		
	}

}
