package vjezbe;

public class Main {

	public static void main(String[] args) {
//		Line l = new Line(15);
//		l.drawOnConsole();
//		Rectangle r = new Rectangle(15, 8);
//		System.out.println();
//		System.out.println();
//		r.drawOnConsole();
//		
//		System.out.println(r.getArea());
//		System.out.println(r.getCircumference());
//		
//		System.out.println(l.getArea());
//		System.out.println(l.getCircumference());
		
		// Task2
		
//		Drawable[] drawables = new Drawable[50];
//		for (int i = 0; i < drawables.length; i++) {
//			if (i % 2 == 0) {
//				drawables[i] = new Line((int)(Math.random() * 5 + 1));
//				drawables[i].drawOnConsole();
//			} else {
//				drawables[i] = new Rectangle((int)(Math.random() * 5 + 1), (int)(Math.random() * 5 + 1));
//				drawables[i].drawOnConsole();
//			}
//		}
		
		// Task3
//		Clock c = new Clock(22, 16, 52);
//		c.addToFile("src/ba/bitcamp/ajla/vjezbe/Clock.txt", Clock.MILITARY_FORMAT_NO_SECONDS);
		
		// Task 4
		
		char[] characters = {'a', 'j', 'l', 'a'};
		StringBuilderCamp csb = new StringBuilderCamp(characters);
		String str = " el tabari";
		//csb.append(str);
		csb.prepend(str);
		
	
		
		System.out.println(csb);
	}

}
