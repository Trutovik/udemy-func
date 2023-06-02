package com.sabal.chapter05.lesson08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        UnaryOperator<Integer> unary = i -> i / 2;

        System.out.println(map(list, unary));

    }

    public static <T> List<T> map(List<T> list, UnaryOperator<T> operator) {
        List<T> result = new ArrayList<>();
        for (T s : list) {
            result.add(operator.apply(s));
        }
        return result;
    }
}
