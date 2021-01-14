package com.startjava.Lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String userAnswer;
		Calculator calc = new Calculator();

		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Введите математическое выражение: ");
			System.out.println("Результат: " + calc.calculate(scan.nextLine()));

			do {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				userAnswer = scan.nextLine();
			} while (!userAnswer.equals("да") && !userAnswer.equals("нет"));
		} while (userAnswer.equals("да"));
	}
}