package vjezbe;

public class ReadArgsFromTheFile {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			int num = 0;
			num = Integer.parseInt(args[i]);
			if (num % 5 == 0) {
				System.out.println(num);
			}
		}

	}

}
