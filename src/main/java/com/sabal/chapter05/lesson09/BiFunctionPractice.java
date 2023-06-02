package com.sabal.chapter05.lesson09;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> bifunction = (a, b) -> String.valueOf(a + b);
        System.out.println(bifunction.apply(3, 4));
    }
}
