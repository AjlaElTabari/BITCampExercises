package vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackgroundCalculations extends JFrame {

	private static final long serialVersionUID = 1784959589398671632L;
	private JPanel pnlMain = new JPanel();
	private JButton btnStart = new JButton("Start");
	public static JLabel lblPrimeNos = new JLabel();
	
	public BackgroundCalculations() {
		
		pnlMain.setLayout(new GridLayout(2, 1));
		pnlMain.add(lblPrimeNos);
		pnlMain.add(btnStart);
		
		PrimeCounter thread = new PrimeCounter(10, 1_000_000);
		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				thread.start();	
			}
			
		});
		
		add(pnlMain);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(770, 150);
		setTitle("Multiple Threads Maniputlation");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BackgroundCalculations();
	}

}
