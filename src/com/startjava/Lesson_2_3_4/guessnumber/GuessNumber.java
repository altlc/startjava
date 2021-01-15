package com.startjava.Lesson_2_3_4.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player playerOne;
    private Player playerTwo;
    private Scanner scan;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        Random random = new Random();
        playerOne.cleanNumbers();
        playerTwo.cleanNumbers();
        scan = new Scanner(System.in);
        secretNumber = random.nextInt(101);

        System.out.println("У вас 10 попыток");

        for(int i = 1; i <= 10; i++) {
            if (inputNumber(playerOne,i)) break;
            if (inputNumber(playerTwo,i)) break;
        }

        System.out.println("Введенные числа:");
        printNumbers(playerOne);
        printNumbers(playerTwo);
        System.out.println();
    }

    private boolean inputNumber(Player player, int tryNumber) {
        System.out.print(player.getName() + " введите число: ");
        int playerNumber = scan.nextInt();
        scan.nextLine();
        player.setNumber(playerNumber, tryNumber);
        if(playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + tryNumber + " попытки");
            return true;
        }
        System.out.println("Введенное вами число " + (playerNumber > secretNumber ? "БОЛЬШЕ" : "МЕНЬШЕ") + " того, что загадал компьютер > " + playerNumber);
        if (tryNumber == 10) System.out.println("У " + player.getName() + " закончились попытки!");
        return false;
    }

    private void printNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }

}