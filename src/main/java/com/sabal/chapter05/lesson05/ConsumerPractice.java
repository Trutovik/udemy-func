package com.sabal.chapter05.lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPractice {

    public static void main(String[] args) {
        List<Integer> list = List.of(34, 67, 8, 23, 67, 89, 90);
        List<String> strings = List.of("Putin", "Huilo");

        Consumer<Integer> consumer = System.out::println;
        Consumer<String> consumerString = System.out::println;
        consumer.accept(56);
        consumeList(list, consumer);
        consumeList(strings, consumerString);

    }

    public static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T s : list) {
            consumer.accept(s);
        }
    }
}
