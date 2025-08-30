package com;

import java.util.Scanner;

public class Main {
	public static int songId = 1;
	public static int playlistId = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicPlayer musicPlayer = new MusicPlayer();
		int option = 1;
		while (true) {
			System.out.println("1. Add New Song \r\n" + "2. Update Existing Song \r\n" + "3. Delete Song \r\n"
					+ "4. Display All Songs \r\n" + "5. Create New Playlist \r\n" + "6. Add Song to Playlist \r\n"
					+ "7. Display All Playlists \r\n" + "8. Display Songs in Playlist \r\n"
					+ "9. Play Song in Playlist \r\n" + "10. Pause Song in Playlist \r\n"
					+ "11. Stop Song in Playlist \r\n" + "12. Exit \r\n" + "Enter your choice:");
			option = sc.nextInt();
			if (option == 12)
				break;
			switch (option) {
			case 1:
				// Done
				// Add New Song
				System.out.println("Enter Song Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Artist Name: ");
				String artist = sc.nextLine();
				System.out.println("Enter Song Duration: ");
				double duration = sc.nextDouble();
				Song newSong = new Song(songId++, title, artist, duration);
				musicPlayer.addSong(newSong);
				break;
			case 2:
				// Update Existing Song
				System.out.println("Enter song title: ");
				title = sc.nextLine();

				System.out.println("Enter song ID: ");
				int id = sc.nextInt();

				System.out.println("Enter Title: ");
				String newTitle = sc.nextLine();

				System.out.println("Enter Artist Name: ");
				artist = sc.nextLine();

				System.out.println("Enter Duration: ");
				duration = sc.nextDouble();

				newSong = new Song(id, newTitle, artist, duration);
				musicPlayer.updateSong(title, newSong);
				break;
			case 3:
				// Done
				// Delete Song
				System.out.println("Enter song title: ");
				title = sc.nextLine();

				musicPlayer.deleteSong(title);
				break;
			case 4:
				// Done
				// Display All Songs
				musicPlayer.displayAllSongs();
				break;
			case 5:
				// Done
				// Create New Playlist
				System.out.println("Enter playlist title: ");
				title = sc.nextLine();
				musicPlayer.createPlaylist(title);
				break;
			case 6:
				// Add Song to Playlist
				System.out.println("Enter playlist title: ");
				title = sc.nextLine();

				System.out.println("Enter Title: ");
				String songTitle = sc.nextLine();

				System.out.println("Enter Artist Name: ");
				artist = sc.nextLine();

				System.out.println("Enter Duration: ");
				duration = sc.nextDouble();

				newSong = new Song(songId, songTitle, artist, duration);
				musicPlayer.addSongToPlaylist(title, newSong);
				break;
			case 7:
				// Done
				// Display All Playlists
				musicPlayer.displayAllPlaylists();
				break;
			case 8:
				// Done
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

			default:
				System.out.println("Enter Correct Option");
				option = sc.nextInt();

			}

		}
		System.out.println("Program Exited Successfully!!!");
	}
}
