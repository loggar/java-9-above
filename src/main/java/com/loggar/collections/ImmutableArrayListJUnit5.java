package com.loggar.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImmutableArrayListJUnit5 {
    @Test
    public final void givenUsingTheJava9_whenUnmodifiableListIsCreated_thenNotModifiable() {
        final List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        final List<String> unmodifiableList = List.of(list.toArray(new String[] {}));

        Assertions.assertThrows(UnsupportedOperationException.class, () -> {
            unmodifiableList.add("four");
        });
    }
}
