package com.sabal.chapter03.lesson05;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        // Imperative style
        int sumOfEvens = 0;
        for (int i = 0; i < 200; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }
        System.out.println("Imperative " + sumOfEvens);

        // Declarative style
        System.out.println("Declarative " + IntStream.range(0, 200)
                .filter(i -> i % 2 == 0)
                .sum());
    }
}
