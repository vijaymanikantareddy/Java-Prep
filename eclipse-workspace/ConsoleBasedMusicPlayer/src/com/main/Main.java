package com.main;

import java.util.Scanner;

import com.service.MusicPlayer;

public class Main {
	public static int songId = 1;
	public static int playlistId = 1;

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MusicPlayer musicPlayer = new MusicPlayer();
		boolean running = true;
		while (running) {
			printDisplay();
			int option = sc.nextInt();
			sc.nextLine();
			switch (option) {

			case 1:
				// Add New Song
				System.out.print("Enter Song Title: ");
				String title = sc.nextLine();
				System.out.print("Enter Artist Name: ");
				String artist = sc.nextLine();
				System.out.print("Enter Song Duration: ");
				double duration = sc.nextDouble();

				musicPlayer.addSong(title, artist, duration);

				break;

			case 2:
				// Update Existing Song
				System.out.println("Enter existing song title: ");
				String existTitle = sc.nextLine();

				System.out.println("Enter New Song Title: ");
				String newTitle = sc.nextLine();

				System.out.println("Enter New Artist Name: ");
				String newArtist = sc.nextLine();

				System.out.println("Enter New Duration: ");
				double newDuration = sc.nextDouble();

				musicPlayer.updateSong(existTitle, newTitle, newArtist, newDuration);
				break;
			case 3:
				// Delete Song
				System.out.println("Enter song title: ");
				title = sc.nextLine();

				musicPlayer.deleteSong(title);
				break;
			case 4:
				// Display All Songs
				musicPlayer.displayAllSongs();
				break;
			case 5:
				// Create New Playlist
				System.out.println("Enter playlist title: ");
				title = sc.nextLine();
				musicPlayer.createPlaylist(title);
				break;
			case 6:
				// Add Song to Playlist
				System.out.println("Enter playlist name: ");
				String playlistNameToAdd = sc.nextLine();

				System.out.println("Enter Song Title: ");
				String songTitle = sc.nextLine();
				musicPlayer.addSongToPlaylist(playlistNameToAdd, songTitle);
				break;
			case 7:
				// Display All Playlists
				musicPlayer.displayAllPlaylists();
				break;
			case 8:
				// Display Songs in Playlist
				System.out.println("Enter Playlist name: ");
				String playlistName = sc.nextLine();
				musicPlayer.playPlaylist(playlistName);
				break;

			case 9:
				// Play Song in Playlist
				System.out.println("Enter playlist name: ");
				String playlist = sc.nextLine();
				System.out.println("Enter the Song: ");
				title = sc.nextLine();
				musicPlayer.playInPlaylist(playlist, title);
				break;
			case 10:
				// Pause Song in Playlist
				System.out.println("Enter playlist name: ");
				playlist = sc.nextLine();
				System.out.println("Enter the Song: ");
				title = sc.nextLine();
				musicPlayer.pauseInPlaylist(playlist, title);
				break;
			case 11:
				// Stop Song in Playlist
				System.out.println("Enter playlist name: ");
				playlist = sc.nextLine();
				System.out.println("Enter the Song: ");
				title = sc.nextLine();
				musicPlayer.stopInPlaylist(playlist, title);
				break;
			case 12:
				System.out.println("Program Exited Successfully!!!");
				running = false;
				break;
			default:
				System.out.println("Enter Correct Option");
				option = sc.nextInt();
			}

		}
		System.out.println("============================");
	}

	private static void printDisplay() {
		System.out.println("\n\n--- Welcome to Music Player ---");
		System.out.println("1. Add New Song");
		System.out.println("2. Update Existing Song");
		System.out.println("3. Delete Song");
		System.out.println("4. Display All Songs");
		System.out.println("5. Create New Playlist");
		System.out.println("6. Add Song to Playlist ");
		System.out.println("7. Display All Playlists");
		System.out.println("8. Display Songs in Playlist ");
		System.out.println("9. Play Song in Playlist");
		System.out.println("10. Pause Song in Playlist");
		System.out.println("11. Stop Song in Playlist");
		System.out.println("12. Exit");
		System.out.println("Enter your choice:");
	}
}
