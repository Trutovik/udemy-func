package com.sabal.chapter04.lesson02;

public class LambdaPractice1 {

    public static void main(String[] args) {
        Name name = () -> System.out.println("Alex");
        name.myName();
    }
}
