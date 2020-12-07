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

		scan = new Scanner(System.in, "Cp866");
		secretNumber = random.nextInt(100);

		while(true) {
			int userNumber = intputUserNumber(playerOne.getName());
			playerOne.setNumber(userNumber);
			if(checkNumber(userNumber)) {
				System.out.println(playerOne.getName() + " угадал число!");
				break;
			}

			userNumber = intputUserNumber(playerTwo.getName());
			playerTwo.setNumber(userNumber);
			if(checkNumber(userNumber)) {
				System.out.println(playerTwo.getName() + " угадал число!");
				break;
			}
		}
	}

	private int intputUserNumber(String userName) {
		System.out.print(userName + " введите число: ");
		int result = scan.nextInt();
		scan.nextLine();
		return result;
	}

	private boolean checkNumber(int userNumber) {
		if(userNumber > secretNumber) {
			System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер > " + userNumber);
			return false;
		} else if(userNumber < secretNumber) {
			System.out.println("Введенное вами число МЕНЬШЕ того, что загадал компьютер > " + userNumber);
			return false;
		} 
		return true;
	}

}