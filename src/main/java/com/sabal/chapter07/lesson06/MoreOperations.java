package com.sabal.chapter07.lesson06;

import java.util.Optional;

public class MoreOperations {

    public static void main(String[] args) {
        // ifPresent
        Optional<String> optional = Optional.of("Exists");
        optional.ifPresent(System.out::println);

        //ifPresentOrElse
        optional = Optional.of("Exists");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

        //stream
        optional.stream().forEach(System.out::println);
        Optional.empty().stream().forEach(System.out::println);

        //or
        optional.or(() -> Optional.of("New Value")).ifPresent(System.out::println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out::println);

        //equals
        System.out.println(optional.equals(Optional.of("Exists")));

        //hashCode
        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());
    }
}
