package com.sabal.chapter04.lesson03;

public class LambdaPractice2 {

    public static void main(String[] args) {
        MathOperation sum = (a, b) -> System.out.println(a + " + " + b + " = " + (a + b));
        sum.operation(4, 5);
        MathOperation sub = (a, b) -> System.out.println(a + " - " + b + " = " + (a - b));
        sub.operation(5, 4);
    }
}
