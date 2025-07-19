package com;

import java.util.Scanner;

public class Main {
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
			if (option == 1) {
				System.out.println("Enter Song ID: ");
				int songId = sc.nextInt();
				System.out.println("Enter Song Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Artist Name: ");
				String artist = sc.nextLine();
				System.out.println("Enter Song Duration: ");
				double duration = sc.nextDouble();
				Song newSong = new Song(songId, title, artist, duration);
				musicPlayer.addSong(newSong);

			} else if (option == 2) {
				System.out.println("Enter song title: ");
				String title = sc.nextLine();

				System.out.println("Enter song ID: ");
				int id = sc.nextInt();

				System.out.println("Enter Title: ");
				String newTitle = sc.nextLine();

				System.out.println("Enter Artist Name: ");
				String artist = sc.nextLine();

				System.out.println("Enter Duration: ");
				double duration = sc.nextDouble();

				Song newSong = new Song(id, newTitle, artist, duration);
				musicPlayer.updateSong(title, newSong);
			} else if (option == 3) {
				System.out.println("Enter song title: ");
				String title = sc.nextLine();

				musicPlayer.deleteSong(title);
			} else if (option == 4) {
				musicPlayer.displayAllSongs();
			} else if (option == 5) {
				System.out.println("Enter song title: ");
				String title = sc.nextLine();
				musicPlayer.createPlaylist(title);
			} else if (option == 6) {
				System.out.println("Enter playlist title: ");
				String title = sc.nextLine();

				System.out.println("Enter song ID: ");
				int id = sc.nextInt();

				System.out.println("Enter Title: ");
				String songTitle = sc.nextLine();

				System.out.println("Enter Artist Name: ");
				String artist = sc.nextLine();

				System.out.println("Enter Duration: ");
				double duration = sc.nextDouble();

				Song newSong = new Song(id, songTitle, artist, duration);
				musicPlayer.addSongToPlaylist(title, newSong);
			} else if (option == 7) {

			} else if (option == 8) {

			} else if (option == 9) {

			} else if (option == 10) {

			} else if (option == 11) {

			} else if (option == 12) {
				System.out.println("Successfully Exited");
				break;
			} else {
				System.out.println("Enter Valid option!!!!");
				option = sc.nextInt();
			}
		}

	}
}
