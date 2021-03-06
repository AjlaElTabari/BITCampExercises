package vjezbe;

public class Main {

	public static void main(String[] args) {
		Song[] songs = new Song[10];
		for (int i = 0; i < 10; i++) {
			songs[i] = new Song("title" + i, "author" + i, 2015, Song.ROCK);
		}

		Song song = new Song("New song", "New author", 2014, Song.METAL);
		
		ArrayListSong songsList = new ArrayListSong(songs);
		System.out.println(song);
		System.out.println(songsList);
		
		songsList.add(new Song("Brand new song", "Brand new author", 2014, Song.JAZZ));
		System.out.println(songsList);
		
		ArrayListSong songsList1 = new ArrayListSong();
		System.out.println(songsList1);
		songsList1.add(new Song("Brand new song", "Brand new author", 2014, Song.JAZZ));
		System.out.println(songsList1);
		
		System.out.println(songsList.listOfSongs.length);
		songsList.remove(5);
		System.out.println(songsList.listOfSongs.length);
		
		System.out.println(songsList.size());
		
		songsList.add(song);
		System.out.println(songsList);
		System.out.println(songsList.indexOf(song));
		
	}

}
