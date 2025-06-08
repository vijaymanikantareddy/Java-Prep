package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	public static void main(String[] args) {
		ByteStreams bs = new ByteStreams();
		bs.readFromFile();
		bs.writeIntoFile();

	}

	public void readFromFile() {
		File file = new File("D:\\Java-FLM\\eclipse-workspace\\FileHandling\\hi.txt");

		try {
			FileInputStream fis = new FileInputStream(file);

			int temp;
			while ((temp = fis.read()) != -1) {
				System.out.print((char) temp);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeIntoFile() {
		File file = new File("D:\\\\Java-FLM\\\\eclipse-workspace\\\\FileHandling\\\\hi.txt");
		File file2 = new File("D:\\\\Java-FLM\\\\eclipse-workspace\\\\FileHandling\\\\output.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			String data = "Input File Content: ";
			fos.write(data.getBytes());
			int temp;
			while ((temp = fis.read()) != -1) {
				fos.write(temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
