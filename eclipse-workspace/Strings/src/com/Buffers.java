package com;

public class Buffers {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		// Java World
		sb.insert(4, ", Hello");
		// Java, Hello World
		sb.replace(12, 17, "Programming");
		// Java, Hello Programming
		sb.delete(0,  6);
		// Hello Programming 
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
