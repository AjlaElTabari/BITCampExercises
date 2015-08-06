package predavanja.chat;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame {

	private static final long serialVersionUID = -1857923356690665286L;

		// Declaring socket
		private Socket client;
		private BufferedWriter writer;
		private BufferedReader reader;
		
		private ExecutorService pool = Executors.newSingleThreadExecutor();

		// GUI attributes
		private JPanel pnlMain = new JPanel();
		private JPanel pnlChatHistory = new JPanel();
		private JPanel pnlMsg = new JPanel();
		private JTextArea taChatHistory = new JTextArea();
		private JTextField txtMsg = new JTextField();

		private JScrollPane scroll = new JScrollPane(taChatHistory);

		/**
		 * Constructor Allows client to receive and send message to the server.
		 */
		public ClientGUI() {
			// sockets and writers
			try {
				client = new Socket("localhost", 6815);
				writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			} catch (IOException e2) {
				System.exit(1);
				e2.printStackTrace();
			}
			
			// GUI appearance of client chat window
			// Panels settings
			pnlMain.setLayout(new BorderLayout());

			pnlChatHistory.setLayout(new BorderLayout());
			pnlChatHistory.setBorder(BorderFactory.createTitledBorder("Chat"));

			pnlChatHistory.add(scroll);

			// Scroll to be able to see all chat history
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

			pnlMsg.setLayout(new BorderLayout());
			pnlMsg.setBorder(BorderFactory.createTitledBorder("Input message"));
			pnlMsg.add(txtMsg);

			// Text area settings
			taChatHistory.setEditable(false);
			taChatHistory.setLineWrap(true);
			taChatHistory.setFont(new Font("Monospace", Font.PLAIN, 14));

			// Text box for entering new message settings
			// Adding key listener to be able to send message on pressing ENTER key
			txtMsg.addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e) {
					// Checking if ENTER is pressed
					if (e.getKeyCode() == KeyEvent.VK_ENTER
							&& !txtMsg.getText().equals("")) {
						pool.submit((new Runnable() {

							@Override
							public void run() {
								try {
									writer.write(txtMsg.getText());
									writer.newLine();
									writer.flush();

									// Refreshing text area that contains chat history
									txtMsg.setText("");		
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}));
					}
				}
			});

			//
			taChatHistory.setFont(new Font("Monospace", Font.PLAIN, 14));

			pnlMain.add(pnlChatHistory, BorderLayout.CENTER);
			pnlMain.add(pnlMsg, BorderLayout.SOUTH);

			add(pnlMain);

			// Chat window settings
			setSize(450, 600);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocation(770, 150);
			setTitle("Client Chat");
			setVisible(true);

			new Thread (new Runnable() {

				@Override
				public void run() {
					for (;;) {
						String line = "";
						try {
							line = reader.readLine();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
						// Adding new message to the chat history
						taChatHistory.append(line);
					}					
				}				
			});
			//runClient();
		}
		
		public static void main(String[] args) {
			new ClientGUI();
		}
}
