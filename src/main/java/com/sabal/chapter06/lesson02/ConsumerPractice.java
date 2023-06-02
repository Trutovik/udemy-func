package com.sabal.chapter06.lesson02;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
        List<Integer> list = List.of(34, 67, 8, 23, 67, 89, 90);
        Consumer<Integer> consumerLambda = e -> System.out.println(e);
        consumerLambda.accept(56);
        printElements(list, consumerLambda);
        System.out.println("-----------------------------------------");
        Consumer<Integer> consumerReference = System.out::println;
        consumerLambda.accept(56);
        printElements(list, consumerReference);
    }

    public static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T t: list) {
            consumer.accept(t);
        }
    }
}
