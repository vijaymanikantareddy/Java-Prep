package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//checked exception
//compile time exception

public class FileHandling {
	public static void main(String[] args) {
		File file = new File("D:\\Java-FLM\\eclipse-workspace\\ExceptionHandling\\hi.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
