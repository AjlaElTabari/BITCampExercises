package vjezbe;

public class LinkedListSong {
	private Node start;
	
	/**
	 * Empty Constructor
	 */
	public LinkedListSong() {
		this.start = null;
	}
	
	/**
	 * Adds song to the linked list
	 */
	public void add(Song song) {
		if (start == null) {
			start = new Node(song);
		} else {
			Node last = getLastNode();
			last.setNextNode(new Node(song));
		}
	}
	 /**
	  * Returns last song in linked list
	  * @return
	  */
	private Node getLastNode() {
		if (start == null) {
			return null;
		}
		
		Node temp = start;
		while (temp.getNextNode() != null) {
			temp = temp.getNextNode();
		}
		return temp;
	}
	
	/**
	 * Constructor
	 * @param song
	 */
	public LinkedListSong(Song[] songs) {
		for (int i = 0; i < songs.length; i++) {
			add(songs[i]);
		}
	}
	
	@Override
	public String toString() {
		if (start == null) {
			return "The list is empty";
		}
		
		return start.toString();
	}
	
	private class Node {
		private Song song;
		private Node next;
		
		public Node(Song song) {
			this.song = song;
		}
		
		public Song getValue() {
			return song;
		}
		
		public Node getNextNode() {
			return next;
		}
		
		public void setNextNode(Node next) {
			this.next = next;
		}
		
		@Override
		public String toString() {
			if (next == null) {
				return song + ""; 
			}
			
			return song + " " + next.toString();
		}
	}
}
