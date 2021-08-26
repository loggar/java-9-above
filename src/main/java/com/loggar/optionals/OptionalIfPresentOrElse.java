package com.loggar.optionals;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class OptionalIfPresentOrElse {
	@Test
	public void givenOptional_whenPresent_thenShouldExecuteProperCallback() {
		// given
		Optional<String> value = Optional.of("properValue");
		AtomicInteger successCounter = new AtomicInteger(0);
		AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

		// when
		value.ifPresentOrElse(v -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

		// then
		assertThat(successCounter.get()).isEqualTo(1);
		assertThat(onEmptyOptionalCounter.get()).isEqualTo(0);
	}

	@Test
	public void givenOptional_whenNotPresent_thenShouldExecuteProperCallback() {
		// given
		Optional<String> value = Optional.empty();
		AtomicInteger successCounter = new AtomicInteger(0);
		AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

		// when
		value.ifPresentOrElse(v -> successCounter.incrementAndGet(), onEmptyOptionalCounter::incrementAndGet);

		// then
		assertThat(successCounter.get()).isEqualTo(0);
		assertThat(onEmptyOptionalCounter.get()).isEqualTo(1);
	}

}
