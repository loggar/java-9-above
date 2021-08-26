package com.loggar.optionals;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        String text = null;
        String defaultText1 = Optional.ofNullable(text).orElseGet(OptionalExamples::getDefaultValue);
        String defaultText2 = Optional.ofNullable(text).orElse(getDefaultValue());

        System.out.println(defaultText1);
        System.out.println(defaultText2);
    }

    public static String getDefaultValue() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }

    // When to Use It.
    // The intended use of Optional is mainly as a return type.
    // After obtaining an instance of this type, you can extract the value if it’s present or provide an alternate behavior if it’s not.
    // One very useful use case of the Optional class is combining it with streams or other methods that return an Optional value to build fluent APIs.
    // See code snippet below
    // User user = users.stream().findFirst().orElse(new User("default", "1234"));

    // When Not to Use It.
    // a) Do not use it as a field in a class as it is not serializable
    // b) Do not use it as a parameter for constructors and methods as it would lead to unnecessarily complicated code.
    // User user = new User("john@gmail.com", "1234", Optional.empty());
}
