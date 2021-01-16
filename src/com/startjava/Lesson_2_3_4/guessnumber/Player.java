package com.startjava.Lesson_2_3_4.guessnumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int tryNumber = 0;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTryNumber() {
        return tryNumber;
    }

    public void cleanNumbers() {
        if(tryNumber > 0) Arrays.fill(numbers, 0, tryNumber - 1, 0);
        tryNumber = 0;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryNumber);
    }

    public void setNumber(int number) {
        numbers[tryNumber] = number;
        tryNumber++;
    }
}