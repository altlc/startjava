import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String oneMoreCalc;
		Calculator calc = new Calculator();

		do {
			Scanner scan = new Scanner(System.in, "Cp866");
			System.out.print("Введите первое число: ");
			calc.setFirstNum(scan.nextInt());
			scan.nextLine();

			System.out.print("Введите знак математической операции: ");
			calc.setMathSign(scan.next().charAt(0));

			System.out.print("Введите второе число: ");
			calc.setSecondNum(scan.nextInt());
			scan.nextLine();

			System.out.println("Результат: " + calc.calculate());

			do {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				oneMoreCalc = scan.nextLine();
			} while (!oneMoreCalc.equals("да") && !oneMoreCalc.equals("нет"));
		} while (oneMoreCalc.equals("да"));
	}
}