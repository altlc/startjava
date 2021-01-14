package com.startjava.Lesson_2_3_4.guessnumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int tryNumber;
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
        Arrays.fill(numbers, 1, tryNumber - 1, 0);
        tryNumber = 1;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, tryNumber);
    }

    public void setNumber(int number, int tryNumber) {
        this.number = number;
        this.numbers[tryNumber - 1] = number;
        this.tryNumber = tryNumber;
    }

    public int getNumber() {
        return number;
    }
}