package com.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.main.Main;
import com.model.Playlist;
import com.model.Song;

public class MusicPlayer {
	private final List<Song> allSongs = new ArrayList<>();
	private final List<Playlist> playlists = new ArrayList<>();
	private int songIdCounter = 1;
	private int playlistIdCounter = 1;

	public MusicPlayer() {

	}

	public Song addSong(String title, String artist, double duration) {
		Song song = new Song(songIdCounter++, title, artist, duration);
		allSongs.add(song);
		System.out.println("Song " + song.getTitle() + " Added Successfully");
		return song;
	}

	public void displayAllSongs() {
		if (allSongs.isEmpty()) {
			System.out.println("There are no songs!!!");
			return;
		}
		System.out.println("All Songs: ");
		for (Song song : allSongs) {
			System.out.println(song);
		}
	}

	public void updateSong(String existTitle, String newTitle, String newArtist, double newDuration) {
		int index = -1;
		for (int i = 0; i < allSongs.size(); i++) {
			if (allSongs.get(i).getTitle() != null && allSongs.get(i).getTitle().equalsIgnoreCase(existTitle)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song NOT found ");
			return;
		}
		allSongs.get(index).setArtist(newArtist);
		allSongs.get(index).setDuration(newDuration);
		allSongs.get(index).setTitle(newTitle);
		System.out.println("Song UPDATED successfully");
	}

	public void deleteSong(String title) {
		int index = -1;
		for (int i = 0; i < allSongs.size(); i++) {
			if (allSongs.get(i).getTitle() != null && allSongs.get(i).getTitle().equalsIgnoreCase(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song DOES NOT Exists");
			return;
		}
		allSongs.remove(index);
		System.out.println("Song Deleted successfully");
	}

	public void createPlaylist(String title) {

		if (title != null) {
			boolean isExisted = false;
			if (title != null) {
				for (Playlist play : playlists) {
					if (play.getPlaylistName().equalsIgnoreCase(title)) {
						isExisted = true;
					}
				}
				if (isExisted) {
					System.out.println("Already Existed!!!");
				} else {
					Playlist newPlaylist = new Playlist(playlistIdCounter++, title);
					playlists.add(newPlaylist);
					System.out.println("Playlist Created successfully" + title);
				}
			}
		}

	}

	public void addSongToPlaylist(String playlistNameToAdd, String songTitle) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).getPlaylistName() != null
					&& playlists.get(i).getPlaylistName().equals(playlistNameToAdd)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no playlist found");
			return;
		}
		boolean songFound = false;
		for (Song song : allSongs) {
			if (song.getTitle() != null && song.getTitle().equalsIgnoreCase(songTitle)) {
				playlists.get(index).addSong(song);
				System.out.println("Song added Successfully");
				songFound = true;
			}
		}
		if (songFound == false) {
			System.out.println("Song Doesn't Found");
		}
	}

	public void deletePlaylist(String title) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).getPlaylistName().equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no playlist found");
			return;
		}
		playlists.remove(index);
		System.out.println("Playlist deleted successfully");
	}

	public void playPlaylist(String playlistName) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).getPlaylistName().equalsIgnoreCase(playlistName)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no playlist found");
			return;
		}

		System.out.println("Playing the songs of the playlist " + playlistName);
		playlists.get(index).displaySongs();

	}

	public Playlist getPlaylist(String title) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).getPlaylistName().equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return null;
		return playlists.get(index);
	}

	public void displayAllPlaylists() {
		System.out.println("All the playlists available are: ");
		for (Playlist p : playlists) {
			System.out.println(p);
		}
	}
	
	public void playInPlaylist() {
		Playlist playlist = null;
		for (Playlist p : playlists) {
			System.out.println(p);
		}
	}
}
