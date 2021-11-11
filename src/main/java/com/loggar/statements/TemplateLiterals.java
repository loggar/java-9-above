package com.loggar.statements;

public class TemplateLiterals {
	public static void main(String args[]) {
		String json = """
				{
				  "animal" : "Quokka",
				  "link" : "https://en.wikipedia.org/wiki/Quokka"
				}
				""";

		System.out.println(json);
	}
}
