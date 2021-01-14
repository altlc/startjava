package com.startjava.Lesson_2_3_4.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String playerAnswer;
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.print("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber(playerOne, playerTwo);

		do {
			game.play();

			do {
				System.out.print("Хотите продолжить игру? [да/нет]: ");
				playerAnswer = scan.nextLine();
			} while (!"да".equals(playerAnswer) && !"нет".equals(playerAnswer));
		} while ("да".equals(playerAnswer));
	}
}