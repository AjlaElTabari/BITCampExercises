package vjezbe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GEmailAvilability extends JFrame {

	private static final long serialVersionUID = -1367367803194839238L;
	
	private JButton btnEmail = new JButton("Enter email");
	private String email = "";
	private String[]  emails = new String[] {"ajla@tabari.me", "ajla.etabari@bitcamp.ba", "squavv@gmail.com", "social@tabari.me"};
	
	public GEmailAvilability() {
		add(btnEmail);
		btnEmail.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setLocationRelativeTo(null);
		setTitle("Email Availability");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GEmailAvilability window = new GEmailAvilability();
		System.out.println("Text: " + window.email);
	}
	
	private class MyDialog extends JDialog {

		private static final long serialVersionUID = -4733600589784277845L;
		
		private JTextField field = new JTextField();
		private JButton click = new JButton("Check availability");
		
		public MyDialog() {
			setLayout(new BorderLayout());
			add(field);
			add(click, BorderLayout.SOUTH);
			click.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					email = field.getText();
					boolean emailExists = false;
					for (int i = 0; i < emails.length; i++) {
						if (emails[i].equals(email)) {
							emailExists = true;
						}
					}
					if (emailExists) {
						btnEmail.setText("Entered email already exists.");
					} else {
						btnEmail.setText("Good choice!");
					}
					dispose();
				}
			});
			
			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(200, 200);
			setLocationRelativeTo(null);
			setTitle("Example JDialog");
			setVisible(true);
		}
	}
}