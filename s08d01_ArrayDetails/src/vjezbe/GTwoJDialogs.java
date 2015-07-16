package vjezbe;

import java.awt.Dialog.ModalityType;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GTwoJDialogs extends JFrame{

	private static final long serialVersionUID = 8158614450246688841L;
	private JButton btnModeless = new JButton("Modeless");
	private JButton btnModal = new JButton("Modal");
	private JPanel pnlMain = new JPanel();
	
	public GTwoJDialogs() {
		btnModeless.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialogModeless = new JDialog();
				
				dialogModeless.setModalityType(ModalityType.MODELESS);
				dialogModeless.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				dialogModeless.setSize(200, 100);
				dialogModeless.setLocationRelativeTo(null);
				dialogModeless.setTitle("Modeless");
				dialogModeless.setVisible(true);
				
			}
			
		});
		
		btnModal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialogModal = new JDialog();
				
				dialogModal.setModalityType(ModalityType.APPLICATION_MODAL);
				dialogModal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				dialogModal.setSize(200, 100);
				dialogModal.setLocationRelativeTo(null);
				dialogModal.setTitle("Modal");
				dialogModal.setVisible(true);
				
			}
			
		});
		
		pnlMain.setLayout(new GridLayout(2, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setTitle("Main frame");
		
		add(pnlMain);
		pnlMain.add(btnModeless);
		pnlMain.add(btnModal);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GTwoJDialogs();

	}

}
