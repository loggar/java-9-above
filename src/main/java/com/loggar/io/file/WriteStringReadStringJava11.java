package com.loggar.io.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteStringReadStringJava11 {
	public static void main(String[] args) throws IOException {
		Path fileName = Path.of("demo.txt");
		String content = "hello world !!";
		Files.writeString(fileName, content);

		String actual = Files.readString(fileName);
		System.out.println(actual);
	}
}
