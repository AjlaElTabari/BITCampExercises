package vjezbe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StopingMultipleThreads extends JFrame {

	private static final long serialVersionUID = -8466181381474815537L;
	private JPanel pnlMain = new JPanel();
	private JButton btnAdd = new JButton("Add");
	private JButton btnStop = new JButton("Stop");
	private ArrayList<Thread> threads = new ArrayList<>();

	public StopingMultipleThreads() {

		pnlMain.setLayout(new GridLayout(2, 1));
		pnlMain.add(btnAdd);
		pnlMain.add(btnStop);

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t = new Thread(new MyThread());
				threads.add(t);
				t.start();
			}

		});

		btnStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (Thread t : threads) {
					t.interrupt();
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				for (Thread t : threads) {
					System.out.println(t.isAlive());
				}
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
		new StopingMultipleThreads();
	}

	private class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <= 100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					break;
				}
			}

		}

	}
}
