package game;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MessageInABottle extends JFrame {
	private static final long serialVersionUID = 6989983737531907673L;
	
	private JPanel pnlChat = new JPanel();
	private JTextField txtMsg = new JTextField();
	private JButton btnSend = new JButton("Send");
	
	MessageInABottle() {
		setTitle("Chat");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnlChat.setLayout(new BorderLayout());
		pnlChat.add(txtMsg, BorderLayout.CENTER);
		pnlChat.add(btnSend, BorderLayout.SOUTH);
		add(pnlChat);

		setVisible(true);
		
		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMsg(txtMsg.getText());	
			}
		});
		
		txtMsg.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e)
		      {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER)
		        {
		        	sendMsg(txtMsg.getText());
		        }
		      }
		});
	}
	
	private void sendMsg(String msg) {
		try {
			Socket toZaid = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(toZaid.getOutputStream()));
			
			writer.write(msg);
			writer.newLine();
			writer.flush();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MessageInABottle();

	}

}
