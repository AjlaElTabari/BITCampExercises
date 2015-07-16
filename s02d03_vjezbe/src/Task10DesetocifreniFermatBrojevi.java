
public class Task10DesetocifreniFermatBrojevi {

	public static void main(String[] args) {

		for (long i = 1; i <= 20; i++) {
			long fermatNo = (long)(Math.pow(2, (Math.pow(2, i))) + 1);
			//if (fermatNo > 1000000000 && fermatNo < 999999999*10) {
				System.out.println(fermatNo);					
			//}		
		}
	}

}
