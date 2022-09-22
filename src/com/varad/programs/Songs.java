package com.varad.programs;
import java.util.*;


public class Songs {

	public static Song[] sortViewersWithLanguage(Song[] songArray) {
		
		ArrayList<Song> newSongArray = new ArrayList<Song>();
		for(Song s:songArray) {
			if(s.songLang.equals("English")) {
				newSongArray.add(s);
			}
		}
		if(newSongArray.size() == 0) {
			return null;
		}
		else {
			Collections.sort(newSongArray, new Comparator<Song>(){

				  public int compare(Song o1, Song o2)
				  {
				     return Integer.compare(o1.songViewers, o2.songViewers);
				  }
				});
			
			Song[] arr = new Song[newSongArray.size()]; 
	        arr = newSongArray.toArray(arr); 
	        return arr;
		}
	}
	
	public static boolean findSongWithId(Song[] songs,int songId) {
		
		for(Song s: songs) {
			if(s.getSongId() == songId) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Song[] array = sortViewersWithLanguage(new Song[] {new Song(1,11,"English",124124),new Song(2,21,"English",12124),new Song(3,31,"English",4124)});
		for(Song s : array) {
			System.out.println(s);
		}
	
}
}

class Song{
	
	int songId;
	int songRating;
	String songLang;
	int songViewers;
	
	
	
	
	public Song(int songId, int songRating, String songLang, int songViewers) {
		super();
		this.songId = songId;
		this.songRating = songRating;
		this.songLang = songLang;
		this.songViewers = songViewers;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public int getSongRating() {
		return songRating;
	}
	public void setSongRating(int songRating) {
		this.songRating = songRating;
	}
	public String getSongLang() {
		return songLang;
	}
	public void setSongLang(String songLang) {
		this.songLang = songLang;
	}
	public int getSongViewers() {
		return songViewers;
	}
	public void setSongViewers(int songViewers) {
		this.songViewers = songViewers;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songRating=" + songRating + ", songLang=" + songLang + ", songViewers="
				+ songViewers + "]";
	}
	
}