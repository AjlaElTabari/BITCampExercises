package vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GUI_RecursiveTree {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		// Recursive tree
		g.setColor(Color.WHITE);
    	g.fillRect(0, 0, 800, 800);

		g.setColor(Color.BLACK);
		int x = 300, y = 800;
		g.drawLine(x, y, x, y - 100);
		
		drawTree(g, x, y);
		
		// *******************
		w.setImage(img);
	}
	
	public static void drawTree(Graphics g, int x, int y) {
		if (x < 0) {
			return;
		}
		int x2 = x - 50;
		int y2 = y - 150;
		g.drawLine(x, y-50, x2, y2);
		drawTree(g, x2, y2);
		
	}
}
