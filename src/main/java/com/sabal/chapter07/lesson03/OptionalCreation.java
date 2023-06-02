package com.sabal.chapter07.lesson03;

import java.util.Optional;

public class OptionalCreation {

    public static void main(String[] args) {
        String val = "A String";
        // Optional is immutable
        Optional<String> optionalString = Optional.of(val);

        // empty
        Optional<Integer> optionalInt = Optional.empty();

        // nullable
        Optional<String> optionalNullable = Optional.ofNullable(val);
        Optional<String> optionalNullableEmpty = Optional.ofNullable(null); // == Optional.empty()
    }
}
