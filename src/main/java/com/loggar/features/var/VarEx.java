package com.loggar.features.var;

import java.util.ArrayList;

/**
 * Introduced: Java 9
 * 
 */
public class VarEx {
	public static void main(String[] args) {
		// ArrayList<Person> people = new ArrayList<Person>();

		var people = new ArrayList<String>();
		System.out.println(people.size());
	}
}
