package com.sabal.chapter06.lesson02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {
        List<String> strings = List.of("Kit", "Kat", "Shake");
        Function<String, Integer> functionLambda = e -> e.length();
        List<Integer> newList = map(strings, functionLambda);
        System.out.println(newList);
        System.out.println("-------------------------------------------");
        Function<String, Integer> functionReference = String::length;
        List<Integer> resultList = map(strings, functionReference);
        System.out.println(resultList);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T t: list) {
            result.add(function.apply(t));
        }

        return result;
    }

}
