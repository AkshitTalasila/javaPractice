import java.util.*;

public class Album{
	
	private String name;
	private String artist;
	private ArrayList<Song> songs = new ArrayList<>();

	public Album(String name, String artist){

		this.name = name;
		this.artist = artist;
	}

	private Song findSong(String name){
		
		for(Song i:songs){

			if(i.getTitle().equals(name)){

				return i;
			}
		}

		return null;
	}

	public boolean addSong(String title, double duration){

			if(findSong(title) == null){

				Song song = new Song(title,duration);
				songs.add(song);
				return true;
			}else{
				
				return false;
			}
	}

	public boolean addToPlayList(int track, LinkedList<Song> playList){

		if(track>=1 && track<=songs.size()){

			playList.add(songs.get(track-1));
			return true;
		}else{

			return false;
		}
	}

	public boolean addToPlayList(String name, LinkedList<Song> playList){

		if(findSong(name) != null){

			playList.add(findSong(name));
			return true;
		}else{
			
			return false;
		}
	}

}
