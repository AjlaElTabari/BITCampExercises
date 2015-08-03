package predavanja.grep.application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Search {
	private String fileName;
	private String extension;
	private String searchTerm;

	private Queue<File> files;

	public Search(String searchString) throws IllegalArgumentException {
		String[] parts = searchString.split(" ");
		if (parts.length < 2) {
			throw new IllegalArgumentException("Invalid search format.");
		}
		searchTerm = parts[0];
		String[] fileInfo = parts[1].split("\\.");
		if (fileInfo.length < 2) {
			throw new IllegalArgumentException("Invalid search format.");
		}

		fileName = fileInfo[0];
		extension = fileInfo[1];

		// If fileName or extension are *, set them to an empty string, to avoid
		// filter errors
		if (fileName.equals("*")) {
			fileName = "";
		}
		if (extension.equals("*")) {
			extension = "";
		}

		files = new LinkedList<File>();
	}

	public void startSearch() {
		File root = new File(".");
		enqueueFiles(root);

		MyThread[] threads = new MyThread[5];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread();
			threads[i].start();
		}
//		while (!files.isEmpty()) {
//			File f = files.remove();
//
//			if (f.isDirectory()) {
//				enqueueFiles(f);
//				continue;
//			}
//
//			try {
//				BufferedReader reader = new BufferedReader(new FileReader(f));
//				while (reader.ready()) {
//					String line = reader.readLine();
//					if (line.contains(searchTerm)) {
//						System.out.println(f.getName() + ": " + line);
//					}
//				}
//			} catch (IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}

	}

	private synchronized void enqueueFiles(File root) {
		File[] files = root.listFiles(new Filter());

		for (int i = 0; i < files.length; i++) {
			this.files.add(files[i]);
		}
	}

	private class MyThread extends Thread {

		@Override
		public void run() {

			while (true) {
				File f = null;
				
				synchronized (files) {
					if (files.isEmpty()) {
						return;
					}
					f = files.remove();
				}

				if (f.isDirectory()) {
					enqueueFiles(f);
					continue;
				}
				
				try {
					BufferedReader reader = new BufferedReader(new FileReader(f));
					while (reader.ready()) {
						String line = reader.readLine();
						if (line.contains(searchTerm)) {
							System.out.println(f.getName() + ": " + line);
						}
					}
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

	/**
	 * Filter for files by name and extension
	 * 
	 * @author ajla.eltabari
	 *
	 */
	private class Filter implements FileFilter {

		@Override
		public boolean accept(File pathname) {

			if (pathname.isDirectory()) {
				return true;
			}
			if (fileName.isEmpty() && extension.isEmpty()) {
				return true;
			}

			String file = fileName + '.' + extension;

			return pathname.getName().contains(file);

		}
	}
}
