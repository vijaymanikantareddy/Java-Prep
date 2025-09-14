package com.main;

import java.util.Scanner;

import com.model.Song;
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
//			if (option == 12)
//				break;
			switch (option) {

			case 1:
				// DONE
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
				// DONE
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
				// DONE
				// Delete Song
				System.out.println("Enter song title: ");
				title = sc.nextLine();

				musicPlayer.deleteSong(title);
				break;
			case 4:
				// DONE
				// Display All Songs
				musicPlayer.displayAllSongs();
				break;
			case 5:
				// DONE
				// Create New Playlist
				System.out.println("Enter playlist title: ");
				title = sc.nextLine();
				musicPlayer.createPlaylist(title);
				break;
			case 6:
				// Add Song to Playlist
				System.out.println("Enter playlist name: ");
				String playlistNameToAdd = sc.nextLine();

				System.out.println("Enter Title: ");
				String songTitle = sc.nextLine();

//				newSong = new Song(songId, songTitle, artist, duration);
				musicPlayer.addSongToPlaylist(playlistNameToAdd, songTitle);
				break;
			case 7:
				// Display All Playlists
				musicPlayer.displayAllPlaylists();
				break;
			case 8:
				// Display Songs in Playlist
				System.out.println("Enter Playlist name: ");
				title = sc.nextLine();
				musicPlayer.playPlaylist(title);
				break;
			case 9:
				// Play Song in Playlist
				System.out.println("Press 1 to Play using Song title \n");
				System.out.println("Press 2 to Play using Song ID: ");
				int choice = sc.nextInt();
				if (choice == 1) {
					String mySongTitle = sc.nextLine();

				} else {
					int mySongId = sc.nextInt();
				}
				break;
			case 10:
				// Pause Song in Playlist
				System.out.println("Press 1 to Pause using Song title \n");
				System.out.println("Press 2 to Pause using Song ID: ");
				choice = sc.nextInt();
				if (choice == 1) {
					String mySongTitle = sc.nextLine();
				} else {
					int mySongId = sc.nextInt();
				}
				break;
			case 11:

				// Stop Song in Playlist
				System.out.println("Press 1 to stop using Song title \n");
				System.out.println("Press 2 to stop using Song ID: ");
				choice = sc.nextInt();
				if (choice == 1) {
					String mySongTitle = sc.nextLine();
				} else {
					int mySongId = sc.nextInt();
				}
				break;
			case 12:
				// DONE
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
