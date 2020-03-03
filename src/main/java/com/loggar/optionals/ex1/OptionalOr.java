package com.loggar.optionals.ex1;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalOr {
	@Test
	public void givenOptional_whenPresent_thenShouldTakeAValueFromIt() {
		// given
		String expected = "properValue";
		Optional<String> value = Optional.of(expected);
		Optional<String> defaultValue = Optional.of("default");

		// when
		Optional<String> result = value.or(() -> defaultValue);

		// then
		assertEquals(result.get(), expected);
	}

	@Test
	public void givenOptional_whenEmpty_thenShouldTakeAValueFromOr() {
		// given
		String defaultString = "default";
		Optional<String> value = Optional.empty();
		Optional<String> defaultValue = Optional.of(defaultString);

		// when
		Optional<String> result = value.or(() -> defaultValue);

		// then
		assertEquals(result.get(), defaultString);
	}
}
