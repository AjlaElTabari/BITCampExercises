package vjezbe;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientGUI extends JFrame {
	
	private static final long serialVersionUID = -2568163527850438474L;
	private static final int SIZE = 35;
	private JPanel pnlGrid = new JPanel();
	private JLabel[][] lblsGrid = new JLabel[SIZE][SIZE];
	private int x = 0;
	private int y = 0;
	private String keyPressed;

	public ClientGUI() {
		pnlGrid.setLayout(new GridLayout(SIZE, SIZE));
		for (int i = 0; i < lblsGrid.length; i++) {
			for (int j = 0; j < lblsGrid[i].length; j++) {
				lblsGrid[i][j] = new JLabel();
				lblsGrid[i][j].setName("lbl" + i + "" + j);
				pnlGrid.add(lblsGrid[i][j]);
				lblsGrid[i][j].setOpaque(true);
				lblsGrid[i][j].setBackground(Color.WHITE);
			}
		}

		lblsGrid[y][x].setBackground(Color.RED);
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_D) {
					lblsGrid[y][x].setBackground(Color.WHITE);
					x = (x < SIZE - 1) ? x + 1 : 0;
					lblsGrid[y][x].setBackground(Color.RED);
					Client.sendToServer("D");
				} else if (e.getKeyCode() == KeyEvent.VK_A) {
					lblsGrid[y][x].setBackground(Color.WHITE);
					x = (x > 0) ? x - 1 : SIZE - 1;
					lblsGrid[y][x].setBackground(Color.RED);
					Client.sendToServer("A");
				} else if (e.getKeyCode() == KeyEvent.VK_W) {
					lblsGrid[y][x].setBackground(Color.WHITE);
					y = (y > 0) ? y - 1 : SIZE - 1;
					lblsGrid[y][x].setBackground(Color.RED);
					Client.sendToServer("W");
				}  else if (e.getKeyCode() == KeyEvent.VK_S) {
					lblsGrid[y][x].setBackground(Color.WHITE);
					y = (y < SIZE - 1) ? y + 1 : 0;
					lblsGrid[y][x].setBackground(Color.RED);
					Client.sendToServer("S");
				}	
			}
		});
		
		add(pnlGrid);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(770, 150);
		setTitle("Client");
		setVisible(true);
	}
	
	
}
