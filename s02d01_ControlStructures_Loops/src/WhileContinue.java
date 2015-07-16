

public class WhileContinue {

	public static void main(String[] args) {
		//Nesto nije ok :D
		int broj = 0;
		while (broj++ < 100) {
			if (broj % 3 != 0){
				continue;
			}
			System.out.println(broj);
		}

	}

}
