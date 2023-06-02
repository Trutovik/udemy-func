package com.sabal.chapter06.lesson03;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class ConstructorReference {

    public static void main(String[] args) {
        Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
        Function<Runnable, Thread> threadGeneratorReference = Thread::new;

        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        threadGenerator.apply(task1).start();
        threadGenerator.apply(task2).start();
        threadGeneratorReference.apply(task1).start();
        threadGeneratorReference.apply(task2).start();
    }
}
