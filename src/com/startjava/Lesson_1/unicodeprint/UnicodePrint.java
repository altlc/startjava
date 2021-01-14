package com.startjava.Lesson_1.unicodeprint;

public class UnicodePrint {
    public static void main(String[] args) {
        char unicodeChar = 33;
        while (unicodeChar <= 126) {
            System.out.println(unicodeChar);
            unicodeChar++;
        }
    }
}