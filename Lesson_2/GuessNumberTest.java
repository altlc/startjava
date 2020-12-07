import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String userAnswer;
		Scanner scan = new Scanner(System.in, "Cp866");
		System.out.print("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.print("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.nextLine());

		do {
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.play();

			do {
				System.out.print("Хотите продолжить игру? [да/нет]: ");
				userAnswer = scan.nextLine();
			} while (!"да".equals(userAnswer) && !"нет".equals(userAnswer));
		} while ("да".equals(userAnswer));

		
	}
}