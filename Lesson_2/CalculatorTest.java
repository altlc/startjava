import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String continueWork;
		do {
			Scanner scan = new Scanner(System.in, "Cp866");
			System.out.print("Введите первое число: ");
			int firstNumber = scan.nextInt();
			scan.nextLine();

			System.out.print("Введите знак математической операции: ");
			char mathSign = scan.next().charAt(0);

			System.out.print("Введите второе число: ");
			int secondNumber = scan.nextInt();
			scan.nextLine();

			Calculator myCalc = new Calculator();
			myCalc.setFirstNum(firstNumber);
			myCalc.setSecondNum(secondNumber);
			myCalc.setMathSign(mathSign);
			System.out.println("Результат: " + myCalc.getResult());

			do {
				System.out.print("Хотите продолжить вычисления? [да/нет]: ");
				continueWork = scan.nextLine();
			} while (!continueWork.equals("да") && !continueWork.equals("нет"));
		} while (continueWork.equals("да"));
	}
}