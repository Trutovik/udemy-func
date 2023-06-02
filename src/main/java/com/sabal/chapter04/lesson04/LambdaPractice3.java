package com.sabal.chapter04.lesson04;

public class LambdaPractice3 {

    public static void main(String[] args) {
        LengthOfString fuckYouLength = (s) -> s.length();
        LengthOfString suckYourDick = String::length;
        System.out.println(fuckYouLength.length("Fuck you!!!"));
        System.out.println(suckYourDick.length("Suck your Dick"));
    }
}
