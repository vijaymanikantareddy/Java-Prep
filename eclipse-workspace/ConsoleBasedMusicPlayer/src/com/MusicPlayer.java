package com;

import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
	public int id = 1;
	List<Song> allSongs;
	List<Playlist> playlists;

	MusicPlayer() {
		playlists = new LinkedList<>();
		allSongs = new LinkedList<>();
	}

	public void addSong(Song song) {
		allSongs.add(song);
		System.out.println("Song Added Successfully");
	}

	public void updateSong(String title, Song song) {
		int index = -1;
		for (int i = 0; i < allSongs.size(); i++) {
			if (allSongs.get(i).getTitle().equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song NOT found ");
			return;
		}
		allSongs.set(index, song);
		System.out.println("Song updated successfully");
	}

	public void deleteSong(String title) {
		int index = -1;
		for (int i = 0; i < allSongs.size(); i++) {
			if (allSongs.get(i).getTitle().equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song NOT found ");
			return;
		}
		allSongs.remove(index);
		System.out.println("Song removed successfully");
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

	public void createPlaylist(String title) {
		Playlist newPlaylist = new Playlist(id++, title);
		playlists.add(newPlaylist);
		System.out.println("Playlist created successfully");
	}

	public void addSongToPlaylist(String title, Song song) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).playlistName.equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no playlist found");
			return;
		}
		playlists.get(index).addSong(song);
		System.out.println("Song added Successfully");
	}

	public void deletePlaylist(String title) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).playlistName.equals(title)) {
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

	public void playPlaylist(String title) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).playlistName.equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("There is no playlist found");
			return;
		}

		System.out.println("Playing the songs of the playlist " + title);
		for (Song song : playlists.get(index).playlistSongs) {
			System.out.println(song);
		}

	}

	public Playlist getPlaylist(String title) {
		int index = -1;
		for (int i = 0; i < playlists.size(); i++) {
			if (playlists.get(i).playlistName.equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return null;
		return playlists.get(index);
	}

	public void displayAllPlaylists() {
		for (Playlist p : playlists) {
			System.out.println(p);
		}
	}
}
