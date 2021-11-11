package com.loggar.string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StringNewMethods {
	public static void main(String[] args) {
		// lines()
		String str = "test \ntest2 \n\rtest3 \r";
		Stream<String> lines = str.lines();
		lines.forEach(System.out::println);

		// readString(Path path)
		Path path = Path.of("./dist/io/file.1.txt");
		String text = null;
		try {
			text = Files.readString(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(text);

		// strip(), stripLeading(), stripTrailing()
		// repeat(int times)
		// writeString(Path path)
		// indent(int level)
		// transform(Function f)
	}
}
