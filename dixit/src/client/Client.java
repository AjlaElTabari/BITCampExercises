package client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame {
	private static final long serialVersionUID = -3135347825165707732L;
	private static Map<Integer, BufferedImage> cards = new HashMap<>();

	// Panels
	private JPanel pnlMain = new JPanel();
	private JPanel pnlHeader = new JPanel();
	private JPanel pnlHand = new JPanel();
	private JPanel pnlScores = new JPanel();

	// Buttons
	private JButton btnDice = new JButton("Roll");
	private JButton btnDraw = new JButton("Draw");
	
	/**
	 * Constructor that makes Players window for DiXit game. 
	 */
	public Client() {
		// Panels Layouts
		pnlMain.setLayout(new BorderLayout());
		pnlHeader.setLayout(new BorderLayout());
		pnlHand.setLayout(new FlowLayout());

		// Main panel
		pnlMain.add(pnlHeader, BorderLayout.NORTH);

		// Header panel
		pnlHeader.add(btnDice, BorderLayout.WEST);
		pnlHeader.add(btnDraw, BorderLayout.EAST);

		// Hand panel

		// Scores panel
	}

	public static void main(String[] args) {
		// filling map with cards ids and images
		HelperMethods.loadCardImages(cards);
	}
}
