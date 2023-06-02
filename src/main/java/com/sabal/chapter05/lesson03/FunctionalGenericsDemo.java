package com.sabal.chapter05.lesson03;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {
        FunctionalGenerics<Integer, Integer> addOne = i -> i + 1;
        System.out.println(addOne.execute(12));

        FunctionalGenerics<Integer, String> addOneSymbol = i -> String.valueOf(i) + 1;
        System.out.println(addOneSymbol.execute(12));
    }
}
