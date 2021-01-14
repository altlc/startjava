package com.startjava.Lesson_2_3_4.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player playerOne;
    private Player playerTwo;
    private Scanner scan;
    private int tryNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        tryNumber = 1;

        scan = new Scanner(System.in);
        secretNumber = random.nextInt(100);

        System.out.println("У вас 10 попыток");

        while (tryNumber <= 10) {
            intputNumber(playerOne);
            if (checkNumber(playerOne.getNumber())) {
                System.out.println("Игрок " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " с " + playerOne.getTryNumber() + " попытки");
                break;
            }

            if (playerOne.getTryNumber() == 10) {
                System.out.println("У " + playerOne.getName() + " закончились попытки!");
            }

            intputNumber(playerTwo);
            if (checkNumber(playerTwo.getNumber())) {
                System.out.println("Игрок " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " с " + playerTwo.getTryNumber() + " попытки");
                break;
            }

            if (playerTwo.getTryNumber() == 10) {
                System.out.println("У " + playerTwo.getName() + " закончились попытки!");
            }

            tryNumber++;
        }
        System.out.println("Введенные числа:");
        printNumbers(playerOne);
        printNumbers(playerTwo);
        System.out.println();
    }

    private void intputNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        player.setNumber(scan.nextInt(), tryNumber);
        scan.nextLine();
    }

    private void printNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

    private boolean checkNumber(int playerNumber) {
        if (playerNumber > secretNumber) {
            System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер > " + playerNumber);
        } else if (playerNumber < secretNumber) {
            System.out.println("Введенное вами число МЕНЬШЕ того, что загадал компьютер > " + playerNumber);
        } else {
            return true;
        }
        return false;
    }

}