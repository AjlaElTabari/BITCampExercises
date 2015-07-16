package vjebe;

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
		
		drawRectangle(4, 6, g);
		// *******************
		w.setImage(img);
	}
	
	public static void drawRectangle (int m, int n, Graphics g) {

		int x = 0, y = 0;
		for (int i = 0; i < m; i++) {
			x = 0;
			y += 50;
			
			for (int j = 0; j < n; j++) {
				x += 50;
				g.setColor(Color.BLACK);
				g.drawRect(x, y, 50, 50);
			}
		}
		
	}
}
