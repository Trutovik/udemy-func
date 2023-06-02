package com.sabal.chapter05.lesson10;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {

    public static void main(String[] args) {
        BinaryOperator<Integer> intBinary = (a, b) -> a + b;
        BinaryOperator<String> stringBinary = (a, b) -> a + b;

        System.out.println(intBinary.apply(4, 5));
        System.out.println(stringBinary.apply("4", "5"));
    }
}
