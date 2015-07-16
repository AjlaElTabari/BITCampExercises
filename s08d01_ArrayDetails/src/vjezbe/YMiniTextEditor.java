package vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class YMiniTextEditor extends JFrame {

	private static final long serialVersionUID = 511583997605354571L;
	JMenuBar mainBar = new JMenuBar();
	JMenu mainMenu = new JMenu("Text manipulation");
	JMenuItem miInsert = new JMenuItem("Insert text");
	JTextArea taText = new JTextArea();
	private JDialog jdInsertText = null;

	public YMiniTextEditor() {
		miInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jdInsertText = new JDialog() {
					private static final long serialVersionUID = 1L;

					@Override
					public float getAlignmentY() {
						JTextField tfAdditionalText = new JTextField();
						JTextField tfIndex = new JTextField();
						
						tfAdditionalText.addKeyListener(new KeyAdapter() {

							@Override
							public void keyPressed(KeyEvent e) {
								if (e.getKeyCode() == KeyEvent.VK_ENTER) {
									taText.setText(taText.getText() + " " + tfAdditionalText.getText());
									jdInsertText.dispose();
								}								
							}
							
						});
						
						tfIndex.addKeyListener(new KeyAdapter() {

							@Override
							public void keyPressed(KeyEvent e) {
								if (e.getKeyCode() == KeyEvent.VK_ENTER) {
									taText.setText(taText.getText().substring(0, Integer.parseInt(tfIndex.getText())) + tfAdditionalText.getText() + 
											taText.getText().substring(Integer.parseInt(tfIndex.getText())));
									jdInsertText.dispose();
								}
								
							}
							
						});
						
						jdInsertText.setLayout(new GridLayout(2, 1));
						jdInsertText.add(tfAdditionalText);
						jdInsertText.add(tfIndex);
						
						setModalityType(ModalityType.APPLICATION_MODAL);
						setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
						setSize(200, 200);
						setLocationRelativeTo(null);
						setTitle("Example JDialog");
						setVisible(true);
						
						return 0.0f;
					}
				};
				jdInsertText.getAlignmentY();

			}

		});
		setJMenuBar(mainBar);

		mainBar.add(mainMenu);
		mainMenu.add(miInsert);

		taText.setEnabled(false);
		add(taText);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setTitle("Mini Text Editor");
		setVisible(true);
	}

	public static void main(String[] args) {
		new YMiniTextEditor();

	}

}
