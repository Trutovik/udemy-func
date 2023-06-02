package com.sabal.chapter04.lesson05;

public class LambdaPractice4 {

    public static void main(String[] args) {
        StringLength len = (s) -> {
            System.out.println("Length of \"" + s + "\" is " + s.length());
            return s.length();
        };

        System.out.println(len.length("Fuck you!"));
        System.out.println(len.length("Suck your dick!"));
    }
}
