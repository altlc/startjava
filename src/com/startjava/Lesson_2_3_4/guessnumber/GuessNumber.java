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
        scan = new Scanner(System.in);
    }

    public void play() {
        Random random = new Random();
        secretNumber = random.nextInt(101);

        System.out.println("У вас 10 попыток");

        for(int i = 1; i <= 10; i++) {
            if (makeMove(playerOne, i)) break;
            if (makeMove(playerTwo, i)) break;
        }

        System.out.println("Введенные числа:");
        printNumbers(playerOne);
        printNumbers(playerTwo);
        System.out.println();

        playerOne.cleanNumbers();
        playerTwo.cleanNumbers();
    }

    private boolean makeMove(Player player, int tryNumber)
    {
        boolean result = checkNumber(player, inputNumber(player), tryNumber);
        if (tryNumber == 10) System.out.println("У " + player.getName() + " закончились попытки!");
        return result;
    }

    private int inputNumber(Player player) {
        System.out.print(player.getName() + " введите число: ");
        int playerNumber = scan.nextInt();
        scan.nextLine();
        player.setNumber(playerNumber);
        return playerNumber;
    }

    private boolean checkNumber(Player player, int playerNumber, int tryNumber) {
        if(playerNumber == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " с " + tryNumber + " попытки");
            return true;
        }
        System.out.println("Введенное вами число " + (playerNumber > secretNumber ? "БОЛЬШЕ" : "МЕНЬШЕ") + " того, что загадал компьютер > " + playerNumber);
        return false;
    }

    private void printNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
    }
}