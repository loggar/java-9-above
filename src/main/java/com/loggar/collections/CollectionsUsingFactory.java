package com.loggar.collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class CollectionsUsingFactory {
	void immutableSet() {
		Set<String> set = new HashSet<>();
		set.add("foo");
		set.add("bar");
		set.add("baz");
		set = Collections.unmodifiableSet(set);
	}

	void immutableSet_doubleBraceInitialization() {
		@SuppressWarnings({ "unused", "serial" }) Set<String> set = Collections.unmodifiableSet(new HashSet<String>() {
			{
				add("foo");
				add("bar");
				add("baz");
			}
		});
	}

	void immutableSet_doubleBraceInitialization_streams() {
		Stream.of("foo", "bar", "baz").collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));

	}

	void using_of() {
		@SuppressWarnings("unused") List<String> list = List.of("foo", "bar", "baz");
		@SuppressWarnings("unused") Set<String> set = Set.of("foo", "bar", "baz");
	}

	@Test(expected = IllegalArgumentException.class)
	public void onDuplicateElem_IfIllegalArgExp_thenSuccess() {
		Set.of("foo", "bar", "baz", "foo");
	}

	void factory_map() {
		@SuppressWarnings("unused") Map<String, String> map = Map.of("foo", "a", "bar", "b", "baz", "c");

		@SuppressWarnings("unused") Map<String, String> map2 = Map.ofEntries(new AbstractMap.SimpleEntry<>("foo", "a"), new AbstractMap.SimpleEntry<>("bar", "b"), new AbstractMap.SimpleEntry<>("baz", "c"));
	}

	// Immutable
	@Test(expected = UnsupportedOperationException.class)
	public void onElemAdd_ifUnSupportedOpExpnThrown_thenSuccess() {
		Set<String> set = Set.of("foo", "bar");
		set.add("baz");
	}

	// Immutable
	@Test(expected = UnsupportedOperationException.class)
	public void onElemModify_ifUnSupportedOpExpnThrown_thenSuccess() {
		List<String> list = List.of("foo", "bar");
		list.set(0, "baz");
	}

	// Immutable
	@Test(expected = UnsupportedOperationException.class)
	public void onElemRemove_ifUnSupportedOpExpnThrown_thenSuccess() {
		Map<String, String> map = Map.of("foo", "a", "bar", "b");
		map.remove("foo");
	}

	// No null Element Allowed
	@Test(expected = NullPointerException.class)
	public void onNullElem_ifNullPtrExpnThrown_thenSuccess() {
		List.of("foo", "bar", null);
	}

}
