package com.loggar.optionals.ex2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.Test;

public class OptionalStream {
	@Test
	public void givenOptionalOfSome_whenToStream_thenShouldTreatItAsOneElementStream() {
		// given
		Optional<String> value = Optional.of("a");

		// when
		List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());

		// then
		assertThat(collect).hasSameElementsAs(List.of("A"));
	}

	@Test
	public void givenOptionalOfNone_whenToStream_thenShouldTreatItAsZeroElementStream() {
		// given
		Optional<String> value = Optional.empty();

		// when
		List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());

		// then
		assertThat(collect).isEmpty();
	}
}
