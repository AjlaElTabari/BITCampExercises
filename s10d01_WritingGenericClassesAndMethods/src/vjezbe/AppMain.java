package vjezbe;

public class AppMain {

	public static void main(String[] args) {
		Application word = new Application("MS Word", 2010, 2.4, 380.50);
		Editor editor = new Editor("MS Word", 2010, 2.4, 380.50, Editor.TEXT, false);
		VideoGame game = new VideoGame("WOW", 2006, 5.5, 11000, "mmorpg", "Blizzard", 3000000);
		
		System.out.println(word);
		System.out.println(editor);
		System.out.println(game);

	}

}
