package vjezbe;

import java.awt.Dialog.ModalityType;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RCommentsPage extends JFrame {

	private static final long serialVersionUID = -2229859109127131695L;
	private JPanel pnlMain = new JPanel();
	
	private JLabel lblName = new JLabel("Name");
	private JTextField tfName = new JTextField();
	
	private JLabel lblEmail = new JLabel("e-mail");
	private JTextField tfEmail = new JTextField();
	
	private JButton submit = new JButton("Submit");
	
	private JDialog jpMessage = new JDialog();
	private JTextField jfMessage = new JTextField();
	
	public RCommentsPage() {
		pnlMain.setLayout(new GridLayout(3, 2));
		
		pnlMain.add(lblName);
		pnlMain.add(tfName);
		
		pnlMain.add(lblEmail);
		pnlMain.add(tfEmail);
		
		pnlMain.add(submit);
		
		add(pnlMain);
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tfEmail.getText().contains("@") || !tfEmail.getText().contains(".")) {
					jpMessage.add(jfMessage);
					jpMessage.setModalityType(ModalityType.APPLICATION_MODAL);
					jpMessage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					jpMessage.setSize(200, 100);
					jpMessage.setLocationRelativeTo(null);
					jpMessage.setTitle("Modal");
					
					jfMessage.setText("e-mail is not valid.");

					jpMessage.setVisible(true);

				} else {
					jpMessage.add(jfMessage);
					jpMessage.setModalityType(ModalityType.APPLICATION_MODAL);
					jpMessage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					jpMessage.setSize(200, 100);
					jpMessage.setLocationRelativeTo(null);
					jpMessage.setTitle("Modal");

					jfMessage.setText("Your comment is successfuly submited.");

					jpMessage.setVisible(true);
				}
				
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 150);
		setLocationRelativeTo(null);
		setTitle("Email Availability");
		setVisible(true);
	}

	public static void main(String[] args) {
		new RCommentsPage();

	}

}
