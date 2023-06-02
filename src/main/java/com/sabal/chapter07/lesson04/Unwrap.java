package com.sabal.chapter07.lesson04;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optionalA = Optional.of(a);

        // get
        Integer b = optionalA.get(); // if optional is empty then CRASH!!!! NoSuchElementException
        System.out.println(b);

        Optional<Integer> empty = Optional.empty();
//        System.out.println(empty.get());

        // isPresent - true if value exists
        System.out.println("isPresent");
        System.out.println(optionalA.isPresent());
        System.out.println(empty.isPresent());

        // orElse
        System.out.println("orElse");
        System.out.println(optionalA.orElse(100));
        System.out.println(empty.orElse(100));

        // orElseGet - the same as orElse, but get a supplier as a parameter
        System.out.println("orElseGet");
        System.out.println(optionalA.orElseGet(() -> 100));
        System.out.println(empty.orElseGet(() -> 100));

        // orElseThrow
        System.out.println("orElseThrow");
        System.out.println(optionalA.orElseThrow(IllegalArgumentException::new));
        //System.out.println(empty.orElseThrow(IllegalArgumentException::new)); // IllegalArgumentException

        // orElseThrow() == get()
    }
}
