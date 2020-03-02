package com.loggar.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ImmutableArrayListJUnit4 {
    @Test(expected = UnsupportedOperationException.class)
    public final void givenUsingTheJava9_whenUnmodifiableListIsCreated_thenNotModifiable() {
        final List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        final List<String> unmodifiableList = List.of(list.toArray(new String[] {}));
        unmodifiableList.add("four");
    }
}
