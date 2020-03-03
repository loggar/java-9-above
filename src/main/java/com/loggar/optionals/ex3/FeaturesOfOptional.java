package com.loggar.optionals.ex3;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class FeaturesOfOptional {
    @Test
    @SuppressWarnings("unused")
    public void oprtionals_creational_methods() {
        // 1. static <T> Optional<T> empty()
        // Creating an empty optional
        Optional<String> empty = Optional.empty();

        // 2. static <T> Optional<T> of(T value)
        // Creating an optional using of
        String name = "java";
        Optional<String> opt = Optional.of(name);

        // 3. static <T> Optional<T> ofNullable(T value)
        // Possible null value
        Optional<String> optional = Optional.ofNullable(name());
    }

    private String name() {
        String name = "Java";
        return (name.length() > 5) ? name : null;
    }

    @Test
    public void oprtionals_checking_value_presence() {
        // 1. boolean isPresent()
        // isPresent
        // Return true if there is a value present; otherwise, it's false.
        Optional<String> optional1 = Optional.of("javaone");
        if (optional1.isPresent()) {
            // Do something, normally a get
        }

        // 2. boolean isEmpty()
        // available in Java 11 and above.
        // isEmpty
        // Return false if there is a value present; otherwise, it's true.
        if (optional1.isEmpty()) {
            // Do something
        }
        // 3. void ifPresent(Consumer<? super T> consumer)
        // ifPresent
        // If a value is present, invoke the specified consumer with the value; otherwise, do nothing.
        optional1.ifPresent(s -> System.out.println(s.length()));
    }

    @Test
    @SuppressWarnings("unused")
    public void getting_a_value_in_an_Optional() {
        // 1. Tget()
        // If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
        // get
        Optional<String> optional1 = Optional.of("javaone");
        if (optional1.isPresent()) {
            String value = optional1.get();
        }

        // 2. TorElse(Tother)
        // Return the value if present; otherwise, return other.
        // orElse
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("default_name");

        // 3. TorElseGet(Supplier<? extends T> other)
        // Return the value if present; otherwise, invoke other and return the result of that invocation.
        // orElseGet
        String name2 = Optional.ofNullable(nullName).orElseGet(() -> "john");
    }
}
