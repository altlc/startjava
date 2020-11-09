public class Calc {
	public static void main(String[] args) {
		int firstNum = 2;
		char mathSign = '^';
		int secondNum = 3;
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
			result = 1;
			for (int i = 1; i <= secondNum; i++){
				result = result * firstNum;
			}
		} else if (mathSign == '%') {
			result = firstNum % secondNum;
		}

		System.out.println("Result: " + result);
	}
}