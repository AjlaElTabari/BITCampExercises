package vjezbe;

public class MainLinkedList {

	public static void main(String[] args) {
		
		Song[] songs = new Song[10];
		for (int i = 0; i < 10; i++) {
			songs[i] = new Song("title" + i, "author" + i, 2015, Song.ROCK);
		}

		Song song = new Song("New song", "New author", 2014, Song.METAL);
		
		LinkedListSong songsList = new LinkedListSong(songs);
//		songsList.add(song);
//		songsList.add(song);
//		songsList.add(song);
		
		System.out.println(songsList);

	}

}
