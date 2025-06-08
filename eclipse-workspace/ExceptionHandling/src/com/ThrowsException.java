package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public static void main(String[] args) {
		ThrowsException obj = new ThrowsException();
//		obj.openFile();
	}

	public void openFile() throws FileNotFoundException {
		File file = new File("D:\\Java-FLM\\eclipse-workspace\\ExceptionHandling\\hi.txt");
		FileInputStream fileInputStream = new FileInputStream(file);

	}
}
