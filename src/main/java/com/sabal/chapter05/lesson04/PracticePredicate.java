package com.sabal.chapter05.lesson04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate = s -> !s.isEmpty();
        Predicate<String> findSubstring = s -> s.contains("Basics");
        Predicate<Integer> intFilter = i -> i % 2 ==0;

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        newList = filterList(list, findSubstring);
        System.out.println(newList);

        List<Integer> integerFilter = List.of(1,2,3,4,5,6,7,8,9,0);
        integerFilter = filterList(integerFilter, intFilter);
        System.out.println(integerFilter);
    }

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T s : list) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
