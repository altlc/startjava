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
			intputNumber(playerOne);
			if(checkNumber(playerOne.getNumber())) {
				System.out.println(playerOne.getName() + " угадал число!");
				break;
			}

			intputNumber(playerTwo);
			if(checkNumber(playerTwo.getNumber())) {
				System.out.println(playerTwo.getName() + " угадал число!");
				break;
			}
		}
	}

	private void intputNumber(Player player) {
		System.out.print(player.getName() + " введите число: ");
		player.setNumber(scan.nextInt());
		scan.nextLine();
	}

	private boolean checkNumber(int playerNumber) {
		if(playerNumber > secretNumber) {
			System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер > " + playerNumber);
		} else if(playerNumber < secretNumber) {
			System.out.println("Введенное вами число МЕНЬШЕ того, что загадал компьютер > " + playerNumber);
		} else {
			return true;
		}
		return false;
	}

}