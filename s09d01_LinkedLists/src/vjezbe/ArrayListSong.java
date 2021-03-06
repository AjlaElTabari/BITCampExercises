package vjezbe;

import java.util.Arrays;

public class ArrayListSong {

	Song[] listOfSongs;
	
	/**
	 * Empty constructor
	 */
	public ArrayListSong() {
		this.listOfSongs = new Song[0];
	}
	
	/**
	 * Constructor, receives an array of songs, and create an ArrayList of songs
	 * @param songs
	 */
	public ArrayListSong(Song[] songs) {
		
		this.listOfSongs = new Song[songs.length];
		
		for (int i = 0; i < listOfSongs.length; i++) {
			listOfSongs[i] = songs[i];
		}
	}
	
	/**
	 * Adds a song to the list of songs
	 * @param song
	 */
	public void add(Song song) {
		if (listOfSongs.length == 0) {
			this.listOfSongs = new Song[1];
			listOfSongs[0] = song;
		} else {
			int newLength = listOfSongs.length + 1;
			Song[] newSongs = new Song[newLength];
			for (int i = 0; i < listOfSongs.length; i++) {
				newSongs[i] = listOfSongs[i];
			}
			newSongs[newLength - 1] = song;
			listOfSongs = newSongs;
		}
	}
	
	/**
	 * Returns a song from specified index
	 * @param obj
	 * @return
	 */
	public Song getSong(int index) throws ArrayIndexOutOfBoundsException {
		if(index < 0 || index > listOfSongs.length - 1) {
			throw new ArrayIndexOutOfBoundsException("There is no specified index!");
		} else {
			return listOfSongs[index];
		}
	}
	
	/**
	 * Removes a song from the array by received index
	 * @param obj
	 * @return
	 */
	public void remove(int index) throws ArrayIndexOutOfBoundsException {
		Song[] newSongs = null;
		if(index < 0 || index > listOfSongs.length - 1) {
			throw new ArrayIndexOutOfBoundsException("There is no specified index!");
		} else {
			newSongs = new Song[listOfSongs.length - 1];
			for (int i = 0; i < newSongs.length; i++) {
				if (i != index) {
					newSongs[i] = listOfSongs[i];
				} else {
					newSongs[i] = listOfSongs[i + 1];
				}
			}
		}
		listOfSongs = newSongs;
	}
	
	/**
	 * Removes a song from the array by received element (song)
	 * @param obj
	 * @return
	 */
	public void remove(Song song) {
		int index = 0;
		for (int i = 0; i < listOfSongs.length; i++) {
			if (listOfSongs[i].equals(song)) {
				index = i;
				break;
			}
		}
		remove(index);
	}
	
	/**
	 * Returns length od an array
	 * @param obj
	 * @return
	 */
	public int size() {
		return listOfSongs.length;
	}
	
	/**
	 * Returns index of received element (song)
	 * Returns -1 if index does not exist
	 * @param obj
	 * @return
	 */
	public int indexOf(Song song) {
		int index = -1;
		for (int i = 0; i < listOfSongs.length; i++) {
			if (listOfSongs[i].equals(song)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(listOfSongs, other.listOfSongs))
			return false;
		return true;
	}
	
	public String toString() {
		String result = "";
		
		for (int i = 0; i < listOfSongs.length; i++) {
			result += listOfSongs[i] + "\n";
		}
		return result;
	}
}
