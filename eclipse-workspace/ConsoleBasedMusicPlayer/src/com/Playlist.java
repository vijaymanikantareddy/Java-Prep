package com;

import java.util.LinkedList;
import java.util.List;

public class Playlist implements Playable {
	int playlistId;
	String playlistName;
	List<Song> playlistSongs;

	Playlist() {
		playlistSongs = new LinkedList<>();
	}

	Playlist(int playlistId, String playlistName) {
		this.playlistId = playlistId;
		this.playlistName = playlistName;
		playlistSongs = new LinkedList<>();
	}

	public void addSong(Song song) {
		playlistSongs.add(song);
	}

	public void removeSong(String title) {
		int index = -1;
		for (int i = 0; i < playlistSongs.size(); i++) {
			if (playlistSongs.get(i).getTitle().equals(title)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song NOT found in the playlist");
			return;
		}
		playlistSongs.remove(index);
		System.out.println("Song with Title: " + title + " removed successfully");

	}

	public void removeSong(int songId) {
		int index = -1;
		for (int i = 0; i < playlistSongs.size(); i++) {
			if (playlistSongs.get(i).getSongId() == songId) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Song NOT found in the playlist");
			return;
		}
		playlistSongs.remove(index);
		System.out.println("Song with ID: " + songId + " removed successfully");
	}

	public void displaySongs() {
		System.out.println("Below are the songs present in the playlist: ");
		for (Song song : playlistSongs) {
			System.out.println(song);
		}
	}

	@Override
	public void play(String title) {
		System.out.println("Song titled: " + title + " is playing");
	}

	@Override
	public void play(int songId) {
		System.out.println("Song titled: " + songId + " is playing");
	}

	@Override
	public void pause(String title) {
		System.out.println("Song titled: " + title + " is paused");
	}

	@Override
	public void pause(int songId) {
		System.out.println("Song titled: " + songId + " is paused");
	}

	@Override
	public void stop(String title) {
		System.out.println("Song titled: " + title + " is stopped");
	}

	@Override
	public void stop(int songId) {
		System.out.println("Song titled: " + songId + " is stopped");
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + "]";
	}
}