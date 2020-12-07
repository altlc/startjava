public class Calculator {
	private int firstNum;
	private char mathSign;
	private int secondNum;
	private int result;

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public int calculate() {
		switch(mathSign) {
			case '+' :
				result = firstNum + secondNum;
				break;
			case '-' :
				result = firstNum  - secondNum;
				break;
			case '*' :
				result = firstNum * secondNum;
				break;
			case '/' :
				result = firstNum / secondNum;
				break;
			case '^' :
				result = 1;
				for (int i = 1; i <= secondNum; i++) {
					result *= firstNum;
				}
				break;
			case '%' :
				result = firstNum % secondNum;
				break;
			default:
				System.out.println("Неподдерживаемая операция!");
		}
		return result;
	}
}