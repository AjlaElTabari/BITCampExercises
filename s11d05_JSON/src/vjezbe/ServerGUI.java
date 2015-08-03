package vjezbe;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ServerGUI extends JFrame{
	
	private static final long serialVersionUID = -2568163527850438474L;
	private static final int SIZE = 35;
	private JPanel pnlGrid = new JPanel();
	private JLabel[][] lblsGrid = new JLabel[SIZE][SIZE];
	private int x = 0;
	private int y = 0;

	public ServerGUI() {
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
	
		add(pnlGrid);
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(770, 150);
		setTitle("Server");
		setVisible(true);
		
	}

	public void draw(String command) {
		if (command.equals("D")) {
			lblsGrid[y][x].setBackground(Color.WHITE);
			x = (x < SIZE - 1) ? x + 1 : 0;
			lblsGrid[y][x].setBackground(Color.RED);
		} else if (command.equals("A")) {
			lblsGrid[y][x].setBackground(Color.WHITE);
			x = (x > 0) ? x - 1 : SIZE - 1;
			lblsGrid[y][x].setBackground(Color.RED);
		} else if (command.equals("W")) {
			lblsGrid[y][x].setBackground(Color.WHITE);
			y = (y > 0) ? y - 1 : SIZE - 1;
			lblsGrid[y][x].setBackground(Color.RED);
		}  else if (command.equals("S")) {
			lblsGrid[y][x].setBackground(Color.WHITE);
			y = (y < SIZE - 1) ? y + 1 : 0;
			lblsGrid[y][x].setBackground(Color.RED);
		}	
		
	}

}
