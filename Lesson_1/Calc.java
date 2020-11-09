public class Calc {
	public static void main(String[] args) {
		int firstNum = 10;
		char mathSign = '%';
		int secondNum = 4;
		int result = 0;

		if (mathSign == '+') {
			result = firstNum + secondNum;
		} else if (mathSign == '-') {
			result = firstNum  - secondNum;
		} else if (mathSign == '*') {
			result = firstNum * secondNum;
		} else if (mathSign == '/') {
			result = firstNum / secondNum;
		} else if (mathSign == '^') {
			result = firstNum ^ secondNum;
		} else if (mathSign == '%') {
			result = firstNum % secondNum;
		}

		System.out.println("Result: " + result);
	}
}