


public class VjezbeBonusTask {

	public static void main(String[] args) {
		
		int num = 100;
		int counter = 1;
		int i = 0;
		boolean isFreeNum = true;
		
		System.out.println(1);
		
		while (i <= num) {
			while (counter < num / 2) {
				if (num % counter == 0) {
					
					isFreeNum = false;
					break;
				}
				counter += 2;
			}
			if (isFreeNum) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
