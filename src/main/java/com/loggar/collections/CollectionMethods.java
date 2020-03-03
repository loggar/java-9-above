package com.loggar.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * introduced: java 9
 *
 */
public class CollectionMethods {
	public static void main(String[] args) {
		// earlier version:
		List<String> list1 = Arrays.asList("element1", "element2");
		System.out.println(list1);

		List<String> list2 = List.of("element1", "element2");
		System.out.println(list2);

		Set<String> set1 = Set.of("element1", "element2");
		System.out.println(set1);

		Map<String, Object> map1 = Map.ofEntries();
		System.out.println(map1);
	}
}
