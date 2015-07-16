package vjezbe;
public class TablicaMnozenjaUredjena {

	public static void main(String[] args) {
		TextIO.writeFile("tablicaMnozenja.txt");
		
		TextIO.put("* |");
		for (int a = 1; a <= 9; a++) {
			TextIO.put(" " + a + " ");
		}
		TextIO.putln();

		TextIO.put(" - ");
		for (int b = 1; b <= 9; b++) {
			TextIO.put(" - ");
		}
		TextIO.putln();
		
		for (int i = 1; i <= 9; i++) {
			TextIO.put(i + " |");
			for (int j = 1; j <= 9; j++) {
				TextIO.putf("%2d ", i*j);
				}
				
			TextIO.putln();
		}

	}

}
