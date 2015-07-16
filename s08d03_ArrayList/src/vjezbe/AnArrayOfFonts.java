package vjezbe;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnArrayOfFonts extends JFrame {

	private static final long serialVersionUID = -1681600328778469191L;
	private JPanel pnlFonts = new JPanel();
	
	public AnArrayOfFonts() {
		
		pnlFonts.setLayout(new GridLayout(8, 5));
		Font[] fonts = new Font[40];
		
		for (int i = 0; i < fonts.length; i++) {
			fonts[i] = new Font("Monospace", Font.PLAIN, i + 1);
		}
		
		String s = "A";
		for (int i = 0; i < fonts.length; i++) {
			JLabel jl = new JLabel();
			jl.setFont(fonts[i]);
			jl.setText(s);
			pnlFonts.add(jl);
		}

		add(pnlFonts);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Email Availability");
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnArrayOfFonts();

	}

}
