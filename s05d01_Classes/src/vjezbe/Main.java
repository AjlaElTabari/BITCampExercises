package vjezbe;

public class Main {

	public static void main(String[] args) {
		Player thePlayer = new Player("Edin Dzeko", "Man. City", "BiH");
		
		System.out.println(thePlayer);
		
		System.out.println(thePlayer.getGoals());
		System.out.println(thePlayer.addGoals(3));
		System.out.println(thePlayer.getGoals());

	}

}
