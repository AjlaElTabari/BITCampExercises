
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		TextIO.readFile("src/ba/BITCamp/A_Team/Drawing/ConfigurationFile");
		
		g.setColor(Color.BLACK);
		
		while (!TextIO.eof()) {
			
			String str = TextIO.getln();
			String[] string = str.split(" ");
			String[] emptyString = new String[6];
			
			for(int i = 0; i < string.length; i++) {
				emptyString[i] = string[i];
			}
			
			for(int i= 0; i < emptyString.length; i++) {
				switch(string[0]) {
					case "L":
						g.drawLine(Integer.parseInt(string[1]), Integer.parseInt(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]));
						break;
					case "R":
						g.drawRect(Integer.parseInt(string[1]), Integer.parseInt(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]));
						break;
					case "FR":
						g.fillRect(Integer.parseInt(string[1]), Integer.parseInt(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]));
						break;
					case "S":
						g.drawString(string[1], Integer.parseInt(string[2]),Integer.parseInt(string[3]));
						break;
					case "Chess":
						drawChess(Integer.parseInt(string[1]), g);
						break;
					case "C":
						g.setColor(new Color(Integer.parseInt(string[1]), Integer.parseInt(string[2]), Integer.parseInt(string[3])));
					case "Star":
						star(g, Integer.parseInt(string[1]));
						break;
					case "O":
						g.drawOval(Integer.parseInt(string[1]), Integer.parseInt(string[2]), Integer.parseInt(string[3]), Integer.parseInt(string[4]));
						break;
					case "bh":
						bhFlag(g);
						break;
					case "MM":
						mickeyMouse(g);
				}
			}
		}
		
		// *******************
		w.setImage(img);
	}
	
		public static void drawChess(int size, Graphics g) {
			int x, y;

			for (int row = 0; row < 8; row++) {

				for (int col = 0; col < 8; col++) {
					x = col * size;
					y = row * size;
					if ((row % 2) == (col % 2))
						g.setColor(Color.WHITE);
					else
						g.setColor(Color.black);
					g.fillRect(x, y, size, size);
				}
			}
		}
		
		public static void star(Graphics g, int x) {
			g.setColor(Color.BLACK);
			
			g.drawLine(4 * x, x, 2 * x, 6 * x);
			g.drawLine(4 * x, x, 6 * x, 6 * x);
			g.drawLine(x, 3 * x, 7 * x, 3 * x);
			g.drawLine(x, 3 * x, 6 * x, 6 * x);
			g.drawLine(2 * x, 6 * x, 7 * x, 3 * x);
			
		}
		
		public static void bhFlag(Graphics g) {
			
			g.setColor(Color.BLUE);
			g.fillRect(370, 100, 200, 100);
			g.setColor(Color.YELLOW);
			g.fillRect(450, 125, 80, 50);
			g.setColor(Color.BLUE);
			g.drawLine(450, 125, 530, 175);
			
			
		}
		
		public static void mickeyMouse(Graphics g) {
			g.setColor(Color.BLACK);
			g.fillOval(50, 50, 120, 120);//lijevo uho
			g.fillOval(200, 50, 120, 120);//desno uho
			g.setColor(Color.LIGHT_GRAY);
			g.fillOval(65, 65, 100, 100);
			g.fillOval(205, 65, 100, 100);
			g.setColor(Color.BLACK);
			g.fillOval(90, 120, 200, 200);//glava
			g.setColor(Color.WHITE);
			g.fillOval(130, 160, 40, 60);
			g.fillOval(210, 160, 40, 60);
			g.setColor(Color.DARK_GRAY);
			g.fillOval(140, 180, 25, 30);
			g.fillOval(215, 180, 25, 30);
			g.setColor(Color.WHITE);
			g.fillOval(150, 240, 80, 30);
			g.setColor(Color.BLACK);
			g.fillOval(200, 260, 20, 20);
			g.fillOval(160, 260, 20, 20);
		}
}
