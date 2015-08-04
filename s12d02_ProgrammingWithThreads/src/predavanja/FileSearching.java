package predavanja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class FileSearching {
		private String fileName;
		private String searchTerm;

		private Queue<File> files;

		public FileSearching(String searchString) throws IllegalArgumentException {
			String[] parts = searchString.split(" ");
			if (parts.length < 2) {
				throw new IllegalArgumentException("Invalid search format.");
			}
			searchTerm = parts[0];
			fileName = parts[1];

			files = new LinkedList<File>();
		}

		public void startSearch() {
			File root = new File(".");
			enqueueFiles(root);
		}

		private synchronized void enqueueFiles(File root) {
			File[] files = root.listFiles(new Filter());

			for (int i = 0; i < files.length; i++) {
				this.files.add(files[i]);
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
				//if(pathname.)
	return true;

			}
		}
}
