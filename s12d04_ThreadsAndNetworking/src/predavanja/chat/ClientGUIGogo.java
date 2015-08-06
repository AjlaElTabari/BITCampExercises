package predavanja.chat;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUIGogo extends JFrame {
	private static final long serialVersionUID = -8398746795013747800L;
	private JPanel panel = new JPanel();
	private JPanel panel1 = new JPanel();
	private JTextArea textArea = new JTextArea();
	private JTextField text = new JTextField();
	private JButton send = new JButton("SEND");

	Socket socket = null;
	BufferedWriter writer = null;
	BufferedReader reader = null;
	private ExecutorService pool = Executors.newSingleThreadExecutor();

	public ClientGUIGogo() {
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout());
		panel.add(textArea, BorderLayout.CENTER);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		
		add(panel1, BorderLayout.SOUTH);
		panel1.setLayout(new BorderLayout());
		panel1.add(text, BorderLayout.CENTER);
		panel1.add(send, BorderLayout.EAST);
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		try {

			socket = new Socket("10.0.82.27", 6815);
			writer = new BufferedWriter(new OutputStreamWriter(
			socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(
			socket.getInputStream()));
		} catch (IOException e1) {

			e1.printStackTrace();

			System.exit(1);

		}

		send.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				pool.submit(new Runnable() {

					@Override
					public void run() {

						try {

							writer.write(text.getText());

							// textArea.append("Gordan: " + text.getText() +
							// "\n");

							text.setText("");

							writer.newLine();

							writer.flush();

						} catch (IOException e1) {

							e1.printStackTrace();

						}

					}

				});

			}

		});

		setTitle("ChatRoom");

		setSize(500, 300);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setVisible(true);

		setResizable(true);

		setVisible(true);

		new Thread(new Runnable() {

			@Override
			public void run() {

				for (;;) {

					try {

						String line = reader.readLine();

						textArea.append(line + "\n");

					} catch (IOException e) {

						e.printStackTrace();

					}

				}

			}

		}).start();

	}

	public static void main(String[] args) {

		new ClientGUIGogo();

	}

}
