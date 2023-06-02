package com.sabal.chapter05.lesson07;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPractice {

    public static void main(String[] args) {
        List<String> list = List.of("Kit", "Kat", "Shake");
        Function<String, Integer> length = String::length;
        Function<String, String> doubled = s -> s + s;

        List<Integer> newList = map(list, length);
        System.out.println(newList);

        List<String> newListString = map(list, doubled);
        System.out.println(newListString);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> predicate) {
        List<R> result = new ArrayList<>();
        for (T s : list) {
                result.add(predicate.apply(s));
        }
        return result;
    }
}
