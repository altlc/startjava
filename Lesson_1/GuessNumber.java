public class GuessNumber {
	public static void main(String[] args) {
		byte secretNumber = 50;
		byte userNumber = 4;
		byte increment = 50;

		while (userNumber != secretNumber) {
			if (userNumber > secretNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер +++> " + userNumber);
				if (userNumber - increment > 0) {
					userNumber -= increment;
				}
				if (increment > 1) increment = (byte)(increment/2);
			}

			if (userNumber < secretNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер ---> " + userNumber);
				if (userNumber + increment <= 100) {
					userNumber += increment;
				}
				if (increment > 1) increment = (byte)(increment/2);
			}
		}
		System.out.println("Вы угадали! > " + secretNumber);
	}
}

