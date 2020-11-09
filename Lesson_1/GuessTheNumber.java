public class GuessTheNumber {
	public static void main(String[] args) {
		byte secretNumber = 33;
		byte userNumber = 0;
		while (userNumber != secretNumber) {
			System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер > " + userNumber);
			userNumber++;
		}
		System.out.println("Вы угадали! > " + secretNumber);
	}
}

