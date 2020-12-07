import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private byte secretNumber;
	private Player playerOne;
	private Player playerTwo;

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void Play() {
		byte currentPlayer;
		Random random = new Random();

		if(random.nextBoolean()){
			currentPlayer = 1;
		}else{
			currentPlayer = 2;
		}

		Scanner scan = new Scanner(System.in, "Cp866");
		byte userNumber;
		String currentPlayerName;

		secretNumber = (byte)random.nextInt(100);

		do {
			if(currentPlayer == 1)
			{
				currentPlayerName = playerOne.getName();
			} else {
				currentPlayerName = playerTwo.getName();
			}

			System.out.print(currentPlayerName + " введите число: ");
			userNumber = (byte)scan.nextInt();
			scan.nextLine();

			if (userNumber > secretNumber) {
				System.out.println("Введенное вами число БОЛЬШЕ того, что загадал компьютер > " + userNumber);
			} else if(userNumber < secretNumber) {
				System.out.println("Введенное вами число МЕНЬШЕ того, что загадал компьютер > " + userNumber);
			} else if(userNumber == secretNumber) {
				System.out.println(currentPlayerName + " угадал число " + secretNumber);
			}

			if(currentPlayer == 1)
			{
				currentPlayer = 2;
			} else {
				currentPlayer = 1;
			}
		}while(userNumber != secretNumber);
	}

}