package com.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.contract.Playable;

public class Playlist implements Playable {
	private int playlistId;
	private String playlistName;
	private List<Song> playlistSongs = new ArrayList<>();
	private Song currentPlaying = null;
	private boolean pause = false;

	public Playlist() {

	}

	public Playlist(int playlistId, String playlistName, List<Song> playlistSongs) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;
		this.playlistSongs = playlistSongs;
	}

	public Playlist(int playlistId, String playlistName) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;

	}

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public List<Song> getPlaylistSongs() {
		return playlistSongs;
	}

	public void setPlaylistSongs(List<Song> playlistSongs) {
		this.playlistSongs = playlistSongs;
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

		Song songObj = null;
		for (Song song : playlistSongs) {
			if (song.getTitle() != null && song.getTitle().equalsIgnoreCase(title)) {
				songObj = song;
			}
		}
		if (songObj != null) {
			System.out.println("Song titled: " + songObj.getTitle() + " is playing");
			currentPlaying = songObj;
			pause = false;
		} else {
			System.out.println("Song not in playlist");
		}
	}

	@Override
	public void play(int songId) {
		Song songObj = null;
		for (Song song : playlistSongs) {
			if (song.getSongId() == songId) {
				songObj = song;
			}
		}
		if (songObj != null) {
			System.out.println("Song ID: " + songObj.getSongId() + " is playing");
			pause = false;
			currentPlaying = songObj;
		} else {
			System.out.println("Song not in playlist");
		}
	}

	@Override
	public void pause(String title) {
		if (currentPlaying != null && currentPlaying.getTitle().equalsIgnoreCase(title)) {
			if (!pause) {
				pause = true;
				System.out.println("Song titled: " + currentPlaying.getTitle() + " is paused");

			} else {
				System.out.println("Song is Already Paused");
			}

		} else {
			System.out.println("Nothing to pause, please play a song to pause");
		}
	}

	@Override
	public void pause(int songId) {

		if (currentPlaying != null && currentPlaying.getSongId() == songId) {
			if (!pause) {
				pause = true;
				System.out.println("Song ID: " + songId + " is paused");
			} else {
				System.out.println("Song is Already Paused");
			}

		} else {
			System.out.println("Nothing to pause, please play a song to pause");
		}
	}

	@Override
	public void stop(String title) {
		if (currentPlaying != null && currentPlaying.getTitle().equalsIgnoreCase(title)) {
			if (!pause) {
				pause = true;
				System.out.println("Song titled: " + currentPlaying.getTitle() + " is stopped");
				currentPlaying = null;
			} else {
				System.out.println("Song is Already Stopped");
			}

		} else {
			System.out.println("Nothing to Stop, please play a song to stop");
		}
	}

	@Override
	public void stop(int songId) {
		System.out.println("Song titled: " + songId + " is stopped");

		if (currentPlaying != null && currentPlaying.getSongId() == songId) {
			if (!pause) {
				pause = true;
				System.out.println("Song ID: " + songId + " is stopped");
				currentPlaying = null;
			} else {
				System.out.println("Song is Already Stopped");
			}

		} else {
			System.out.println("Nothing to Stop, please play a song to stop");
		}
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + "]";
	}
}